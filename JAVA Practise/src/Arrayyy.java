import java.util.ArrayList;
import java.util.Iterator;

public class Arrayyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee_Details e1 = new Employee_Details("Mohit", 1,23);
		Employee_Details e2 = new Employee_Details("Mohit", 1,23);
		Employee_Details e3 = new Employee_Details("Mohit", 1,23);
		
		ArrayList<Employee_Details> arr4 = new ArrayList<Employee_Details>();
		arr4.add(e1);
		arr4.add(e2);
		arr4.add(e3);
		
		Iterator<Employee_Details> it = arr4.iterator();
		
		while(it.hasNext()) {
			Employee_Details emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.id);	
			
		}
	}

}
