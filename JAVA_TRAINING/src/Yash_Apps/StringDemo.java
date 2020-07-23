package Yash_Apps;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// == operator in case of reference variable check if they are pointing to same vraiable
		// == operaotor in case of primitive variable check equality of value
		
		String s1 = "hello";
		String s2 = "hello";
		
		if(s1 == s2) {
			
			System.out.println("True");
		}
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		if(str1 == str2) {
			
			System.out.println("True");
		}	
		
		//Never create object for storing string to avoid memory wastage.
		
		String data = " Mohit ";
		String newData =   data.trim();
		
		//Can read API documentation for methods available for predefined string class
		
		System.out.println("Old Data:" + data + "New Data:" +newData+"");
		

	}

}
