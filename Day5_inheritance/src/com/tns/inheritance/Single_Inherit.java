package com.tns.inheritance;

class Parent1
{
	void print()
	{
		System.out.println("Hello,This is Shiwani");
	}
}
class Child1 extends Parent1
{
	void display()
	{
		System.out.println("Single_Inheritance");
	}
}
class Single_Inherit
{

	public static void main(String[] args)
	{
		Child1 c=new Child1();
		c.display();
		c.print();
	}
}
