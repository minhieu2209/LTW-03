package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int amount;
	private double totalPrice;
	private List<Clothes> list;

	public Cart() {
		super();
		list = new ArrayList<Clothes>();
	}

	public Cart(int amount, double totalPrice, List<Clothes> list) {
		super();
		this.amount = amount;
		this.totalPrice = totalPrice;
		this.list = list;
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

	public List<Clothes> getList() {
		return list;
	}

	public void setList(List<Clothes> list) {
		this.list = list;
	}
}
