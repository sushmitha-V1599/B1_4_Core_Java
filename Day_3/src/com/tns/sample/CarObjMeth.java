package com.tns.sample;
import java.io.*;
public class CarObjMeth 
{
	String brand,color;
	int wheels;
	public CarObjMeth(String brand,String color,int wheels)
	{
		this.brand=brand;
		this.color=color;
		this.wheels=wheels;
	}
	
	public static void main(String[] args) 
	{
		CarObjMeth m=new CarObjMeth("Mercedes","Black",4);
		CarObjMeth b=new CarObjMeth("BMW","White",4);
		CarObjMeth a=new CarObjMeth("Audi","Red",4);
		System.out.println("The Car "+m.brand+" "+"has"+m.color+" for its body.It has"+m.wheels+"wheels");
		System.out.println("The Car "+b.brand+" "+"has"+b.color+" for its body.It has"+b.wheels+"wheels");
		System.out.println("The Car "+a.brand+" "+"has"+a.color+" for its body.It has"+a.wheels+"wheels");
	}

}
