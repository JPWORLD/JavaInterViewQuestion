package top11questions;

public class WrapperClass {
	
	
	//Wrapper class : When you wrap up your primitive data type to create object called Wrapper classes.
	
	/*
	  	Primitive type	Wrapper class
		boolean			Boolean
		byte			Byte
		char			Character
		float			Float
		int				Integer
		long			Long
		short			Short
		double			Double
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = 127;//referring to the same memory location 
		Integer i2 = 127;//referring to the same memory location
		
		System.out.println(i1 == i2);//output is true
		
		Integer i3 = 128;//128 is beyond the limit the cache pool is not getting created .. its creating the new object everytime
		Integer i4 = 128;//its initialized... that is only in the case of integer.
		 
		System.out.println(i3 == i4);//output is false
		
	}

}
