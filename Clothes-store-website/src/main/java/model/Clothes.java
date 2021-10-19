package model;

public class Clothes {
	private String clothesCode;
	private String origin;
	private String brand;
	private String description;
	private ClothesCategory category;

	public Clothes() {
		super();
	}

	public Clothes(String clothesCode, String origin, String brand, String description, ClothesCategory category) {
		super();
		this.clothesCode = clothesCode;
		this.origin = origin;
		this.brand = brand;
		this.description = description;
		this.category = category;
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
}
