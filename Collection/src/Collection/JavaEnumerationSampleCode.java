package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class JavaEnumerationSampleCode {

	public static void main(String[] a) {
			Vector<String> lang = new Vector<String>();
			Enumeration<String> en = null;
			lang.add("JAVA");
			lang.add("is");
			lang.add("good");
			lang.add("language");
			en = lang.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
		}
	}
