package top11questions;

public class PreIncrementPostIncrementWithStaticVariable {

	static int a = 1111;
	
	static {
		a = a-- - --a;
	}
	{
		a = a++ + ++a;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);//output is : 2 
	}

}
