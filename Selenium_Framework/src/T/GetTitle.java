package T;

import java.io.IOException;

import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle extends DataDriving { //using inheritance concept of JAVA, inheriting all qualities of DataDrivng class
	
	@Test
	public void Title () throws IOException, InterruptedException {
		
		//LogIn(); //due to inheritance we are able to use other classes method directly without creating an object
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.out.println(driver.getTitle());
		
	}

}
