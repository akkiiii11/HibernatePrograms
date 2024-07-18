package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private int depId;
	private String deptName;
	private String deptLocation;
	private String deptHODName;
	
	public Department() {
		super();
	}

	public Department(int depId, String deptName, String deptLocation, String deptHODName) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
		this.deptHODName = deptHODName;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	public String getDeptHODName() {
		return deptHODName;
	}

	public void setDeptHODName(String deptHODName) {
		this.deptHODName = deptHODName;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + ", deptLocation=" + deptLocation
				+ ", deptHODName=" + deptHODName + "]";
	}
	
}
