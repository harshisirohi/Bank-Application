package com.cg.bs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserTable {
	@Id
	@Column(name="user_id")
	private int user_id;
	private String login_password, secret_question, Transaction_password, lock_status, Pancard, role;
	
	
	public UserTable() {
		super();
	}

	public UserTable(int user_id, String login_password,
			String secret_question, String transaction_password,
			String lock_status, String pancard, String role) {
		super();
		this.user_id = user_id;
		this.login_password = login_password;
		this.secret_question = secret_question;
		Transaction_password = transaction_password;
		this.lock_status = lock_status;
		Pancard = pancard;
		this.role = role;
	}





	@Override
	public String toString() {
		return "UserTable [user_id=" + user_id + ", login_password="
				+ login_password + ", secret_question=" + secret_question
				+ ", Transaction_password=" + Transaction_password
				+ ", lock_status=" + lock_status + ", Pancard=" + Pancard
				+ ", role=" + role + "]";
	}





	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getLogin_password() {
		return login_password;
	}


	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}


	public String getSecret_question() {
		return secret_question;
	}


	public void setSecret_question(String secret_question) {
		this.secret_question = secret_question;
	}


	public String getTransaction_password() {
		return Transaction_password;
	}


	public void setTransaction_password(String transaction_password) {
		Transaction_password = transaction_password;
	}


	public String getLock_status() {
		return lock_status;
	}


	public void setLock_status(String lock_status) {
		this.lock_status = lock_status;
	}


	public String getPancard() {
		return Pancard;
	}


	public void setPancard(String pancard) {
		Pancard = pancard;
	}

	

	
	

}
