package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddAllElementsOfaListToVector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual Vector"+vct);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		vct.addAll(list);
		System.out.println("After Copy:"+vct);
	}
}
