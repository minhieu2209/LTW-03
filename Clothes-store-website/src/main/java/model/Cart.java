package model;

public class Cart {
	private int ID;
	private int amount;
	private double totalPrice;
	private Item item;

	public Cart() {
		super();
	}
	public Cart(int iD, int amount, double totalPrice, Item item) {
		super();
		ID = iD;
		this.amount = amount;
		this.totalPrice = totalPrice;
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public int getID() {
		return ID;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
