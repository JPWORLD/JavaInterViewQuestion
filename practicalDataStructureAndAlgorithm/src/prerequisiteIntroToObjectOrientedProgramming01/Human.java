package prerequisiteIntroToObjectOrientedProgramming01;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;//this variable points to the current object 
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	public void speak() {
		System.out.println("Hello My name is "+name);
		System.out.println("I am "+age+" years old");
		System.out.println("I am "+ heightInInches+" inches tall");
		System.out.println("My eye color is "+eyeColor+'\n');
	}
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working...");
	}
}
