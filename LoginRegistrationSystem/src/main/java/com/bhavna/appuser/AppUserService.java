package com.bhavna.appuser;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bhavna.registration.token.ConfirmationToken;
import com.bhavna.registration.token.ConfirmationTokenService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService{

	private final static String USER_NOT_FOUND_MSG="user with email %s not found";
	
	private AppUserRepository appUserRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	private ConfirmationTokenService confirmationTokenService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return appUserRepository.findByUserName(userName)
				.orElseThrow(()->new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, userName)));
	}
	
	public String signUpUser(AppUser appUser) {
		boolean userExists = appUserRepository.findByEmail(appUser.getEmail()).isPresent();
		
		if(userExists) {
			throw new IllegalStateException("email already taken");
		}
		
		String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());
		
		appUser.setPassword(encodedPassword);
		
		appUserRepository.save(appUser);
		
		String token=UUID.randomUUID().toString();
		
		ConfirmationToken confirmationToken = new ConfirmationToken(
			token,
			LocalDateTime.now(),
			LocalDateTime.now().plusMinutes(15),
			appUser
		);
		
		confirmationTokenService.saveConfirmationToken(confirmationToken);
		
		return token;
	}
	
	public int enableAppUser(String email) {
        return appUserRepository.enableAppUser(email);
    }

}
