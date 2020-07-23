import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoritngColumnValues_InATable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpandey9\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click(); //for x-path the syntax would have been "tr/th[2]"
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click(); //clicking two times to convert in ascending order
		
		List<WebElement> Fruits = driver.findElements(By.cssSelector("tr td:nth-child(2)")); //returns a list of webelements
		ArrayList<String> OriginList = new ArrayList<String>(); //declaring an arraylist of strings to store the text from all webelements
		
		for (int i=0;i < Fruits.size() ; i++)
		{
		    OriginList.add(Fruits.get(i).getText()); //adding indivizual values to arraylist using .add method 
		    
		}
		System.out.println(OriginList);
		
		
	    ArrayList<String> CopiedList = new ArrayList<String>(); //copying the original list to a new array list
		for (int i = 0; i < OriginList.size(); i++)
		{
		     CopiedList.add(OriginList.get(i)); //using for loop and .add to copy
		}
		System.out.println(CopiedList);
		Collections.sort(CopiedList); //using collections frameworks' sort method to arrange copied list in ascending order
		System.out.println(CopiedList.equals(OriginList));
		
		// now doing the same for descending order below
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		Fruits = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		OriginList = new ArrayList<String>();
		
		for (int i=0;i < Fruits.size() ; i++)
		{
		    OriginList.add(Fruits.get(i).getText());
		    
		}
		System.out.println(OriginList);		
		
        ArrayList <String> CopiedList_2 = new ArrayList <String>();
	    for (int i = 0; i < OriginList.size(); i++)
	    {
	     CopiedList_2.add(OriginList.get(i));
	    }	
	
		Collections.sort(CopiedList);
		Collections.reverse(CopiedList); //using .reverse() method to convert copied list to descending order 
		
		System.out.println(CopiedList);
		
		System.out.println(CopiedList.equals(OriginList));
	}
}
		
		



