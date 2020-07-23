package T;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class PLoan {

@BeforeSuite

public void PloanWebLogin() {
	
	System.out.println("Web login for personal loan");
}

@Test
public void PloanMobileLogin() {
	
	System.out.println("Mobile login for personal loan");
}

@Test(groups = {"Smoke"})
public void Smoke3() {
	
	System.out.println("I am a smoke test in Personal Loan");
}

}