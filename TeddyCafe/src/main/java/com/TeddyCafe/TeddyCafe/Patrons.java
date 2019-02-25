
package com.TeddyCafe.TeddyCafe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user") //Name of SQL table
public class Patrons {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="favnumber")
	private int favNumber;
	@Column(name="emaillist")
	private String emailList;
	
	public Patrons() {
		
	}

//	public Patrons(String firstName, String lastName, String password, int favNumber, String emailList) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.password = password;
//		this.favNumber = favNumber;
//		this.emailList = emailList;
//	}

	public Patrons(Long id, String firstName, String lastName, String password, int favNumber, String emailList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.favNumber = favNumber;
		this.emailList = emailList;
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

