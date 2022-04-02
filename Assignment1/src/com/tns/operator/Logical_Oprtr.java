package com.tns.operator;

import java.util.Scanner;

public class Logical_Oprtr 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=(a>b && b<8);
		//boolean res=(a>b || b<8);
		//boolean res=!(a>b);
		System.out.println(res);
		s.close();

	}

}
