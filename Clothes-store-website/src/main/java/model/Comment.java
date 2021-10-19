package model;

public class Comment {
	private int rate;
	private	String content;
	private Customer customer;
	
	public Comment() {
		super();
	}
	public Comment(int rate, String content, Customter customer) {
		super();
		this.rate = rate;
		this.content = content;
		this.customer = customer;
	}
	public String getContent() {
		return content;
	}

	public Integer getRate() {
		return rate;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
