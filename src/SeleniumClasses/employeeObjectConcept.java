package SeleniumClasses;

public class employeeObjectConcept {
	
    String Name;
    int age;
    int emp_id;
    String role;
    
	public static void main(String[] args) {

		employeeObjectConcept e1 = new employeeObjectConcept();
		e1.Name ="Sinduri";
		e1.age = 30;
		e1.emp_id = 100;
		e1.role = "SSE";
		
		employeeObjectConcept e2 = new employeeObjectConcept();
		e2.Name = "Sandeep";
		e2.age = 35;
		e2.emp_id = 101;
		e2.role = "Manager";
		
		System.out.println("Details of employee1 is:"+ " " + e1.Name +" " + e1.age + " "  + e1.emp_id + " " + e1.role);
		System.out.println("Details of employee2 is:"+ " " + e2.Name +" " + e2.age + " "  + e2.emp_id + " " + e2.role);
	}

}
