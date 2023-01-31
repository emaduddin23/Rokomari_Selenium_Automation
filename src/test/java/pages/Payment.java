package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Payment extends Basepage{
	public String addtocardFortThItemJs = "document.querySelectorAll(\".btn.cart-btn.js--add-to-cart\")[3]";
	public By bookName = By.xpath("(//p[1])[@class='book-title'][4]");
	public By cart = By.id("cart-icon");
	
//	public void cart1() {
//		//pay(book);
//		action3(cart);
//	}
	@Step("Add to cart the selected 4th book")
	public void selectBook() {
		clickOnAButtonJs(addtocardFortThItemJs);
		timeOut(4000);
	}	
	
}
