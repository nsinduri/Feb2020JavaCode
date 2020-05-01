package WebDriverAssignment;

public class ChromeDriver extends AbstractAssignment {

	public ChromeDriver()
	{
		System.out.println("Launch google chrome");
	}	
		
	@Override
	public void get(String url) {
		System.out.println("launching url" + url);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("found element in chrome" + element);
		 
	}

	@Override
	public String getTitle() {
		System.out.println("get the page title");
		return "google";
	}
	
}
