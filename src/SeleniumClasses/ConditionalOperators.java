package SeleniumClasses;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 200;
		int c = 3000;
		int d = 400;

		// && is called short circuit operator
		
		if(a>b && a>c && a>d)
		{
			System.out.println("a is the greatest");
			
		}
		else if (b>c && b>d)
		{
			System.out.println("b is the greatest");
		}
		else if (c>d)
		{
			System.out.println("c is the greatest");
		}
		else
		{System.out.println("d is the greatest");

	}
		// Pgm to test if a number is +ve or -ve 
		
		int x = 10;
		
		if (x<0)
		{System.out.println("x is negative number");
		
		}
		else 
		{System.out.println("x is positive number");			
		
}
	
	}
	
}