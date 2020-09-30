
import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> animals = new HashMap<String, String>();	
		animals.put("dog", "musk");
		animals.put("bird", "astro");
		animals.put("cat", "harry");		
		for(String type : animals.keySet()) {			
			System.out.println( type + "'s name is "+ animals.get(type));
		}
		
		Employee_Details e1 = new Employee_Details("Pam", 122, 21);
		Employee_Details e2 = new Employee_Details("Sam", 122, 22);
		Employee_Details e3 = new Employee_Details("Ram", 122, 23);
		
		HashMap<String, Employee_Details> hm = new HashMap<String, Employee_Details>();
		hm.put("Employee 1 info is ", e1);
		hm.put("Employee 2 info is ", e2);
		hm.put("Employee 3 info is ", e3);
		
		for (String ke : hm.keySet()) {
			Employee_Details emp = hm.get(ke);
			System.out.println(ke + " " + emp.name + " " + emp.id + " " + emp.age);					
		}		
	}

}
