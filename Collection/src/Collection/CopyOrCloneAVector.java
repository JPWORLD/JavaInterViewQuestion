package Collection;

import java.util.Vector;

public class CopyOrCloneAVector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		 //adding elements to the end
		vct.add("First");
		vct.add("Two");
		vct.add("Three");
		System.out.println("Actual vector:"+vct);
		@SuppressWarnings("unchecked")
		Vector<String> copy = (Vector<String>) vct.clone();
		System.out.println("Cloned vector:"+copy);
	}
}
