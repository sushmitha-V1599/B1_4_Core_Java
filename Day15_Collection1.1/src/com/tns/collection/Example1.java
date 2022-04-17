package com.tns.collection;

import java.util.ArrayList;

public class Example1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList obj =new ArrayList<>();//<Integer>	
		obj.add(10);
		obj.add(20);
		obj.add("Shiv");
		obj.add('c');
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(3));
		System.out.println(obj.indexOf(10));
		System.out.println(obj.lastIndexOf(10));
		System.out.println(obj.get(3));
		obj.set(3,101);
		System.out.println(obj);
	}

}
