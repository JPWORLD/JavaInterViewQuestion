package factory;

import mobile.Android;
import mobile.IOS;
import mobile.OS;
import mobile.Windows;

public class PhoneFactory {

	public static void main(String[] args) {
		OS obj = new IOS();
		OS obj1 = new Windows();
		OS obj2 = new Android();
		
		obj.spec();
		obj1.spec();
		obj2.spec();
		 
	}

}
