package top11questions;

public class ThreadCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final class Constants { public static String name = "PI"; //error
		//The field name cannot be declared static in a non-static inner type, unless initialized with a constant expression
	}
		Thread thread = new Thread (new Runnable() {
			
			@override 
			public void run () {
				System.out.println(Constants.name);
			}
			});
			thread.start();
		}

}
