package com.mobiletrackersystem.dto;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MapLocationDto {
	private double latitude;
	private double longitude;
	private int cId;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	

}
