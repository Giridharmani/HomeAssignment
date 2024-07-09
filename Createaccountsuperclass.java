package hellogoogle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Createaccountsuperclass {

	public static void main(String[] args) throws InterruptedException {
					
					FirefoxDriver driver =new FirefoxDriver();
					driver.get("http://leaftaps.com/opentaps/");
					driver.manage().window().maximize();
					WebElement usernamefield =driver.findElement(By.id("username"));
					usernamefield.sendKeys("Demosalesmanager");
			       driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa") ;
			       driver.findElement(By.className("decorativeSubmit")).click();
			       driver.findElement(By.partialLinkText("CRM/SFA")).click();
			       driver.findElement(By.partialLinkText("Create Account")).click();
			       driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester") ;
			       driver.findElement(By.name("industryEnumId"));
				WebElement industryWE =driver.findElement(By.name("industryEnumId"));  
				Select intustryDD =new Select(industryWE);
				intustryDD.selectByVisibleText("Computer Software");
				WebElement ownershipWE =driver.findElement(By.name("ownershipEnumId"));  
				Select ownershipDD =new Select(ownershipWE);
				ownershipDD.selectByVisibleText("S-Corporation");
				WebElement dataSourceIE =driver.findElement(By.id("dataSourceId"));  
				Select dataSourceDD =new Select(dataSourceIE);
				dataSourceDD.selectByValue("LEAD_EMPLOYEE");
				WebElement marketingCampaignId =driver.findElement(By.name("marketingCampaignId"));  
				Select marketingCampaignDD =new Select(marketingCampaignId);
				marketingCampaignDD.selectByIndex(5);
				WebElement generalStateProvinceGeoId =driver.findElement(By.name("generalStateProvinceGeoId"));  
				Select generalStateProvinceGeoDD =new Select(generalStateProvinceGeoId);
				generalStateProvinceGeoDD.selectByValue("TX");
				driver.findElement(By.className("smallSubmit")).click();
				Thread.sleep(1000);
				driver.close();
						       
	}

}
