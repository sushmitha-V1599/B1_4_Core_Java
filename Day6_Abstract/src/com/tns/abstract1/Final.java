package com.tns.abstract1;

class Example11// final class can't be inherited
{
	int a=50;//final value can't be modified.
	void display()//final method cannot be overide.it can be inherited.
	{
		a=50;
		System.out.println("Hello Students"+a);
	}
}
public class Final extends Example11
{
	void display()
	{
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		Final e=new Final();
		e.display();
	}
}
