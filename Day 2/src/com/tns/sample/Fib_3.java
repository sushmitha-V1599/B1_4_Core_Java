package com.tns.sample;
//to avoid storing of fib nos.
public class Fib_3 
{
	static int fib(int N)
	{
		int f[]=new int[N+2];
		int i;
		f[0]=0;
		f[1]=1;
		for(i=2;i<=N;i++)
		{
			f[i]=f[i-1]+f[i-2];	
		}
		return f[N];
	}
	public static void main(String[] args) 
	{
		int N=5;
		for(int i=0;i<N;i++)
			System.out.println(fib(i)+" ");
	}
}
