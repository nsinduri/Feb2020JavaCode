package SeleniumClasses;

import java.util.ArrayList;

public class ConstructorAssignment2 {

	String browserName;
	String vendorName;
	int currentVersion;
	ArrayList <String> plugins;
	
	
	
	public ConstructorAssignment2() {
		System.out.println("Default constructor");
	}

	
	public ConstructorAssignment2(String browserName, String vendorName, int currentVersion, ArrayList<String> plugins) 
	{
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}



	public static void main(String[] args) {
		
		ArrayList<String> plugins = new ArrayList<String>();
		
		plugins.add("Adobe");
		plugins.add("FlashPlayer");
		plugins.add("VLC");
		
		ConstructorAssignment2 ca1 = new ConstructorAssignment2("Chrome","Google",1,plugins);
		
		System.out.println(ca1.plugins.get(0));
		
		System.out.println(ca1.browserName + " " + ca1.currentVersion + " " + ca1.vendorName + " "  + ca1.plugins);
		
	}

}
