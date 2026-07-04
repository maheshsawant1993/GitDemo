package PagesShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By SearchTheProductOnTop=By.id("search");
	By ClickOnSearchButton=By.id("searchBtn");
			
	public void ListOfProducts(String search) throws InterruptedException {
		Thread.sleep(5000);
        driver.findElement(SearchTheProductOnTop).sendKeys(search);		
		driver.findElement(ClickOnSearchButton).click();
		Thread.sleep(5000);
		WebElement product=driver.findElement(By.className("featuredProducts_cardFooter__B8KN4"));
		product.findElement(By.cssSelector("div[class='featuredProducts_footerRight__k498x'] button")).click();
	}
	


}
