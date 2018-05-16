package Collection;

import java.util.List;
import java.util.Vector;
public class getSubListFromVector {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		vct.add("Click");
		System.out.println("Actual Vector"+ vct);
		List<String> list = vct.subList(2, 4);
		System.out.println("Sub List" + list);
	}
}
