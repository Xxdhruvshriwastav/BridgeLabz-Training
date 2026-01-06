package com.oops.constructor;

public class HotelBooking {

	private String guestName;
	private int roomTypes;
	private int nights;
	
	HotelBooking(){
		this.guestName = "John";
		this.roomTypes = 2;
		this.nights = 3;
	}
	
	HotelBooking(String guestName, int roomTypes, int nights){
		this.guestName = guestName;
		this.roomTypes = roomTypes;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking obj1){
		this.guestName = obj1.guestName;
		this.roomTypes = obj1.roomTypes;
		this.nights = obj1.nights;
	}
	
	public void show() {
		System.out.println("Guest Name: " + guestName);
		System.out.println("Room type is: " + roomTypes);
		System.out.println("Nights: " + nights);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelBooking obj1 = new HotelBooking();
		obj1.show();
		HotelBooking obj2 = new HotelBooking("Patrik", 1, 2);
		obj2.show();
		HotelBooking obj3 = new HotelBooking(obj2);
		obj3.show();
		
	}

}
