package org.javacampus.corelogic;

public class OverloadingTest {

	public static void main(String[] args) {
		Test t = new Test();
		t.apple(10, "MyApple");
		t.apple("YourApple", 5);
		System.out.println(t.apple(10, "MyApple"));
		System.out.println(t.apple("YourApple", 5));	}
}

class Test{
	public int apple(int a, String s) {

	return a;
	}

	public String apple( String s, int a) {

	return s;
}
/*	public String apple(int a, String s) {

	return s;
	}*/
}