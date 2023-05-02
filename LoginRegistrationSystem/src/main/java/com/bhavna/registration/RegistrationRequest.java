package com.bhavna.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
	private String userName;
	private String password;
	private String phone;
	private String email;
	private String sex;
	private String age;
	
}
