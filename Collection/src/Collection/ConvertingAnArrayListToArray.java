package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingAnArrayListToArray {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Integer [] arr = new Integer[numbers.size()];
		arr = numbers.toArray(arr);
		List<Integer> list = Arrays.asList(arr);
		
		int sum = 0;
		for(int num:arr) {
			sum += num;
		}
		System.out.println("Sum =" + sum);
	}
	

}
