package model;

public class Address {
	private int HomeNo;
	private String city;
	private String street;
	private String district;

	public Address(int homeNo, String city, String street, String district) {
		super();
		HomeNo = homeNo;
		this.city = city;
		this.street = street;
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public int getHomeNo() {
		return HomeNo;
	}


	public String getStreet() {
		return street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setHomeNo(int homeNo) {
		HomeNo = homeNo;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}
}
