package com.tns.multithread;

public class Example3 extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}
	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.start();
	}

}
