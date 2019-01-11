package test;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DraftTest {
	
		@Test
		public void AddingDraft() {
			
			System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demosite.center/wordpress/wp-login.php");
			
			
			driver.findElement(By.id("user_login")).sendKeys("admin");
			
			
			driver.findElement(By.id("user_pass")).sendKeys("demo123");
	
	
			driver.findElement(By.id("wp-submit")).click();
	
	     //verify you made it to homepage
			
			driver.findElement(By.id("title")).isDisplayed();

		//for title text box
			driver.findElement(By.id("title")).sendKeys("Location");
			
			
			driver.findElement(By.id("content")).sendKeys("I live in texas");
			
			
			driver.findElement(By.id("save-post")).click();
			
			driver.close();
			
			driver.quit();
			
}
}