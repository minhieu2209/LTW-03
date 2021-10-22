package model;

import java.sql.Date;

public class Code {
		// TODO Auto-generated constructor stub
	private String idCode;
	private String noteString;
	private long totalBill;
	private long discount;
	private Date beginDate;
	private Date endDate;
		
	
	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Code(String idCode, String noteString, long totalBill, long discount, Date beginDate, Date endDate) {
		super();
		this.idCode = idCode;
		this.noteString = noteString;
		this.totalBill = totalBill;
		this.discount = discount;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getNoteString() {
		return noteString;
	}
	public void setNoteString(String noteString) {
		this.noteString = noteString;
	}
	public long getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(long totalBill) {
		this.totalBill = totalBill;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
		
}
