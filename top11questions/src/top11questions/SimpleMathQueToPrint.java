package top11questions;

public class SimpleMathQueToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//OUTPUT WILL BE : 0.0 
			
			long longWithL = 1000*60*60*24*365L;
			long longWithoutL = 1000*60*60*24*365;
			System.out.println(longWithL);//output 31536000000 datatype declaration is helpful here 
			System.out.println(longWithoutL); //output 1471228928 integer is turnicating the actual value resulting wrong output.
			
			
	}

}
