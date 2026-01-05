package com.inheritance;

public class Thermostat extends Device {

	public String temperatureSetting;

	Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}

	void displayStatusThermostat() {

		// override
		// Method Overriding

		super.displayStatusDevice();
		System.out.println("The temprature is " + temperatureSetting);

	}
}
