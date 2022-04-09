package com.tns.polymorphism;

public class Ronald 
{
	String color;
	int speed;
	Ronald()
	{
		System.out.println("I wanna buy Ronald by 2025");
	}
	Ronald(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	public static void main(String[] args) 
	{
		Ronald r=new Ronald();
		Ronald r1=new Ronald("Blue",50);
		System.out.println(r1.color+" "+r1.speed);
	}

}
