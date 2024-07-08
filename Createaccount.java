package hellogoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Createaccount {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			
			FirefoxDriver driver =new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			WebElement usernamefield =driver.findElement(By.id("username"));
			usernamefield.sendKeys("Demosalesmanager");
	       driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa") ;
	       driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.partialLinkText("CRM/SFA")).click();
	       driver.findElement(By.partialLinkText("Create Account")).click();
	       driver.findElement(By.id("accountName")).sendKeys("Giridhar") ;
	       driver.findElement(By.className("smallSubmit")).click();
	       
	}

}
