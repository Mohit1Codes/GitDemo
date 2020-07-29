package T;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CLoan {

@Test
public void CloanWLogin() {
	
	System.out.println("Car Loan Web logged in");
}

@Test
public void CloanMLogin() {
	
	System.out.println("Car Laon mobile logged in");
}

@Test
public void CloanAPILogin() {
	
	System.out.println("Car Loan API logged in");
}

@BeforeMethod
public void Demo() {
	
	System.out.println("Demo logged in for Car");
}

@Test(groups = {"Smoke"})
public void Smoke1() {
	
	System.out.println("I am a smoke test in Car loan");
}
}
