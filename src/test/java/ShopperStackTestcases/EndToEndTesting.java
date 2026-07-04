package ShopperStackTestcases;

import org.testng.annotations.Test;

import BaseShopperStack.BaseOperation;
import BaseShopperStack.HomePage;
import PagesShopperStack.AccountSetting;
import PagesShopperStack.AddressPage;
import PagesShopperStack.CartPage;
import PagesShopperStack.LoginPage;
import PagesShopperStack.ProductPage;

public class EndToEndTesting extends BaseOperation {
	
	@Test
	public void endToendFlow() throws InterruptedException{
		
		HomePage page2=new HomePage(driver);
		page2.LoginButton();
		
//		page2.CreateAccountButton();	
//		RegisterPage page1=new RegisterPage(driver);
//		page1.enterFirstName("Rohan");
//		page1.enterLastName("Tiger");
//		page1.enterPhoneNumber("9163828567");
//		page1.enterEmailId("Rohan589@gmail.com");
//		page1.enterPassword("Rohan889@1234");
//		page1.enterConfirmPassword("Rohan889@1234");
//		page1.selectGender();
//		page1.enterCheckbox();
//		page1.clickOnRegister();
//		page2.LoginButton();
	
		LoginPage page=new LoginPage(driver);
		page.enterUsername("sojan99@gmail.com");
		page.enterPassword("Sojan@1234");
		page.loginClick(); 
		
		ProductPage product=new ProductPage(driver);
		product.ListOfProducts("Apple"); 
		
	    CartPage cart=new CartPage(driver);
	    cart.OpenCartPage();
		cart.ProductBuyNowFromCart();
		cart.ProvideAddressOfUser();
		
		AddressPage add=new AddressPage(driver);
		add.RadioSelectAddressType();
		add.PersonNameField("Sojan");
		add.HouseAndOfficeInfoField("H.No 9,UP");
		add.StreetInfoField("NirmalNager");
		add.LandmarkInfoField("Savedi Area");
		add.CountryStateCityInfo();
		add.PincodeOfUser("070091");
		add.PhoneNumberField("9156874568");
		add.ClickOnAddAddress();
		add.ClickOnRadioIcon();
		add.ClickOnProceedButton();
		
		Thread.sleep(6000);
		AccountSetting acc=new AccountSetting(driver);
		acc.AccountSettingMenu();  
		
	}
}
