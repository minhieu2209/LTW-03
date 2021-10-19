package model;

public class Item {
	private double price;
	private String barcode;
	private int quantity;
	private int popularity;
	private int discount;
	private String clothesCode;
	public String getBarcode() {
		return barcode;
	}
	public String getClothesCode() {
		return clothesCode;
	}
	public int getDiscount() {
		return discount;
	}
	public int getPopularity() {
		return popularity;
	}public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public void setClothesCode(String clothesCode) {
		this.clothesCode = clothesCode;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
