package com.tns.abstract1;
class A
{
	String name="Sushu";

	public void eat() 
	{
		// TODO Auto-generated method stub
		
	}
}
class B extends A
{
	String name="Sushmitha";
	void print()
	{
		System.out.println("Hai,my name is:"+name);
		System.out.println("My nickname is:"+super.name);
	}
}
public class Super 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();

	}

}
