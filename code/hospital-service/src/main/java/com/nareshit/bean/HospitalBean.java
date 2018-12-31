package com.nareshit.bean;

import java.io.Serializable;
import java.util.List;

public class HospitalBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int hospId;
	private String name;
	private String email;
	private String phone;
	private String fax;
	private  String status;
//setters and getters
	public int getHospId() {
		return hospId;
	}
	public void setHospId(int hospId) {
		this.hospId = hospId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
