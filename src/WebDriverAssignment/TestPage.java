package WebDriverAssignment;

public class TestPage {

	static String browser = "chrome";
	
	 static AbstractAssignment ab ;
	
	public static void main (String[] args) 
	{
		
		if (browser.equalsIgnoreCase("chrome"))
		{ 
			 ab = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
				{
		 ab = new FirefoxDriver();
				}
		
		else if (browser.equalsIgnoreCase("IE"))
				{
			 ab = new IEDriver();
				}
	
		ab.get("http://www.google.com");
		ab.findElement("username");
		ab.findElement("password");
		ab.findElement("login");

		System.out.println(ab.getTitle());
		
		}
	

}
	
	
	
	
	