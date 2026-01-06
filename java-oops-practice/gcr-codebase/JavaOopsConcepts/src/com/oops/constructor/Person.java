package com.oops.constructor;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(Person p1){
		this.name = p1.name;
		this.age = p1.age;
	}
	
	public void show(){
		System.out.println("Name is: " + this.name);
		System.out.println("Age is: " + this.age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Raj", 18);
		p1.show();
		Person p2 = new Person(p1);
		p2.show();
		
		
	}

}
