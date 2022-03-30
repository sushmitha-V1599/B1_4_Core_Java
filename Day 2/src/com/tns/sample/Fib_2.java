package com.tns.sample;

public class Fib_2 
{
	static int fib(int N)
	{
		if(N<=1)//base case
			return N;
		return fib(N-1)+fib(N-2); //Recursive call
	}
	public static void main(String[] args) 
	{
		int N=5;
		for(int i=0;i<N;i++)
		{
			System.out.println(fib(i) +" ");
		}
	}

}
