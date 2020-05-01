package SeleniumClasses;

public class FunctionsConcept {

	//Cannot create a function inside a function
	//Class members -- class variables and class methods
	
	
	//1.Simple function -- no input parameters, no return
	
	public void test ()
	{
	System.out.println("test method1");
	}
	
	//2.Function2 - no input but some return
	
	public int sum ()
	{
		int a= 10;
		int b= 20;
		int c = a+b;
		return c;
	}
	
	//3. Function3 - some input parameters with some return
	
	public int sum1 (int x, int y)
	{
		int z = x+y;
		return z;
	}
	
	//4. Passing String argument
	public int getmarks(String studentname)
	{

		int marks = -1;
		System.out.println("Marks of" + " " + studentname );
		
		if(studentname.equals("Sinduri"))
			{marks = 100;	
			}
		
		else if (studentname.equals("Sandeep"))
		{marks = 90;
		}
		else 
			{System.out.println("Student doesn't exist");}
		
		return marks;
	}
	
	//5. Selenium - launch browser
	
	public String getBrowser(String BrowserName)
	{
		String Name = null;
		
		if (BrowserName.equals("Chrome"))
			{
			Name = "Chrome";
			System.out.println("Chrome browser is selected");	
			}
		else if (BrowserName.equals("Firefox"))
		{
			Name = "Firefox";
			System.out.println("Firefox browser is selected");
			
	}
		else if (BrowserName.equals("IE"))
		{
			Name = "IE";
			System.out.println("IE is selected");
			}
		else 
			System.out.println("Selected Browser is not available :" + " " + BrowserName );
			
			return Name;
	}
	
	//6. returning a static array 
	
	public int[] getStudentMarks()
	{
		int marks[] = new int[4];
		marks[0] = 100;
		marks[1] = 90;
		marks[2] = 80;
		marks[3] = 70;
		
		return marks;
				
	}	
		
		
		
		
		
	
	public static void main(String[] args) {
		
		FunctionsConcept obj = new FunctionsConcept();
	
		//int d = obj.sum(); 
		System.out.println(obj.sum());
		
		int h = obj.sum1(100,200);
		System.out.println(h);
		
		int finalmarks = obj.getmarks("Sinduri");
		System.out.println(finalmarks);
		
		int finalmarks1 = obj.getmarks("Shiva");
		System.out.println(finalmarks1);
		
		String br1 = obj.getBrowser("Chrome");
		System.out.println(br1);
		String br2 = obj.getBrowser("Firefox");
		System.out.println(br2);
		String br3 = obj.getBrowser("IE");
		System.out.println(br3);
		String br4 = obj.getBrowser("Opera");
		System.out.println(br4);
		
		int m[] = obj.getStudentMarks();
		System.out.println(m.length);
		
		//in order to print the array -- use for loop
		
		for(int k=0; k<m.length;k++)
		{
			System.out.println(m[k]);
		}
	}
		

}
