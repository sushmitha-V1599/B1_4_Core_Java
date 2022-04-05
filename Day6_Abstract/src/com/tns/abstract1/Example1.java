package com.tns.abstract1;
abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("Vegetarian");
	}
}
class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("Non-Vegetarian");
	}
}
public class Example1 
{

	public static void main(String[] args) 
	{
		
		Herbivores h=new Herbivores();
		Carnivores c=new Carnivores();
		h.eat();
		c.eat();
	}

}
