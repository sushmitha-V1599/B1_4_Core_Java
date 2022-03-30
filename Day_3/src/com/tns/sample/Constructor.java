package com.tns.sample;

public class Constructor
{
	String str;
	int a;
	Constructor()
	{
		str="Welcome";
		a=11; 
	}
	void display()
	{
		System.out.println(str+ " "+a);
	}
	public static void main(String[] args) 
	{
		Constructor c=new Constructor();
		c.display();
	}

}
