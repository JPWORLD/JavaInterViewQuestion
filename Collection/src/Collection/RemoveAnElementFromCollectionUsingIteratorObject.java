package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RemoveAnElementFromCollectionUsingIteratorObject {

	public static void main(String[] args) {
		
		String removeElem = "Perl";
		List<String> myList = new ArrayList<String>();
		myList.add("java");
		myList.add("is");
		myList.add("new");
		myList.add("Oracle");
		myList.add("Perl");
		System.out.println("Before remove:");
		System.out.println(myList);
		Iterator<String> itr =  myList.iterator();
		while(itr.hasNext()) {
			if(removeElem.equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("After remove:");
		System.out.println(myList);
	}

}
