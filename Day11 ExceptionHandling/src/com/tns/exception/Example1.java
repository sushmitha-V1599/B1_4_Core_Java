package com.tns.exception;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=5;
		try 
		{
			int res=a/b;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handling in java");
		}
		s.close();

	}

}
