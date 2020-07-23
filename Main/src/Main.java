/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processArray(ArrayList<Integer> array) {
    	
    	int sum = 0;
    	int count = 0;
    	
    	while (array.size() > count) {
       		int arrMember = array.get(count);
    		sum = sum + arrMember;   		
    	}
    	
    	int TotalMeb = array.size();
    	
    	int avg = sum/TotalMeb;
    	
        return avg;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}

