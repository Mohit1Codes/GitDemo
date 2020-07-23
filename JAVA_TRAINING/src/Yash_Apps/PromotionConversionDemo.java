package Yash_Apps;

public class PromotionConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
				
	    double d = i; // i is promoted from 32 bit int data type to 64 bit double data type automatically or implicitly
	    
	    //We cannot demote higher data type to lower data type implicitly because a higher can contain two or more data types
	    //like int contains both byte and short so we will have to specify explicitly.
	    
	    double d1 = 64000;
	    int i1 = (int)d1;
	    
	    double d2 = 64000.50;
	    int i2 = (int)d2;
	    
	    //while this conversion the decimal part will be ignored.
	    
	    

	}

}
