package TryCatch;

public class TryCatch {

static	int a;
static int b;
	
	public static void main(String[] args) {
		
		//Div(10,0);
		System.out.println(Div(10,0));
				
	}

	public static int Div(int a , int b) {
		
		int d = 0;
		
		try {
			  d = a/b;
			 
			 return d;
		}
		
		catch (Exception e) {
			
			System.out.println("Exception Occured");
			return d;
		}
		
		finally {
			
			System.out.println("I am in finally block");
		}
	}
}
