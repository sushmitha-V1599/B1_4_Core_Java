package com.tns.multithread;
class Test
{
	public synchronized void Display()
	{
		System.out.println("Current thread"+Thread.currentThread());
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+ "i- "+i);
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class valueof implements Runnable
{
	Thread t;
	Test val;
	valueof(Test val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		val.Display();
	}
}
public class Example4 
{
	public static void main(String[] args) 
	{
		Test obj1=new Test();
		Test obj2=new Test();
		valueof t1=new valueof(obj1);
		valueof t2=new valueof(obj2);
		
	}

}
