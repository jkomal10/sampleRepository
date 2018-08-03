package com.report.CATToolApplication.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String ip_address;
	String username;
	String language;
	String password;
	String salt;
	String email;
	String activation_code;
	String forgotten_password_code;
	int forgotten_password_time;
	String remember_code;
	int created_on;
	int last_login;
	int active;
	String first_name;
	String last_name;
	String company;
	String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActivation_code() {
		return activation_code;
	}
	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}
	public String getForgotten_password_code() {
		return forgotten_password_code;
	}
	public void setForgotten_password_code(String forgotten_password_code) {
		this.forgotten_password_code = forgotten_password_code;
	}
	public int getForgotten_password_time() {
		return forgotten_password_time;
	}
	public void setForgotten_password_time(int forgotten_password_time) {
		this.forgotten_password_time = forgotten_password_time;
	}
	public String getRemember_code() {
		return remember_code;
	}
	public void setRemember_code(String remember_code) {
		this.remember_code = remember_code;
	}
	public int getCreated_on() {
		return created_on;
	}
	public void setCreated_on(int created_on) {
		this.created_on = created_on;
	}
	public int getLast_login() {
		return last_login;
	}
	public void setLast_login(int last_login) {
		this.last_login = last_login;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	@Override
	public String toString() {
		return "Users [id=" + id + ", ip_address=" + ip_address + ", username=" + username + ", language=" + language
				+ ", password=" + password + ", salt=" + salt + ", email=" + email + ", activation_code="
				+ activation_code + ", forgotten_password_code=" + forgotten_password_code
				+ ", forgotten_password_time=" + forgotten_password_time + ", remember_code=" + remember_code
				+ ", created_on=" + created_on + ", last_login=" + last_login + ", active=" + active + ", first_name="
				+ first_name + ", last_name=" + last_name + ", company=" + company + ", phone=" + phone + "]";
	}
	public Users(int id, String ip_address, String username, String language, String password, String salt,
			String email, String activation_code, String forgotten_password_code, int forgotten_password_time,
			String remember_code, int created_on, int last_login, int active, String first_name, String last_name,
			String company, String phone) {
		super();
		this.id = id;
		this.ip_address = ip_address;
		this.username = username;
		this.language = language;
		this.password = password;
		this.salt = salt;
		this.email = email;
		this.activation_code = activation_code;
		this.forgotten_password_code = forgotten_password_code;
		this.forgotten_password_time = forgotten_password_time;
		this.remember_code = remember_code;
		this.created_on = created_on;
		this.last_login = last_login;
		this.active = active;
		this.first_name = first_name;
		this.last_name = last_name;
		this.company = company;
		this.phone = phone;
	}
	public Users() {
		super();
		
	}

	
	
}
