package com.oops.inheritance;

public class Device {

	public int deviceId;
	public String status;

	Device(int deviceId, String status) {

		this.deviceId = deviceId;
		this.status = status;
	}

	void displayStatusDevice() {

		System.out.println("The device id is " + deviceId);
		System.out.println("The stsus is " + status);
	}

}
