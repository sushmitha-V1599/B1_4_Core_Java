package com.tns.sample;
public class parameterized
{
		String str;
		int a;
		parameterized(String st,int x)
		{
			str=st;
			a=x;
		}
		void display()
		{
			System.out.println(str+" "+a);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			parameterized c=new parameterized("Sushu",11);
			c.display();
		}

	}
