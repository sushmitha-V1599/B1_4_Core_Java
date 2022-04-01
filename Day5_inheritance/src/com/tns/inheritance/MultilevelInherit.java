package com.tns.inheritance;

class R1
{
	void print()
	{
		System.out.println("I like R1");
	}
}
class R3 extends R1
{
	void display()
	{
		System.out.println("I like R3");
		
	}
	void display2()
	{
		System.out.println("I dont like R3");
		
	}
}
class R5 extends R3
{
	void assign()
	{
		System.out.println("I like R5");
		
	}
}
public class MultilevelInherit 
{

	public static void main(String[] args)
	{
		R5 r=new R5();
		r.assign();
		r.display2();
		r.print();
	}

}
