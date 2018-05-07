package generalQuestion;

import java.util.Scanner;

public class CountOccurrences {
	static final int MAX_CHAR = 256;
	
	static void getOccuringChar(String str)
	{
		//Create an array of size 256 i.e ASCII_SIZE
		int count[] = new int[MAX_CHAR];
		int len = str.length();
		
		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		
		//Create an array of given String size
		char ch[] = new char[str.length()];
		for(int i = 0;  i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for(int j = 0; j<= i; j++) {
				//If any matches found
				if(str.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.print(" Number of Occurrence of " + str.charAt(i) + " is: "+ count[str.charAt(i)]+'\n');
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = "this is the test case";
		getOccuringChar(str);
	}

}

/*
 *  Number of Occurrence of h is: 2
* Number of Occurrence of i is: 2
 Number of Occurrence of s is: 4
 Number of Occurrence of   is: 4
 Number of Occurrence of e is: 3
 Number of Occurrence of c is: 1
 Number of Occurrence of a is: 1
*/
