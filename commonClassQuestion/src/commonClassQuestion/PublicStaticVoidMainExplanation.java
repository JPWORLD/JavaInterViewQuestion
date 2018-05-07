package commonClassQuestion;

public class PublicStaticVoidMainExplanation {

	final static synchronized strictfp public void main(String...jpg) {
		System.out.println("Valid main method");
		// TODO Auto-generated method stub
/*if the class doesn't contain the main method it won't be checked at the compilation time 
 * At runtime, JVM is responsible to check these things.
 * At runtime if JVM is unable to find required main() method then we will get runtime 
 * exception saying NoSuchMethodError.main
 * 
 * Main method should be public
 * JVM can call main ... from anywhere .. so it should be public.
 * 
 * whenever JVM calls for the program to execute JVM looks for the main method.
 * we can change the main call .. but customization of JVM will be required.
 * 
 *  
 * Main method should be static 
 * 
 * main method is a class level object, without the existing of the object also JVM has 
 * to call this method. and main method is no where related to the object.	
 * 
 * 
 * Return type should be void 
 * 
 * main method won't return anything to JVM, that why its should be void.
 * 
 * (String[] args)
 * Command line arguments.
 * 
 * Changes which could be acceptable for the java main method arguments.
 * 
 * 			1. The order of the modifiers is not important that is instead of "public static" we can take "Static public" also.
 * 			2. Declaration of the String array arguments .. are valid.
 * 				main(String [] args)
 * 				main(String[] args)
 * 				main(String args[])
 * 
 * 			3. Instead of "args" we can take any valid java identifier.
 * 		
 * 			main(String[]args) ==> main(String...args)
 * 
 * 
 * 			#We can declare main() method with the following modifiers also.
 * 			
 * 				1. final
 * 				2. Syncronized
 * 				3. strictfp
 * 
 * 
 * 			
 */
	}

}
