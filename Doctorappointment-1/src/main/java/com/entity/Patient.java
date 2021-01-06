package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String Pname;
	private String Page;
	private String BOB;
	private String Pemail;
	private String Pphone;
	private String file;
	@Column(length = 1000)
	private String Pdescription;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPage() {
		return Page;
	}
	public void setPage(String page) {
		Page = page;
	}
	public String getBOB() {
		return BOB;
	}
	public void setBOB(String bOB) {
		BOB = bOB;
	}
	public String getPemail() {
		return Pemail;
	}
	public void setPemail(String pemail) {
		Pemail = pemail;
	}
	public String getPphone() {
		return Pphone;
	}
	public void setPphone(String pphone) {
		Pphone = pphone;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getPdescription() {
		return Pdescription;
	}
	public void setPdescription(String pdescription) {
		Pdescription = pdescription;
	}
	@Override
	public String toString() {
		return "Patient [cId=" + cId + ", Pname=" + Pname + ", Page=" + Page + ", BOB=" + BOB + ", Pemail=" + Pemail
				+ ", Pphone=" + Pphone + ", file=" + file + ", Pdescription=" + Pdescription + "]";
	}
	
	
	
	
	
	
}
