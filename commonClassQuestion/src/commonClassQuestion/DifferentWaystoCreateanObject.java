package commonClassQuestion;

public class DifferentWaystoCreateanObject {
		
		// What is an Object in Java ?
		  /*Ans : Any entity which has State and Behavior is known as Object, for example note, pen, bike, book etc.
		   *It can be either physical or logical.
		   *
		   * It should have two characteristic :-
		   * 
		   * 1. State 	: e.g : Lets take car as example car has name, color, engine etc.
		   * 2. Behavior : e.g : Behavior represents the functionality of that object. 
		   * With car you can drive, apply breaking, change gear etc.
		   * 
		   * #Different Ways to Create an Object in Java ?
		   * 
		   * 			1. Using new keyword
		   */
		String value = null;
		public DifferentWaystoCreateanObject(String value) 
		{
		this.value = value;
		   
		}
		public void display()
		{
			System.out.println("Welcome"+ value +"!!!");
		}
		public static void main(String[] args) {
			
			DifferentWaystoCreateanObject s1 = new DifferentWaystoCreateanObject("JavaInterviewPoint");
	        s1.display();

			}
		
		//    2 Using class.forName()
		
		public class Test 
		{
		    
		    {
		        System.out.println("Static block called");
		    }
		    public Test()
		    {
		        System.out.println("Inside Test class constructor");
		    }

		}
		}
	