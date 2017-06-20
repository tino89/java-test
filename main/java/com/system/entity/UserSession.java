package com.system.entity;

public class UserSession {
	
	private String userName;
	private String lastName;
	
	@Override
	public String toString() {
		return "UserSession [userName=" + userName + ", lastName=" + lastName + "]";
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
