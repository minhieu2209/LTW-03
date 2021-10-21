package model;

public class Clothes {
	private String clothesCode;
	private String origin;
	private String brand;
	private String description;
	private ClothesCategory category;
	private double price;
	private String barcode;
	private int popularity;
	private int discount;
	private int color;

	public Clothes() {
		super();
	}
	
	public Clothes(String clothesCode, String origin, String brand, String description, ClothesCategory category,
			double price, String barcode, int popularity, int discount, int color) {
		super();
		this.clothesCode = clothesCode;
		this.origin = origin;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.price = price;
		this.barcode = barcode;
		this.popularity = popularity;
		this.discount = discount;
		this.color = color;
	}



	public String getBrand() {
		return brand;
	}

	public String getClothesCode() {
		return clothesCode;
	}

	public String getDescription() {
		return description;
	}

	public String getOrigin() {
		return origin;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setClothesCode(String clothesCode) {
		this.clothesCode = clothesCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public ClothesCategory getCategory() {
		return category;
	}

	public void setCategory(ClothesCategory category) {
		this.category = category;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getBarcode() {
		return barcode;
	}



	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}



	public int getPopularity() {
		return popularity;
	}



	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}



	public int getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	public int getColor() {
		return color;
	}



	public void setColor(int color) {
		this.color = color;
	}
}
