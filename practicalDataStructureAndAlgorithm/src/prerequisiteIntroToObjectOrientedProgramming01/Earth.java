package prerequisiteIntroToObjectOrientedProgramming01;

public class Earth {

	public static void main(String[] args) {
		Human tom;//instance variable 
		tom =new Human("tom", 25, 76,"Blue");//object variable
		
		tom.speak();
		//everytime the new object is created it refrence to a new memory location.
		
		Human joe = new Human("joe", 28, 68,"green");
		
		joe.speak();
	}

}
