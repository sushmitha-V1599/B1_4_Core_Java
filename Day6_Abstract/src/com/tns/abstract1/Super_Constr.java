package com.tns.abstract1;
class Animal21
{  
	Animal21()
	{	
		System.out.println("animal is created");
	}  
}  
class Dog extends Animal21
{  
	Dog()
	{  
		super();  
		System.out.println("dog is created");
	}
}  
public class Super_Constr
{  
	public static void main(String[] args)
	{  
		Dog d=new Dog();
	}
}  
