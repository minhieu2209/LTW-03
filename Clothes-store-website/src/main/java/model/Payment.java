package model;

public class Payment {
	private String method;

	public Payment() {
		super();
	}

	public Payment(String method) {
		super();
		this.method = method;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
}
