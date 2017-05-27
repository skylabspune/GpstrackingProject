package com.mobiletrackersystem.dto;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")

public class CarDto {

	private int carId;
	private String username;
	private String password;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
