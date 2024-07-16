package com.Overriding;

public class Overriding {
	public static void main(String[] args) {
		//Creating Both classes object then with the help of these 
		//calling the functions
		Dog d=new Dog();
		Animal a=new Animal();
				
		d.eat();
		a.eat();
		//now  polymorphism here animal is reference pointing to Dog object
		Animal animal=new Dog();
		animal.eat();
		// to call the base class method we need to get help of dog referance
		((Dog)animal).eatAsAnimal();
	}
}

// craete a base class first 
class Animal {
	void eat() {
		System.out.println("eat() method of base class");
		System.out.println("Animal Is Eating");
	}
}

// creating driver class & extenidng to base class
class Dog extends Animal {
	void eat() {
		System.out.println("eat () method of derived class");
		System.out.println("Dog is eating");
	}

	void eatAsAnimal() {
		super.eat();
	}
}