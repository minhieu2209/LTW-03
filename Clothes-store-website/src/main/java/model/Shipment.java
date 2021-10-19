package model;

public class Shipment {
	private int ID;
	private String shipmentMethod;
	private Address address;
	
	public Shipment() {
		super();
	}
	public Shipment(int iD, String shipmentMethod, Address address) {
		super();
		ID = iD;
		this.shipmentMethod = shipmentMethod;
		this.address = address;
	}
	public int getID() {
		return ID;
	}
	public String getShipmentMethod() {
		return shipmentMethod;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
