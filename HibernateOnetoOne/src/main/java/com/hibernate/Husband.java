package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "husband_details")
public class Husband {
	
	@Id
	private int hid;
	
	@Column(name = "husband_name")
	private String hNAme;
	
	@OneToOne
	private Wife wife;

	public Husband() {
		super();
	}

	public Husband(int hid, String hNAme, Wife wife) {
		super();
		this.hid = hid;
		this.hNAme = hNAme;
		this.wife = wife;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String gethNAme() {
		return hNAme;
	}

	public void sethNAme(String hNAme) {
		this.hNAme = hNAme;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [hid=" + hid + ", hNAme=" + hNAme + ", wife=" + wife + "]";
	}
	
	

}
