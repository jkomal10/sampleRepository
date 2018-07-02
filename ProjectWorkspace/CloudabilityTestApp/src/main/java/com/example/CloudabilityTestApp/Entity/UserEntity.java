package com.example.CloudabilityTestApp.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UserEntity {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Column(name = "varUsersName")
	private String userName;
	
	@Column(name = "VarLanguage")
	private String language;
	
	@Column(name = "VarPassword")
	private String password;
	
	@Column(name = "VarEmail")
	private String email;
	
	@Column(name = "DateCreatedOn")
	private Date creationDate;
	
	@Column(name = "DateLastLogin")
	private Date lastLogin;
	
	@Column(name = "BoolActive")
	private Boolean boolActive;
	
	@Column(name = "VarFirstName")
	private String firstName;
	
	@Column(name = "VarLastName")
	private String lastName;
	
	@Column(name = "VarCompany")
	private String company;
	
	@Column(name="VarPhone")
	private String phone;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Boolean getBoolActive() {
		return boolActive;
	}

	public void setBoolActive(Boolean boolActive) {
		this.boolActive = boolActive;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
		
}
