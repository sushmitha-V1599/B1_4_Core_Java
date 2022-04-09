package com.tns.polymorphism;

class Parent
{
	void method()
	{
		System.out.println("Parent");
	}
}
class Derived extends Parent
{
	void method()
	{
		System.out.println("Child");
	}
}
public class Example3
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.method();
		Derived d=new Derived();
		d.method();
	}

}
