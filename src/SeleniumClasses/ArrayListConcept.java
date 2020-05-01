package SeleniumClasses;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList <Object> ar = new ArrayList <Object>();
		
		//to add the values into the list
		
		ar.add(100);  //0
		ar.add("Tom");  //1
		ar.add(true);  //2
		ar.add('m');   //3
		
		System.out.println(ar.get(0));
		ar.remove(2);

		for (int k=0; k<ar.size(); k++)
		{
			System.out.println(ar.get(k));
		}
		
		//ArrayList with integer -- creating generic array
		
		ArrayList<Integer> marklist = new ArrayList<Integer>();
		marklist.add(50);
		marklist.add(60);
		marklist.add(30);
		
		System.out.println(marklist.size());
		
		//Creating a generic ArrayList of type Object -- we can add any type of data to this dynamic object ArrayList
		
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add("Sinduri");
		obj.add(31);
		obj.add('F');
		obj.add(true);	
		
		for(int z=0; z<obj.size();z++)
		{
			System.out.println(obj.get(z));
		}
	}

}
