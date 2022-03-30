package com.tns.sample;
public class Nonparameterized
{
	String str;
	int a;
	Nonparameterized()
	{
		str="Sushu";
		a=11;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args)
	{
		Nonparameterized c=new Nonparameterized();
		c.display();
	}

}
