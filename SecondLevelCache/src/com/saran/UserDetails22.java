package com.saran;


import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

 



 
@Entity (name="SLC") 
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

 
public class UserDetails22 {
	@Id @GeneratedValue
	@Column(name="USER_ID")
	private int userId;
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
	@Column(name="USER_NAME")
	private String userName;

}
