package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.Homepage;
import utilities.Driversetup;

public class Home_test extends Driversetup {
//	public String homePageUrl = "https://www.rokomari.com/book";
//	public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
	Homepage  home = new Homepage();
	@Test
	public void homePageTest() throws InterruptedException {
		getDriver().get("https://www.rokomari.com/book");
		Thread.sleep(1000);
		assertEquals(getDriver().getCurrentUrl(), "https://www.rokomari.com/book");
		Thread.sleep(1000);
		assertEquals(home.pagetitle(),"Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com" );
		Thread.sleep(2000);
		home.takeScreenShot("HomePage");
		home.closePopupBannaer();
		home.takeScreenShot("HomePage");
		
		
//		time.waitForPageLoad();
//		assertEquals(homePage.getCurrentUrl(), lc.homePageUrl);
//		time.timeOut(1000);
//		assertEquals(homePage.pagetitle(), lc.homePageTitle);
//		time.timeOut(1000);
//		screenshot.takeScreenShot("Homepage");
//		homePage.closePopupBannaer();
//		screenshot.takeScreenShot("Homepage");
	}
	
}
