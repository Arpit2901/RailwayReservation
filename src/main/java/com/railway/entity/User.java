package com.railway.entity;

public class User {

	private String name;
	private String userId;
	private String contact;
	private int age;
	private char gender;
	private String password;
	public User(String name, String userId, String contact, int age, char gender, String password) {
		super();
		this.name = name;
		this.userId = userId;
		this.contact = contact;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", contact=" + contact + ", age=" + age + ", gender="
				+ gender + ", password=" + password + "]";
	}
	
	
}
