package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratethroughCollectionObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("is");
		myList.add("best");
		myList.add("language");
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()) {
			 System.out.println(itr.next());
			}
		}

}
