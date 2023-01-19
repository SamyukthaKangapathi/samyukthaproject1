package com.employee.springboot.demo;

public class Employee {

	private String name;
	private String eid;
	private String dept;
	private String mobile;
	private String email;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String name, String eid, String dept, String mobile, String email, String address) {
		super();
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", dept=" + dept + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + "]";
	}
	
}