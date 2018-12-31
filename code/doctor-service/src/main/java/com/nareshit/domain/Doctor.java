package com.nareshit.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="DOCTOR")
@PrimaryKeyJoinColumn(name="profile_id")
public class Doctor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uid")
	private int id;
	@Column(name="firstname")
	private String fname;
	@Column(name="lastname")
	private String lname;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConpassword() {
		return conpassword;
	}
	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Column(name="email")
	private String email;
	@Column(name="contact")
	private String mobile;
	@Column(name="pwd")
	private String password;
	@Column(name="cpwd")
	private String conpassword;
	@Column(name="status")
	private boolean status;
	
	private String experience;
	private String specialization;
	
	
	private String hospId;
	public String getHospId() {
		return hospId;
	}
	public void setHospId(String hospId) {
		this.hospId = hospId;
	}

		

}
