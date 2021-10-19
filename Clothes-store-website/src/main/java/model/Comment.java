package model;

public class Comment {
	private int ID;
	private Integer rate;
	private	String content;
	public String getContent() {
		return content;
	}
	public int getID() {
		return ID;
	}
	public Integer getRate() {
		return rate;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
}
