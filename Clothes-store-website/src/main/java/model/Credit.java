package model;

import java.sql.Date;

public class Credit extends Payment{
	private int number;
	private String type;
	private Date exdate;
	public Date getExdate() {
		return exdate;
	}
	public int getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}
	public void setExdate(Date exdate) {
		this.exdate = exdate;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
}
