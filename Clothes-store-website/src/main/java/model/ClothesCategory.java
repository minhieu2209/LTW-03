package model;

public class ClothesCategory {
	private String type;
	private String gender;
	
	
	public ClothesCategory() {
		super();
	}

	public ClothesCategory(String type, String gender) {
		super();
		this.type = type;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}
	
	public String getType() {
		return type;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
