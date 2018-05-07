package top11questions;

public class OperatorTerms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 10++11--12++13--14++15;// corrent one will be
		//int i = 10+(+11)-(-12)+(+13)-(-14)+(+15);//check for the pre increment post increment andlook for the answer
			System.out.print(i);
	}

}


//result : compilation error.