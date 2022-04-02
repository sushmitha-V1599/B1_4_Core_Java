package com.tns.inheritance;

public class CellPhone 
{
	void message()
	{
		System.out.println("This is xyz");
	}
	void call()
	{
		System.out.println("Call from  xyz to ysss");
	}
}
class SamsungM21 extends CellPhone
{
	void facelock()
	{
		System.out.println("Modern facelock");
	}
}
class OnePlus extends CellPhone
{
	void games()
	{
		System.out.println("We love to play");
	}
}
class child
{
	public static void main(String[] args) 
	{
		CellPhone c=new CellPhone();
		OnePlus o=new OnePlus();
		c.message();
		c.call();
		o.games();

	}
}


