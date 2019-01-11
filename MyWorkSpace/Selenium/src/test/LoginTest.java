package test;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@Ignore

@Test     //Junit annotation it marks the method as a test method
public void Login() {

	//Declare what browser would you use, and where is the browser driver located
	System.setProperty("webdriver.chrome.driver", "c:\\auto\\chromedriver.exe");
	
	
	// open the chrome browser and it is also means driver is getting referred as a chrome browser
	//makes the connection with driver and chrome.
	
	
	//1st step opens the chrome driver
	//driver means selenium. and driver is getting referred as chrome browser.
	WebDriver driver= new ChromeDriver();
	
	
	//2nd step 
	//get means to go to specific url
	driver.get("http://demosite.center/wordpress/wp-login.php");
	
	
	//3rd
		//for identifing element we use driver.findElement
		//for typing in the element we use sendkeys
		driver.findElement(By.id("user_login")).sendKeys("admin");
	
	
		//4th
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
	
	
		//5th
		driver.findElement(By.id("wp-submit")).click();
		
		
		//6th step verify if homepage was displayed
		// is displayed means certain element displaying properly or not
		driver.findElement(By.id("title")).isDisplayed();

		
		//2nd verification
		driver.findElement(By.id("save-post")).isDisplayed();
		
		
		driver.close();
		
		driver.quit();
		
	
	
	
	
	
	

	
}
}
