package BaseShopperStack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseOperation {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void enterURL() {
	     driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		System.out.println("Shopper stack website is open on chrome");
		System.out.println("Purchase is now");
		driver.manage().window().maximize();
	}
	
//	@AfterMethod
//	public void logout(){
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//div[@class='MuiBox-root css-5nwj3y'] //button")).click();
//		driver.findElement(By.xpath("//li[text()='Logout']")).click();
//	}
		

}

