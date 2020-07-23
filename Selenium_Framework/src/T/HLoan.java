package T;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class HLoan {

@AfterTest
public void HLoanWebLogin() {
	
	System.out.println("Web Logged in for Home");
}

@AfterSuite
public void HLoanMobileLogin() {
	
	System.out.println("Mobile Logged in for Home");
}

@Test(groups = {"Smoke"})
public void Smok2() {
	
	System.out.println("I am a smoke test in Home loan");
}

}
