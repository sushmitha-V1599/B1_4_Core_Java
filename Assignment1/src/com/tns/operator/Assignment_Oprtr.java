package com.tns.operator;

import java.util.Scanner;

public class Assignment_Oprtr 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A and B value");
		int a=s.nextInt();
		int b=s.nextInt();
		a+=b;
		System.out.println(a);
		s.close();

	}

}
