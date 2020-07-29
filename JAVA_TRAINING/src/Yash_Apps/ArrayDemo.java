package Yash_Apps;

public class ArrayDemo {
	
	
	public int sum(int...n) {  //this method will n number of integers as input and sum them, developer won't create array it will be created internally.
		
		int total = 0;
		
		for(int i:n) {  
			
			total = total + i;
		}
		
		return total;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] intArray;
		
		intArray= new int [5];
		
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		
		for (int i:intArray) {         //advance for loop
			
			System.out.println(i);
		}
		
		float[] floatArray = new float[] {1.2f,10.3f,4.5f}; //size is flexible and is defined according to how many elements are given.
	}
		
		
	}
	
*/
		ArrayDemo o = new ArrayDemo();
		int total = o.sum(10,20,30,40,50);
		
		System.out.println("Total is:"+ total);
		
		
	}
	

}
