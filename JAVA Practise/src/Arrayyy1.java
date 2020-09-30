import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;

public class Arrayyy1 {

	public static void main(String[] args) {		
		/*HashMap<String, String> animals = new HashMap<String, String>();	
		animals.put("dog", "musk");
		animals.put("bird", "astro");
		animals.put("cat", "harry");		
		for(String type : animals.keySet()) {			
			System.out.println( type + "'s name is "+ animals.get(type));*/
		
		ArrayList arr = new ArrayList();
		arr.add(2);	arr.add("Mohit"); arr.add(3); arr.add("Mohit");
		
		for (int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}	
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(9); arr2.add(100);	arr2.add(90); arr2.add(70); arr2.add(54);
		int max = arr2.get(0);
		for (int i = 0; i<arr2.size();i++) {
			if (arr2.get(i)> max) {
				 max = arr2.get(i);
			 }		
		}		
		System.out.println("Maximum no. is " + max);		
		}
    	

	}


