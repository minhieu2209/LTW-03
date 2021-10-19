package model;

public class Shipment {
	private String shipmentMethod;
	private Address address;

	public Shipment() {
		super();
	}

	public Shipment(String shipmentMethod, Address address) {
		super();
		this.shipmentMethod = shipmentMethod;
		this.address = address;
	}

	public String getShipmentMethod() {
		return shipmentMethod;
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
