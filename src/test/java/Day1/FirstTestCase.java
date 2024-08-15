package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		// launch browser 
		// ChromeDriver is only creating c h o r m e 
		
//		ChromeDriver driver = new ChromeDriver();
		// this is for C h r o m e Browser 
		WebDriver driver = new ChromeDriver();
		
		// edge 
//		WebDriver driver = new EdgeDriver();
		
		// open URL
		driver.get("https://demo.opencart.com/");
		
		// validate the title 
		String act_title =  driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		} else 
		{
			System.out.println("Test Fail");
		}
		
		// close the Browser
		
//		driver.close();
		driver.quit();
		
	}}

     