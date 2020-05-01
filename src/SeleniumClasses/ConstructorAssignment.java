package SeleniumClasses;

import java.util.ArrayList;

public class ConstructorAssignment {

	String name;
	String country;
	String establishedDate;
	ArrayList <String> Courses;
	
	//default constructor
	public ConstructorAssignment() {
		
		System.out.println("Default Constructor is called");
	}	
	
	

	public ConstructorAssignment(String name, String country, String establishedDate, ArrayList<String> subjects) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.Courses = subjects;
		
		System.out.println(name + " " + Courses) ;
	}

	
	public ConstructorAssignment(String name, String country,String establishedDate) {
		
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		
		System.out.println(name + " " + country + " " + establishedDate);
	}



	public ConstructorAssignment(String name, String country) {
		this.name = name;
		this.country = country;
	}

 

	public static void main(String[] args) {
		
		
		ConstructorAssignment ca1 = new ConstructorAssignment("JNTU","INDIA");
		ConstructorAssignment ca2 = new ConstructorAssignment("GNITS","HYDERABAD","01/11/1988");
		
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("Maths");
		subjects.add("Physics");
		subjects.add("Chemistry");
		
		ConstructorAssignment ca3 = new ConstructorAssignment("CBIT","HYDERABAD","03/05/1985", subjects);		
		System.out.println(ca1.name);
		System.out.println(ca2.establishedDate);
		System.out.println(ca3.Courses);
				
	}

	
	}
