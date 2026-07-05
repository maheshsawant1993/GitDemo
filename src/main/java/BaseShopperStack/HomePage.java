package BaseShopperStack;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseOperation {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}

	By LoginButtonClick=By.id("loginBtn");
	By CreateAccountClick=By.id("Create Account");
	By ClickOnMenLink=By.id("men");
	By ClickOnWomenLink=By.id("women");
	By ClickOnKidsLink=By.id("kids");
	By ClickOnElectronicsLink=By.id("electronics");
	By ClickOnBeautyLink=By.id("beautyProducts");
			
	public void LoginButton() {
	    WebDriverWait it=new WebDriverWait(driver,Duration.ofSeconds(30));
		System.out.println("Good work American guy");
		System.out.println("I have written the code now you can write");
		it.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn"))).click();
	}
	
	public void CreateAccountButton() {
		driver.findElement(CreateAccountClick).click();
	}
	
	public void MenLink() {
		driver.findElement(ClickOnMenLink).click();;
	}
	
	public void WomenLink() {
		driver.findElement(ClickOnWomenLink).click();
	}
	
	public void kidsLink() {
		driver.findElement(ClickOnKidsLink).click();
	}
	
	public void ElectronicsLink() {
		driver.findElement(ClickOnElectronicsLink).click();
	}
	
	public void BeautyLink() {
		driver.findElement(ClickOnBeautyLink).click();
	}
	
//	 public void featuresProductsToAdd() throws InterruptedException {
//		 int j=0;
//		 String[] ProductRequired= {"APPLE iPhone 11","Noise ColorFit Pulse Spo2 Smart Watch","Ribbed Polo Collar Crop Tshirt for Women"};
//		 
//		 driver.findElement(By.xpath("//section[@class='featuredProducts_featuredProducts__-gjBm'] //h1"));
//		 Thread.sleep(3000);
//		 List<WebElement> AllProductsCollection=driver.findElements(By.xpath("//div[@class='featuredProducts_footerLeft__PmkNa'] //span[2]"));
//		 for(int i=0;i<=AllProductsCollection.size();i++) {
//			 String differentProducts=AllProductsCollection.get(i).getText();
//			 
//			 List providedProducts=Arrays.asList(ProductRequired);
//			 Thread.sleep(3000);
//			 if(providedProducts.contains(differentProducts)) {
//				 j++;
//				 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				 if(j>=3)
//				 {
//					 break;
//				 }
//			 }
//		 }
//		 
//	 }
	
}
