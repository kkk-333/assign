package com.bhushan.cal;

public class Calculator 
{
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Calculator() {
		super();
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
}
