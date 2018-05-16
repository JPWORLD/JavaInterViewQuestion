package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JavaListIteratorSampleCode {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		ListIterator<Integer> Litr = null;
		li.add(23);
		li.add(34);
		li.add(45);
		li.add(75);
		li.add(91);
		Litr = li.listIterator();
		System.out.println("Elements in forward directiton");
		while(Litr.hasNext()){
			System.out.println(Litr.next());
		}
		System.out.println("Elements in backward directiton");
		while(Litr.hasPrevious()) {
			System.out.println(Litr.previous());
		}
	}
}
