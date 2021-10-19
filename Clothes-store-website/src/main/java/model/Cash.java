package model;

public class Cash extends Payment {
	private double cashTendered;

	public Cash() {
		super();
	}

	public Cash(double cashTendered) {
		super();
		this.cashTendered = cashTendered;
	}

	public double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(double cashTendered) {
		this.cashTendered = cashTendered;
	}

}
