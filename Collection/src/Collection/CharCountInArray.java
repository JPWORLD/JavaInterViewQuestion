package Collection;

import java.util.HashMap;
import java.util.Map;

public class CharCountInArray {

	public static void main(String[] args) {
		char [] arr;
		arr = new char [] {'a', 'b', 'c', 'a', 'b', 'c', 'd','a', 'b', 'c', 'a', 'b', 'c', 'd','a', 'b', 'c', 'a', 'b', 'c', 'd','a', 'b', 'c', 'a', 'b', 'c', 'd','a', 'b', 'c', 'a', 'b', 'c', 'd'};
		  Map<Character, Integer> m = new HashMap<Character, Integer>();
		  for(int i = 0; i< arr.length; i++) {
			  if(m.containsKey(arr[i])) {
				  m.put(arr[i], m.get(arr[i])+1);
			  }
			  else {
				  m.put(arr[i], 1);
			  }
		  }
		  System.out.println(m);
	}

}
