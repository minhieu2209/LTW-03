package model;

public class Payment {
	private int ID;
	private String method;
	
	public Payment() {
		super();
	}
	public Payment(int iD, String method) {
		super();
		ID = iD;
		this.method = method;
	}
	public int getID() {
		return ID;
	}
	public String getMethod() {
		return method;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setMethod(String method) {
		this.method = method;
	}
}
