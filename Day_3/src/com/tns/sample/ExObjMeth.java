package com.tns.sample;

public class ExObjMeth
{
	String str;
	ExObjMeth(String s)
	{
		str=s;
	}
	void print()
	{
		System.out.println("This is "+str);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExObjMeth a=new ExObjMeth("Mercedes");
		ExObjMeth b=new ExObjMeth("Audi");
		ExObjMeth c=new ExObjMeth("BMW");
		a.print();
		b.print();
		c.print();
	}
}
