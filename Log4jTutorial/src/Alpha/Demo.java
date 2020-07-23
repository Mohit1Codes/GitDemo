package Alpha;
import org.apache.logging.log4j.*;

public class Demo {

	
	private static Logger log = LogManager.getLogger(Demo.class.getName()); //LogManager is an API and getLogger is a function inside it
	//we need to create a log object using above syntax.
	//getLogger function accepts the path of class we are in for it use Demo.class.getName() where Demo is class name.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     log.debug("I am debugging");
     
     if (5>4)
     {
    	 log.error("Object not present");
    	 log.info("I am info log");
    	 log.fatal("I am fatal error");
     }
		
	}

}
