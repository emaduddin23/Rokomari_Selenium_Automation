package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Logout extends Basepage{
	public By loginUserName = By.cssSelector(".user-name");
	public By signout = By.xpath("//a[normalize-space()='Sign Out']");
	
	@Step("Click on username button and click on sign out button from drop-down")
	public void clickSignOut() {
		clickOnElement(loginUserName);
		timeOut(1000);
		clickOnElement(signout);
		timeOut(5000);
	}

}
