package PagesShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseShopperStack.BaseOperation;

public class AddressPage extends BaseOperation{
	
	WebDriver driver;
	public AddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By AddressTypeOfUser=By.id("Office");
	By NameOfPerson=By.id("Name");
	By HouseAndOfficeInfo=By.id("House/Office Info");
	By Streetinfo=By.id("Street Info");
	By LandmarkInfoUser=By.id("Landmark");
	By CountryName=By.id("Country");
	By StateName=By.id("State");
	By CityName=By.id("City");			
	By PincodeInfoUser=By.id("Pincode");
	By PhoneNumberofUser=By.id("Phone Number");
	By AddNewAddress=By.id("addAddress");
	By RadioIcon=By.xpath("//input[@type='radio']");
	By ProceedButton=By.xpath("//button[@class='selectaddress_proceed__qiGsK']");
	
	public void RadioSelectAddressType() {
		driver.findElement(AddressTypeOfUser).click();
	}
	
	public void PersonNameField(String name) {
		driver.findElement(NameOfPerson).sendKeys(name);
	}
	
	public void HouseAndOfficeInfoField(String HouseName) {
		driver.findElement(HouseAndOfficeInfo).sendKeys(HouseName);
	}
	
	public void StreetInfoField(String Street) {
		driver.findElement(Streetinfo).sendKeys(Street);
	}
	
	public void LandmarkInfoField(String land) {
		driver.findElement(LandmarkInfoUser).sendKeys(land);
	}
	
	public void CountryStateCityInfo() throws InterruptedException {
		Thread.sleep(2000);
		WebElement staticDropDown=driver.findElement(By.id("Country"));
		Select dropdown=new Select(staticDropDown);
		dropdown.selectByIndex(3);
		
		Thread.sleep(2000);
		WebElement staticDropDown1=driver.findElement(By.id("State"));
		Select dropdown1=new Select(staticDropDown1);
		dropdown1.selectByIndex(4);
		
		Thread.sleep(2000);
		WebElement staticDropDown2=driver.findElement(By.id("City"));
		Select dropdown2=new Select(staticDropDown2);
		dropdown2.selectByIndex(4);
		
	}
	
	public void PincodeOfUser(String num) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(PincodeInfoUser).sendKeys(num);
	}
	
	public void PhoneNumberField(String phone) {
		driver.findElement(PhoneNumberofUser).sendKeys(phone);	
	}
	
	public void ClickOnAddAddress() {
		driver.findElement(AddNewAddress).click();
	}
	
	public void ClickOnRadioIcon() {
		WebDriverWait it2=new WebDriverWait(driver,Duration.ofSeconds(10));
		it2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='radio']"))).click();
	//	driver.findElement(RadioIcon).click();
	}
	
	public void ClickOnProceedButton() throws InterruptedException  {
		WebDriverWait it3=new WebDriverWait(driver,Duration.ofSeconds(10));
		it3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='selectaddress_proceed__qiGsK']"))).click();
	}
	
	
	
	
	
	
	

}
