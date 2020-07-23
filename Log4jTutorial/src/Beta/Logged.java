package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logged {

	
	private static Logger log = LogManager.getLogger(Logged.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int x = 6;
	    int y = 7;
	    int z = x*y;
	    int u = z/(x+y);
	    
	    
	    log.info("The dividend is stored in u and its value is " + u);
	    
	    if (u > 2.999999999) 
	    {
	    	log.info("The dividend is greater than 5");
	    }
	    else
	    {
	    	log.error("The dividend is less than 5");
	    }
	   
	}

}
