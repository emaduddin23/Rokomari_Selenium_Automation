package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Shipping extends Basepage{
	public By clickGoToShippingPageBy = By.xpath("//span[normalize-space()='Place Order']");
	public By customer_name = By.xpath("(//input[@id='name'])[1]");
	public By phoneNumber = By.xpath("//input[@id='phone']");
	public By selectCountry  = By.cssSelector("#js--country");
	public By selectCity  = By.cssSelector("#js--city");
	public By selectArea  = By.cssSelector("#js--area");
	//public By selectZone  = By.cssSelector("#js--zone");
	public By address = By.xpath("//textarea[@id='address']");
	public By paymentCOD = By.xpath("//label[@for='cod']");
	public By confirm_Order = By.xpath("//span[normalize-space()='Confirm Order']");
	
	//Shipping Address Page
		public String shippingPageTitle = "Shipping Address | Rokomari.com";
		public String customer_nameText = "Emad";
		public String phoneNumberText = "015879632147";
		public String countryName = "Bangladesh";
		public String countryNameNotSelectedOne = "Poland";
		public String cityName = "বান্দরবান";
		public String areaName = "রোয়াংছড়ি";
		public String zoneName = "নোয়াপতং ইউনিয়ন";
		public String addressText = "I just Write my address";
	
	
	@Step("Click on Go to shipping page button and wait for page load")
	public void goToSippingPage() {
		clickOnElement(clickGoToShippingPageBy);
		timeOut(1000);
	}
	@Step("Fill up the delivery information form with book recipient information")
	public void fillUpForm() {
		
		writeText(customer_name, customer_nameText);
		writeText(phoneNumber, phoneNumberText);
		//clickOnButton(lc.selectCountry);
		///selectitem(lc.selectCountry, lc.cityName);
		timeOut(1000);
		clickOnElement(selectCity);
		selectitem(selectCity, cityName);
		timeOut(1000);
		clickOnElement(selectArea);
		selectitem(selectArea, areaName);
		timeOut(1000);;
//		clickOnElement(selectZone);
//		selectitem(selectZone, zoneName);
//		timeOut(1000);;
		writeText(address, addressText);
		timeOut(1000);;
		clickOnElement(paymentCOD);
		timeOut(1000);
	}
	@Step("Scroll down to Confirm order button and higlight it")
	public void scrolldown() {
		scorllToElement(confirm_Order);
		timeOut(2000);
		highlighter(confirm_Order);
		timeOut(2000);
	}
	

}
