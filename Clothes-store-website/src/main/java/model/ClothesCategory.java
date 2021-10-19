package model;

public class ClothesCategory {
	private int ID;
	private String type;
	private String gender;
	public String getGender() {
		return gender;
	}
	public int getID() {
		return ID;
	}
	public String getType() {
		return type;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setType(String type) {
		this.type = type;
	}
}
