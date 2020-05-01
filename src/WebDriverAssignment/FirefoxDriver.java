package WebDriverAssignment;

public class FirefoxDriver extends AbstractAssignment {

	public FirefoxDriver()
	{
		System.out.println("Launch Firefox");
	}	
		
	@Override
	public void get(String url) {
		System.out.println("launching url" + url);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("found element in firefox" + element);
		 
	}

	@Override
	public String getTitle() {
		System.out.println("get the page title");
		return "mozilla";
	}

	
	
}
