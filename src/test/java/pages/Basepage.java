package pages;
import java.io.ByteArrayInputStream;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import static utilities.Driversetup.getDriver;
public class Basepage {
	public WebElement getElemnt(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
	}
	public String currentPageUrl() {
		return getDriver().getCurrentUrl();
	}
	public String getTitle() 
	{
		return getDriver().getTitle();
	}
//	public void accept(By locator) {
//		Alert alert = getElemnt(locator).a;
//		alert.accept();
//
//	}
//	
//	public void dismiss() {
//		Alert alert = alertWait();
//		alert.dismiss();
//
//	}
//	public void timeOut() {
//		try {
//			Thread.sleep(2000);
//		} catch ( InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	public void timeOut(int duretionMS) {
		try {
			Thread.sleep(duretionMS);
		} catch ( InterruptedException e) {
			e.printStackTrace();
		}
	}
//	public void waitForLoad() {
//	    new WebDriverWait(getDriver(), 30).until((ExpectedCondition<Boolean>) wd ->
//	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
//	}
	public void selectitem(By element, String visibleText) {
		Select selectItems = new Select(getElemnt(element));
		selectItems.selectByVisibleText(visibleText);
	}
	public void clickOnElement(By locator) {
		getElemnt(locator).click();
	}
	public String getElementText(By locator) {
		return getElemnt(locator).getText();
	}
//	public String getTitle(By locator) {
//		return getElemnt(locator).getText();
//	}
	public void writeText(By locator, String text) {
		getElemnt(locator).sendKeys(text);	
	}
	public void action2(By name) {
		Actions actions = new Actions(getDriver());
		actions.clickAndHold(getElemnt(name)).build().perform();
	}
	public void highlighter(By element) {
		WebElement el = getElemnt(element);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background: beige');", el);

	}
	public void action3(By cart) {
		Actions act = new Actions(getDriver());
	    act.moveToElement(getElemnt(cart)).click().build().perform();
	}
	public void clickOnAButtonJs(String script) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		//WebElement el = (WebElement)(js.executeScript("return "+ script));
		// js.executeScript("arguments[0].click();" ,el);
		js.executeScript(script + ".click();");
	}
	public void scorllToElement(By element) {
		WebElement el = getElemnt(element);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", el);
	}
	public Alert alertWait() {
		WebDriverWait wait;
		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
//		public void getAlertText() {
//			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//			Alert simpleAlert =getDriver().switchTo().alert();
//            simpleAlert.accept();
//	}
	@Step("Taking a screenshot for {0}")
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES) ));
	}
}
	