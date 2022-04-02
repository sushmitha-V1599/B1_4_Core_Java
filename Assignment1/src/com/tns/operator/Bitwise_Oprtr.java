package com.tns.operator;

import java.util.Scanner;

public class Bitwise_Oprtr 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//int res=(a & b);
		//int res=(a | b);
		//int res=(a ^ b);
		int res=a<<b;//leftshift
		//int res=a>>b;//rightshift
		System.out.println(res);
		s.close();

	}

}
