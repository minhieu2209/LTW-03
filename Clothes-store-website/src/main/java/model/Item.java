package model;

public class Item {
	private double price;
	private String barcode;
	private int quantity;
	private int popularity;
	private int discount;
	private String clothesCode;
	private Comment comment;
	private String img;
	private Clothes clothes;

	public Item() {
		super();
	}

	public Item(double price, String barcode, int quantity, int popularity, int discount, String clothesCode,
			Comment comment, Clothes clothes, String img) {
		super();
		this.price = price;
		this.barcode = barcode;
		this.quantity = quantity;
		this.popularity = popularity;
		this.discount = discount;
		this.clothesCode = clothesCode;
		this.comment = comment;
		this.clothes = clothes;
		this.img = img;
	}

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
	}

	public double getPrice() {
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

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Clothes getClothes() {
		return clothes;
	}

	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
