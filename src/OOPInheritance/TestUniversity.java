package OOPInheritance;

public class TestUniversity {

	public static void main(String[] args) {
	
		Stanford s1 = new Stanford();
		s1.eveningClasses();
		s1.classroom();
		s1.regularClasses();
		s1.playGround();
		
		University u1 = new Stanford(); //top casting -- child class object will be referenced by parent class reference variable
		u1.eveningClasses();
		u1.classroom();
		
		MIT m1 = new MIT();
		m1.classroom();
		m1.eveningClasses();
		m1.PHDCourse();
		m1.regularClasses();
		
		NYU n1 = new NYU();
		n1.classroom();
		n1.DualDegreeCourse();
		n1.eveningClasses();
				
	}

}
