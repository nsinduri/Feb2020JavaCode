package OOPInterface;

public class University {
	
	public void testmethod()
	{
		System.out.println("test method");
	}
	

	public static void main(String[] args) {
	

		College c1 = new College();
		
		c1.biology();
		c1.economics();
		c1.mathematics();
		c1.science();
		

		//top casting
		
		Medical m1 = new College();
		
		m1.biology();
		m1.mathematics();
		m1.science();
	}

}
