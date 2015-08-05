package com.saran;

import javax.persistence.Entity;

import java.io.*;

import javax.persistence.Cacheable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

import org.hibernate.annotations.*;

import javax.persistence.Table;

import org.hibernate.cache.*;



@Entity(name="FLC")
public class UserDetails22 {//implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	
	
	@Column(name="USER_NAME")
	private String userName;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	

}
