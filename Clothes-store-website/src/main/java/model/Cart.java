package model;

public class Cart {
	private int amount;
	private double totalPrice;
	private Item item;

	public Cart() {
		super();
	}
	public Cart( int amount, double totalPrice, Item item) {
		super();
		this.amount = amount;
		this.totalPrice = totalPrice;
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
