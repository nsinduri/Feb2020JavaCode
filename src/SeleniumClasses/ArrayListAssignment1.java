package SeleniumClasses;

import java.util.ArrayList;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList <String>();
		
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println(colors.get(0));
//		System.out.println(colors.get(1));
//		System.out.println(colors.get(2));
//		
		for(int k=0; k<colors.size();k++) {
			System.out.println(colors.get(k));
		}
		
		
		colors.add(0, "Pink");
		colors.add(colors.size(),"Violet");
		colors.add(2, "Indigo");
		
		
		for(int j=0; j<colors.size();j++) {
			System.out.println(colors.get(j));
		}

		if (colors.contains("Pink"))
		{
			System.out.println("Pink is found in the array");
		}
		
		for(int h=colors.size(); colors.size()<h; h--)		
		{
			System.out.println(colors.get(h));
		}
		}
			
	}
	
