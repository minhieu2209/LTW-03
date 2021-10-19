package model;

public class Shipment {
	private int ID;
	private String shipmentMethod;
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
}
