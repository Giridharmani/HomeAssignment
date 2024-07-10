package hellogoogle;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("tom") ;
		driver.findElement(By.name("lastname")).sendKeys("jerry") ;
		WebElement birthdays =driver.findElement(By.name("birthday_day"));  
		Select birthday_day =new Select(birthdays);
		birthday_day.selectByIndex(2);
		WebElement months =driver.findElement(By.id("month"));  
		Select month =new Select(months);
		month.selectByValue("5");
		WebElement years =driver.findElement(By.id("year"));  
		Select year =new Select(years);
		year.selectByVisibleText("1960");
		driver.findElement(By.name("reg_email__")).sendKeys("9043089723");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9043089723");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();	
	}

}
