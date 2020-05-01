package SeleniumClasses;

public class carsObjectConcept {

	String Brand;
	int year_make;
	String Car_name;
	boolean Fuel_type;
	
	public static void main(String[] args) {
		
		carsObjectConcept c1 = new carsObjectConcept();
		c1.Brand = "Mazda";
		c1.year_make = 2019;
		c1.Car_name = "CX-9";
		c1.Fuel_type = true;
		
		carsObjectConcept c2= new carsObjectConcept();
		c2.Brand ="Honda";
		c2.year_make = 2020;
		c2.Car_name = "Accord";
		c2.Fuel_type = false;
		
		if (c1.Fuel_type == true)
		{ 
			System.out.println("Car uses petrol as fuel");
		}
		else 
			System.out.println("Car uses diesel as fuel");
		
		
		System.out.println("Details of Car1 is:" +" "+ c1.Brand + " " + c1.year_make + " " + c1.Car_name + " "+ c1.Fuel_type );
		System.out.println("Details of Car2 is:" +" "+ c2.Brand + " " + c2.year_make + " " + c2.Car_name + " "+ c2.Fuel_type );
		
				
		
	}

}
