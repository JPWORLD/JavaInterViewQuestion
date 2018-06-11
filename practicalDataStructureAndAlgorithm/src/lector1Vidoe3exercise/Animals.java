package lector1Vidoe3exercise;

public class Animals {
	private int age;
	private char gender;
	private String eyeColor;
	private String name;

	public Animals(String name, int age, char gender, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.eyeColor = eyeColor;
	}
	public void speak() {
		System.out.println("My name is "+name);
		System.out.println("I am " + gender);
		System.out.println("My eyeColor is " + eyeColor);
		System.out.println("I am "+ age + " years old");
	}
	public void eat() {
		System.out.println("Eating..");
	}
	public void fly() {
		System.out.println("flying..");
	}
	public void sleep() {
		System.out.println("Sleeping..");
	}
	
}
