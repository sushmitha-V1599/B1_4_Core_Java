package com.tns.polymorphism;

public class Example2 
{
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	void assign(float a,float b)
	{
		System.out.println("Area of Rectangle:"+(float)(a*b));
	}
	public static void main(String[] args)
	{
		Example1 e=new Example1();
		e.assign(5,10);
		e.assign(15f,10f);
	}
}