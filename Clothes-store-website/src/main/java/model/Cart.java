package model;

public class Cart {
	private int ID;
	private int amount;
	private double totalPrice;
	private Integer item;
	public int getAmount() {
		return amount;
	}
	public int getID() {
		return ID;
	}
	public Integer getItem() {
		return item;
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
	public void setItem(Integer item) {
		this.item = item;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
