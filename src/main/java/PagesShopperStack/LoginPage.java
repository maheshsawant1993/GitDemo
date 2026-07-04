package PagesShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseShopperStack.BaseOperation;

public class LoginPage extends BaseOperation{
	
 WebDriver driver;
 public LoginPage(WebDriver driver) {
	 this.driver=driver;
 }
	By userNameRequired=By.id("Email");
	By userPasswordRequired=By.id("Password");
	By UserLoginRequired=By.id("Login");
	
	
	public void enterUsername(String user) {
		driver.findElement(userNameRequired).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(userPasswordRequired).sendKeys(pass);

	}
	
	public void loginClick()  {
		driver.findElement(UserLoginRequired).click();
	}

}
