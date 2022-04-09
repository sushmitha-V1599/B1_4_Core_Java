package com.tns.interface1;

public interface Example1 
{
	void display();

}
class Main implements Example1
{
	public void display()
	{
		System.out.println("Hello,Whats up?");
	}
	public static void main(String[] args)
	{
		Main m=new Main();
		m.display();
	}
}