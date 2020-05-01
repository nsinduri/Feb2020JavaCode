package WebDriverAssignment;

public abstract class AbstractAssignment {

	public abstract void get(String url);
	
	public abstract void findElement(String element);
	
	public abstract String getTitle();
	
	public int quit() {
		
		return -1;
	
	}
	
	

}
