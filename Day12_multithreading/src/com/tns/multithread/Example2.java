package com.tns.multithread;
class thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread Interupted");
	}
}
public class Example2 
{
	public static void main(String[] args) 
	{
		thread1 t=new thread1();
		t.start();
		t.interrupt();
	}

}
