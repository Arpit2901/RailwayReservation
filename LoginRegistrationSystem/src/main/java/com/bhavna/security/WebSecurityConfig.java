package com.bhavna.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.bhavna.appuser.AppUserService;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig {
	
	private AppUserService appUserService;
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		/*
		http.csrf().disable().authorizeHttpRequests() 
        .requestMatchers("/api/**").authenticated()
        .requestMatchers("api/registration**").permitAll()
        .requestMatchers("**").permitAll()
        .and().exceptionHandling().and().sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        */
		
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/registration/**").permitAll()
                .anyRequest()
                .authenticated().and()
                .formLogin();
        
        return http.build();
    }
	/*
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().requestMatchers("/api/registration");
	}
	*/
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setPasswordEncoder(bCryptPasswordEncoder);
		provider.setUserDetailsService(appUserService);
		return provider;
	}
}
