package Collection;


import java.util.Enumeration;
import java.util.Vector;
public class readAllElementsInVectorByUsingEnumeration {

	public static void main(String[] args) {
		Vector<String> vct = new Vector<String>();
			 //adding elements to the end
		vct.add("tum");
		vct.add("ghar");
		vct.add("jao");
		Enumeration<String> enm = vct.elements();
		while(enm.hasMoreElements()){
			System.out.println(enm.nextElement());
		}
	}
}
