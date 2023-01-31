package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class CartPage extends Basepage{
	public By clickCardButton = By.cssSelector(".js--cart-amount.amount");
	
	@Step("Click on My Cart Icon and wait for page load")
	public void goToMycartPage() {
		clickOnElement(clickCardButton);
		timeOut(2000);
	}

}
