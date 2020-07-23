package T;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Alphabetic {

@Parameters({"URL"})
@Test(dependsOnMethods= {"C"})	
public void A (String urlsite) {
	
	System.out.println("I am A.");
	System.out.println(urlsite);
}

@Test(dependsOnMethods= {"C"})
public void B() {
	
	int a = 1;
    int b = 2;   
    
	Assert.assertTrue( a == b);
}

@Parameters({"URL","SiteName"})
@Test
public void C(String a , String b) {
	
	System.out.println("I am C.");
	System.out.println("URL is " + a);
	System.out.println("Sitename is " + b);
}

@Test(enabled = false)
public void D() {
	
	System.out.println("I am D.");
}
}
