package WebDriverAssignment;

public class IEDriver extends AbstractAssignment {

	public IEDriver()
	{
		System.out.println("Launch Internet Explorer");
	}	
		
	@Override
	public void get(String url) {
		System.out.println("launching url" + url);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("found element in IE" + element);
		 
	}

	@Override
	public String getTitle() {
		System.out.println("get the page title");
		return "MS";
	}
	
}
