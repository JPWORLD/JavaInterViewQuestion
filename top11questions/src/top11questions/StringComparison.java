package top11questions;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it can use both pool memory or the cache memory.
		//compiler keeps a track of pool memory or the cache memory.
		String one = "Random";//assigns the value to the cache 
		String two = "Random";//points the same memory location as one has the same value avilable in the cache
		String a = "check";
		String b = "ceck";
		String c = new String("user");// as a new object is getting created it intialize a new memory location.
		String d = "user";
		if(one == two) {//here its checking wheater it has the same memory location or not.
			System.out.println("one == two");
			
		}else {
			System.out.println("one != two");
		}
		if(a.equals(b)) {//.equals check for the value for the object
			System.out.println("user is correct");
		}
		else {
			System.out.print("the value of the string refrence is not equals");
		}
		if (c == d) {
			System.out.println("it has the same memory location");
		}
		else {
			System.out.println("it has different memory location as a new object is getting created.");
		}
	}

}
