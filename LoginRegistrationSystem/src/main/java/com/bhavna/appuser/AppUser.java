package com.bhavna.appuser;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails {
	
	@SequenceGenerator(
			name="user_sequence",
			sequenceName="user_sequence",
			allocationSize=1
	)
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="user_sequence"
	)
	private Long id;
	private String userName;
	private String password;
	private String phone;
	private String email;
	private String sex;
	private String age;
	@Enumerated(EnumType.STRING)
	private AppUserRole appUserRole;
	private Boolean locked = false;
	private Boolean enabled = false;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		SimpleGrantedAuthority authority=new SimpleGrantedAuthority(appUserRole.name());
		return Collections.singletonList(authority);
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

	public AppUser(String userName, String password, String phone, String email, String sex, String age, AppUserRole appUserRole) {
		super();
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.sex = sex;
		this.age = age;
		this.appUserRole = appUserRole;
	}

}
