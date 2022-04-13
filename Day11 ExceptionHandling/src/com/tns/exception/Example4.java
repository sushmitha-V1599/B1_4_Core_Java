package com.tns.exception;

public class Example4 
{
	static void display(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException ("Not Eligible");
		}
	}
	public static void main(String[] args) 
	{
		display(16,45);
		System.out.println("Exception Handled");
	}

}
