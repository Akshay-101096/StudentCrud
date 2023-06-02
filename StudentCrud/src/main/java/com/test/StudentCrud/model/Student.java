package com.test.StudentCrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	private String studName;
	private String studCity;
	private long studMob;
	private String studEmail;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudCity() {
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	public long getStudMob() {
		return studMob;
	}
	public void setStudMob(long studMob) {
		this.studMob = studMob;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + ", studMob="
				+ studMob + ", studEmail=" + studEmail + "]";
	}
	
	
}
