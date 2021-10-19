package model;

public class Clothes {
	private String clothesCode;
	private String origin;
	private String brand;
	private String description;
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
	}public void setClothesCode(String clothesCode) {
		this.clothesCode = clothesCode;
	}
	public void setDescription(String description) {
		this.description = description;
	}public void setOrigin(String origin) {
		this.origin = origin;
	}
}
