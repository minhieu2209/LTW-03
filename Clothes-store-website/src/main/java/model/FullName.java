package model;

public class FullName {
	private int ID;
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public int getID() {
		return ID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
