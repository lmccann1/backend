package com.qa.individual.individual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String FirstName;
	String SecondName;
	int AccountNumber;


	public Users() { }

	public Users(Long id, String FirstName, String SecondName, Integer AccountNumber) {
	
		this.id = id;
		this.FirstName = FirstName;
		this.SecondName = SecondName;
		this.AccountNumber = AccountNumber;

}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
}
