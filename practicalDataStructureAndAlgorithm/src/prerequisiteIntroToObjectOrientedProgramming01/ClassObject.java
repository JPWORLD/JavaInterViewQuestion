package prerequisiteIntroToObjectOrientedProgramming01;

public class ClassObject {
	//Objects do all the work
	//particular behavior and functions
	//Class carry the information how to create gonna behave 
	//A Class is a specification of the blue print of the object
	//constructors intended to provide instruction that how the object of that class should be constructed 
	//Objects Exists During Application Runtime
	//JVM looks for the main method 
	
	//Momory Area
	
	//Stack
		// hit the run button : main method get invoked by stack memory area
			//local variable is also gets counted in stack
			//
	//Heap
		//Objects resides in the Heap 
			car myCar;//Reference variable 
			myCar = new Car();//object variable 
			
	//Garbage Collection
		//whenever the new object is created the another refrence object will be
		//wiped off
		//always Handles the Heap Area.
	
	//Instance Variable
		//A variable belongs to a particular instance.
		// it is use to maintaine the instance of that particular variable object
			Car myCar = new Car(); 
	
	
	
	
}

//java class file structure 
//package
		//java class file
			//java class file specification
				//Methods(Behaviors...)(contain objects)