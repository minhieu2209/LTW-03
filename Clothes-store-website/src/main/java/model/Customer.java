package model;

import java.sql.Date;

public class Customer {
	private String tel;
	private Date dob;
	private String email;
	private Account account;
	private Address address;
	private FullName fullname;
	

	public Customer(String tel, Date dob, String email, Account account, Address address, FullName fullname) {
		super();
		this.tel = tel;
		this.dob = dob;
		this.email = email;
		this.account = account;
		this.address = address;
		this.fullname = fullname;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public FullName getFullname() {
		return fullname;
	}
	public void setFullname(FullName fullname) {
		this.fullname = fullname;
	}
	
	
}

