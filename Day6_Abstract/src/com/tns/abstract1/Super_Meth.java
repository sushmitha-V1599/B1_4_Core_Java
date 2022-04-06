package com.tns.abstract1;
class Aa
{  
	void eat()
	{
		System.out.println("class A eat");
	}  
}  
class Bb extends A
{  
	public void eat()	
	{
		System.out.println("class B eat");
	}  
	void bark()	
	{
		System.out.println("bark");
	}  
	void work()
	{  
		super.eat();  
		bark();  
	}  
}  
class Super_Meth
{  
	public static void main(String args[])
	{  
		Bb b=new Bb();  
		b.work();  
	}
}  
