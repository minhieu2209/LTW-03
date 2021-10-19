package model;

public class Check extends Payment {
	private String name;
	private String bankID;

	public Check() {
		super();
	}

	public Check(String name, String bankID) {
		super();
		this.name = name;
		this.bankID = bankID;
	}

	public String getBankID() {
		return bankID;
	}

	public String getName() {
		return name;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public void setName(String name) {
		this.name = name;
	}
}
