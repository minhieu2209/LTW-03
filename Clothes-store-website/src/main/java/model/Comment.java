package model;

public class Comment {
	private int ID;
	private int rate;
	private	String content;
	private Customer customer;
	
	public Comment() {
		super();
	}
	public Comment(int iD, Integer rate, String content, Customter customer) {
		super();
		ID = iD;
		this.rate = rate;
		this.content = content;
		this.customer = customer;
	}
	public String getContent() {
		return content;
	}
	public int getID() {
		return ID;
	}
	public Integer getRate() {
		return rate;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Customter getCustomer() {
		return customer;
	}
	public void setCustomer(Customter customer) {
		this.customer = customer;
	}
}
