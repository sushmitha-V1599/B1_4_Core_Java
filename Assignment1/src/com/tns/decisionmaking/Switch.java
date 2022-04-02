package com.tns.decisionmaking;

import java.util.Scanner;

public class Switch 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//char a=s.next().charAt(0);
		//String a=s.nextLine();
		switch(a)
		{
		case 1://'A'or 'a'://'String':
			System.out.println("Sushu");
			break;
		case 2:
			System.out.println("Sush");
			break;
		case 3:
			System.out.println("Sushma");
			break;
		case 4:
			System.out.println("Sushmitha");
			break;
		default:
			System.out.println("Invalid Input");
		s.close();
				
		}

	}

}
