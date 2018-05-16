package Collection;

import java.util.Vector;

public class deleteAllElementsFromMyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("third");
		vct.add("Radom");
		System.out.println("Actual Vector"+vct);
		vct.clear();
		System.out.println("After clear vector:" + vct);
	}
}
