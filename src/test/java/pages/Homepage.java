package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Homepage extends Basepage{
	
	
	protected By signed = By.xpath("//a[normalize-space()='Sign in']");
	protected By Signup = By.cssSelector("a[class='js--registration-form-btn']");
	protected By google = By.xpath("//div[@id='js--registration-form']//button[@class='btn btn-social-google'][normalize-space()='Google']");
	public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
	//public By home_welcomeMassage = By.cssSelector("div[id='js--entry-popup'] i[class='ion-close-round']");
	//public By home_welcomeMassage = By.cssSelector(".header-left .welcome-msg");
	
	@Step("Collect actual current page URL")
	public String getCurrentUrl() {
		return currentPageUrl();
	}
	@Step("Collect actual current page title ")
	public String pagetitle() {
		return getTitle();
	}
	@Step("Close home page popup banner")
	public void closePopupBannaer() {
		timeOut(5000);
		try {
			clickOnAButtonJs(hompagePopupBannarJs);
		} catch (Exception e) {
			System.out.println("Pop up is not present");
		}
		timeOut(2000);
	}
	@Step("Login with google button")
	public void sign() {
		clickOnElement(signed);
		clickOnElement(Signup);
		clickOnElement(google);
		
	}
}
