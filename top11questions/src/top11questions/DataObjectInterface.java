package top11questions;

public class DataObjectInterface {
	
	interface Ifruit {
		public String TYPE="Apple";//	it will be part of fruit class. any data member created in the interface will be final 
	}								// public static final String TYPE = "Apple";
	class Fruit implements Ifruit{ // only static data member can be called by its class name 
		
	}
	
	class Ifruit1 {
		protected static String Name = "Apple"; //The field Name cannot be declared static in a non-static inner type, 
												//unless initialized with a constant expression
	}
	class Fruit1 extends Ifruit1 {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fruit.TYPE);//output will be : Apple 
		System.out.println(Fruit1.Name); // output will be : null
	}

}
