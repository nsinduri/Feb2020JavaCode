package OOPInheritance;

public class NYU extends University {

	@Override
	public void regularClasses()
	{
		System.out.println("NYU -- Regular Classes");
	}
	
	@Override
	public void eveningClasses()
	{
		System.out.println("NYU -- Evening Classes");
	}
	
	public void DualDegreeCourse()
	{
		System.out.println("NYU -- Dual Degree course");
	}
}
