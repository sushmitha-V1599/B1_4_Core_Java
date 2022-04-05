package com.tns.sample;
import java.util.Scanner;
public class Example1 
{

	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            
            System.out.println("Choose the operation you want to perform ");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.MODULUS");
            System.out.println("6.EXIT");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : "+mul);
                break;
          
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : "+div);
                break;
 
                case 5:
                int mod;               
                mod = x % y;
                System.out.println("Result : "+mod);
                break;
 
                case 6:
                System.exit(0);
                s.close();
            }  
        }
    }
}