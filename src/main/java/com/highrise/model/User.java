package com.highrise.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

 
@Entity
@Table(name="master_user",uniqueConstraints={@UniqueConstraint(columnNames="USER_NAME"),@UniqueConstraint(columnNames="USER_TYPE")})
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userID;
	private String userName;
	private String userType;
	private int projectID;
	private int flatID;
	private int addressID;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "USER_ID", unique = true, nullable = false)
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	@Column(name = "USER_NAME", unique = false, nullable = false, length = 75)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "USER_TYPE", unique = false, nullable = false, length = 45)
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Column(name = "PROJECT_ID", unique = false, nullable = false, length = 11)
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	@Column(name = "FLAT_ID", unique = false, nullable = false, length = 11)
	public int getFlatID() {
		return flatID;
	}
	public void setFlatID(int flatID) {
		this.flatID = flatID;
	}
	@Column(name = "ADDRESS_ID", unique = false, nullable = false, length = 11)
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	

}
