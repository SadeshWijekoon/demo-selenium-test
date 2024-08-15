package Day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatersdemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize(); // maximize the window
		
		// name
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
//		boolean logoDisplayStaus=driver.findElement(By.id("logo")).isDisplayed();
//		System.out.println(logoDisplayStaus);
		
		//linkText & paritallinkText
//		driver.findElement(By.linkText("Tablets")).click(); this is a linkedText
		
//		driver.findElement(By.partialLinkText("Table")).click();
		
		List<WebElement> headerLink = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total nuber of header links:"+headerLink.size());
		
		
		

	}

}
