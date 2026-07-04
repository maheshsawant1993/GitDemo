package PagesShopperStack;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseShopperStack.BaseOperation;

public class RegisterPage extends BaseOperation {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	

	By firstNameRequired=By.id("First Name");
	By lastNameRequired=By.id("Last Name");
	By genderRequired=By.id("Male");
	By phoneNumberRequired=By.id("Phone Number");
	By emailIdRequired=By.id("Email Address");
	By passwordRequired=By.id("Password");
	By confirmPasswordRequired=By.id("Confirm Password");
	By checkboxClickRequired=By.id("Terms and Conditions");
	By clickOnRegisterButton=By.id("btnDisabled");
		
	public void enterFirstName(String firstName) {
		driver.findElement(firstNameRequired).sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		driver.findElement(lastNameRequired).sendKeys(lastName);
	}
	
	public void selectGender() {
		driver.findElement(genderRequired).click();
	}
	
	public void enterEmailId(String Email) {
		driver.findElement(emailIdRequired).sendKeys(Email);
	}
	
	public void enterPhoneNumber(String num) {
		driver.findElement(phoneNumberRequired).sendKeys(num);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(passwordRequired).sendKeys(pass);
	}
	
	public void enterConfirmPassword(String confirmPass) {
		driver.findElement(confirmPasswordRequired).sendKeys(confirmPass);    
	}
	
	public void enterCheckbox() {
		driver.findElement(checkboxClickRequired).click();
	}
	
	public void clickOnRegister() throws InterruptedException {
		WebDriverWait it=new WebDriverWait(driver,Duration.ofSeconds(5));
		it.until(ExpectedConditions.elementToBeClickable(clickOnRegisterButton)).click();
	}
	
	
	

}
