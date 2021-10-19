package model;

public class Order {
	private double totalPrice;
	private double tax;
	private String content;
	private Cart cart;

	public Order(double totalPrice, double tax, String content, Cart cart) {
		super();
		this.totalPrice = totalPrice;
		this.tax = tax;
		this.content = content;
		this.cart = cart;
	}

	public String getContent() {
		return content;
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
