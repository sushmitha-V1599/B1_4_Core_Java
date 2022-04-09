package com.tns.interface1;
public interface Example2 
{
	 void display(); //protected will give error
	 void print();
}
class Main1 implements Example2
{
	public void display()//it should be public
	{
		System.out.println("Hello,Whats up?");
	}
	public void print()//public only
	{
		System.out.println("Howse the Session...)");
	}
	public static void main(String[] args)
	{
		Main1 m=new Main1();
		m.display();
		m.print();
	}
}