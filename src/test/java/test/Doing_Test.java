package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.Doing;
import pages.Payment;
import utilities.Driversetup;

public class Doing_Test extends Driversetup{
	//public String writingButtonText = "লেখক";
	//public String writerNameAndBooksText = "হুমায়ূন আহমেদ এর বই সমূহ";
	//public String productPageTitle = "Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com";
	
	
	Doing doing = new Doing();
	Payment pay = new Payment();
	@Test
	public void DoingPageTest() throws InterruptedException{
		getDriver().get("https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0");
		assertEquals(getDriver().getTitle(), "Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com");
		doing.menu();
		doing.takeScreenShot("Doing");
		Thread.sleep(1000);
		
		doing.test2();
		doing.takeScreenShot("Writer Books Collection after filter");
		Thread.sleep(1000);
		doing.scrollAndGotoNextPage();
		doing.takeScreenShot("Writer Books Collection 2nd page with filter");
		pay.selectBook();
		pay.takeScreenShot("Product page after a book added in cart");
		
		
	}
	

}
