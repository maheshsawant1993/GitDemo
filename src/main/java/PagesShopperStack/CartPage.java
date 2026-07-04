package PagesShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseShopperStack.BaseOperation;

public class CartPage extends BaseOperation{
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}

	By OpenCart=By.id("cart");
	By ProductBuyNow=By.xpath("//button[@id='buynow_fl']");
	By RemoveProductFromCart=By.className(".MuiButtonBase-root.MuiButton-root.MuiButton-text.MuiButton-textError.MuiButton-sizeSmall.MuiButton-textSizeSmall.css-1bhvu8");
	By AddressOfUser=By.xpath("//button[@class='selectaddress_adneadd__cICdt']");
	
	public void OpenCartPage() throws InterruptedException {
		driver.findElement(OpenCart).click();
	}
	
	public void ProductBuyNowFromCart() throws InterruptedException {
		driver.findElement(ProductBuyNow).click();
	}
	
	public void RemoveProductByCart() {
		driver.findElement(RemoveProductFromCart).click();
	}
	
	public void ProvideAddressOfUser() {
		driver.findElement(AddressOfUser).click();
	}
	
}
