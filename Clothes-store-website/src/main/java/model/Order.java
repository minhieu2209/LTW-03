package model;

public class Order {
	private int ID;
	private double totalPrice;
	private double tax;
	private String content;
	private Cart cart;
	 
	public Order(int iD, double totalPrice, double tax, String content, Cart cart) {
		super();
		ID = iD;
		this.totalPrice = totalPrice;
		this.tax = tax;
		this.content = content;
		this.cart = cart;
	}
	public String getContent() {
		return content;
	}
	public int getID() {
		return ID;
	}
	public double getTax() {
		return tax;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
}
