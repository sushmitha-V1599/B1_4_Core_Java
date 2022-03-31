package com.tns.sample;

public class NonparaConstr
{
	String str;
	int a;
	NonparaConstr()
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
		NonparaConstr c=new NonparaConstr();
		c.display();
	}

}
