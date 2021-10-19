package model;

import java.sql.Date;

public class CustomerMember extends Customer {
	private String card;
	
	
	public CustomerMember(String tel, Date dob, String email, Account account, Address address, FullName fullname) {
		super(tel, dob, email, account, address, fullname);
	}
	public CustomerMember(String tel, Date dob, String email, Account account, Address address, FullName fullname,
			String card) {
		super(tel, dob, email, account, address, fullname);
		this.card = card;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}
