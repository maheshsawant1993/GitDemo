package PagesShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseShopperStack.BaseOperation;

public class AccountSetting extends BaseOperation{
	
	WebDriver driver;
	public AccountSetting(WebDriver driver) {
		this.driver=driver;
	}
	
	By ClickOnAccountSetting=By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-892d40']"); 

	public void AccountSettingMenu() {
       // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(ClickOnAccountSetting));
       // wait.until(ExpectedConditions.elementToBeClickable(ClickOnAccountSetting)).click();
		driver.findElement(ClickOnAccountSetting).click();
//		List<WebElement> menu=driver.findElements(By.xpath("//ul[@role='menu']"));
//		for(int i=0;i<=menu.size();i++)
//		{
//			
//			WebElement name=driver.findElements(By.xpath("//ul[@role='menu']")).get(i);
//			if(name.equals(driver.findElement(By.xpath(null))))
//		}
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'][1]")).click();

		
		
		
	}
}
