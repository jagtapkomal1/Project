package com.user;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private double mobNum;
	private String city;
	private String UserName;
	private String password;
	
	public User() {
		super();
	}
	public User(String firstName, String lastName, double mobNum, String city, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNum = mobNum;
		this.city = city;
		UserName = userName;
		this.password = password;
	}
	public User(int id, String firstName, String lastName, double mobNum, String city, String userName,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNum = mobNum;
		this.city = city;
		UserName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMobNum() {
		return mobNum;
	}
	public void setMobNum(double mobNum) {
		this.mobNum = mobNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
