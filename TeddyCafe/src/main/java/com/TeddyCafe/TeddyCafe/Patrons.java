package com.TeddyCafe.TeddyCafe;

public class Patrons {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String password;
	private int favNumber;
	private String emailList;
	
	public Patrons() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFavNumber() {
		return favNumber;
	}

	public void setFavNumber(int favNumber) {
		this.favNumber = favNumber;
	}

	public String getEmailList() {
		return emailList;
	}

	public void setEmailList(String emailList) {
		this.emailList = emailList;
	}

}
