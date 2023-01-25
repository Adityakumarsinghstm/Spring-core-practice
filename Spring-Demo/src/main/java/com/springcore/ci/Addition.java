package com.springcore.ci;

public class Addition {
	private int a;
	private int b;

	Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("This is double , double constructor");
	}

	Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("This is int , int constructor");
	}
	Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("This is String , String constructor");
	}

	public void doSum() {
		System.out.println("The sum is : - " + (this.a + this.b));
	}

}
