package com.tns.sample;

public class Fib_1 
{
	static void fib(int N)
	{
		int n1=0,n2=1,count=0;
		while(count<N) //iterates till count is N
		{
			System.out.println(n1+" ");
			int n3=n2+n1;
	    	//swapping
			n1=n2;
			n2=n3;
			count=count+1;
		}
	}
	public static void main(String[] args) 
	{
		int N=5;
		fib(N);
	}

}
