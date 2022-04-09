package com.tns.polymorphism;
//Overloading
public class Example1 
{
	void assign(int a)
	{
		System.out.println("Area of square:"+(a*a));
	}
	void assign( float a,float b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	public static void main(String[] args)
	{
		Example1 e=new Example1();
		e.assign(5);
		e.assign(5,10);
	}
}
