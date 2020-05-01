package TryCatch;

public class WrapperClass {

	public static void main(String[] args) {
		
		String a = "100";
		int b = 50;	
		
		System.out.println(a+b);
		
		int c = Integer.parseInt(a);
		
		System.out.println(c+b);
		
		String d = "1000A";
		int e = 200;
		
	    String f = d.substring(0, 4);
		
	int g = Integer.parseInt(f)+e;
	
	System.out.println(g);
	}

}
