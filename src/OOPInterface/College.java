package OOPInterface;

public class College implements Medical, NonMedical, Commerce{

	@Override
	public void economics() {
		System.out.println("College - economics");
		
	}
	public void biology() {
		System.out.println("College - biology");		
	}
	public void science() {
		System.out.println("College - science");		
	}

	@Override
	public void mathematics() 
	{
		System.out.println("College - mathematics");		
	}

}
