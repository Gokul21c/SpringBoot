package com.nareshit.bean;

import java.io.Serializable;
import java.util.List;

public class DoctorBean  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCpassword() {
		return cpassword;
	}


	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String cpassword;
	private String mobile;
	private String status;
	
	private String userId;

	private String experience;
	
	private String role;
	
	private String hospId;
	
	public String getHospId() {
		return hospId;
	}


	public void setHospId(String hospId) {
		this.hospId = hospId;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public List<String> getSpecialization() {
		return specialization;
	}


	public void setSpecialization(List<String> specialization) {
		this.specialization = specialization;
	}


	private List<String> specialization;
	private String specialist;

	
	//setters and gettters
	
	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	
	
	
	
	

}
