package SeleniumClasses;

public class ArraysConcept {

	public static void main(String[] args) {
	
		//static array
		//size is fixed -- which is a disadvantage
		
		int i[] = new int[4];
		i[0] = 100;
		i[1] = 200;
		i[2]= 300;
		i[3] = 400;
		
		System.out.println(i[2]);
		for(int j=0; j<4; j++)
		{
			System.out.println(i[j]);
		}

	}

}
