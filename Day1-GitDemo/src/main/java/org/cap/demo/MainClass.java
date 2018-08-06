package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass class1 = new SalesClass();
		MoneyClass class2 = new MoneyClass();
		System.out.println("Hello World");
		class1.show();
		class2.details();
		greet();
	}
	public static void greet() {
		System.out.println("Hello");
		System.out.println("Welcome");
	}
}
