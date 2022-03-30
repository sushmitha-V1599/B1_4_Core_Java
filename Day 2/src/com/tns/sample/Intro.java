package com.tns.sample;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		float b=10.5f;
		double c=10;
		String d="sushu";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=s.nextLine();
		System.out.println(str);
		System.out.println("Enter the name");
		String str1=s.next();
		System.out.println(str1);
		
		// nextcharAt
		//nextfloat
		//nextint
		System.out.println("Enter the name");
		char z=s.next().charAt(0);//index values
		System.out.println(z);
		s.close();
	}

}
