package test;

import org.testng.annotations.Test;

import io.qameta.allure.Step;
import pages.Doing;
import pages.Homepage;
import pages.Login;
import pages.Logout;
import pages.CartPage;
import pages.Payment;
import pages.Shipping;
import utilities.Driversetup;

public class Logintest extends Driversetup{
	
	Homepage  home = new Homepage();
	Login loged = new Login();
	Doing doing = new Doing();
	Payment pay = new Payment();
	CartPage myCartPage = new CartPage();
	Shipping ship = new Shipping();
	Logout logout = new Logout();
	
	
	@Step("Running All Test")
	@Test
	public void run () {
		getDriver().get("https://www.rokomari.com/book");
		home.sign();
		loged.enterUsername("karimrahman564@gmail.com");
		loged.enterPassword("karim123@");
		doing.menu();
		doing.test2();
		doing.scrollAndGotoNextPage();
		pay.selectBook();
		myCartPage.goToMycartPage();
		ship.goToSippingPage();
		ship.fillUpForm();
		ship.scrolldown();
		logout.clickSignOut();
		
	}
}
