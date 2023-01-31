package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Doing extends Basepage{
	
	public By name =By.id("js--authors");
	protected By name2 = By.cssSelector("a[href='/book/author/1?ref=mm_p0']");
	protected By name3 = By.cssSelector("label[for='rok-filter-categoryIds-677']");
	protected By name4 = By.cssSelector("label[for='rok-filter-categoryIds-1321']");
	public By nextPageButton= By.xpath("//a[normalize-space()='Next']");
	
	@Step("Select the Author")
	public void menu() {
		action2(name);
	}
	@Step("Collect actual current page title ")
	public String pageTitle() {
		return getTitle();
	}
	
	@Step("Selet the item")
	public void test2() 
	{
		clickOnElement(name2);
		clickOnElement(name3);
		clickOnElement(name4);	
	}
	@Step("Scroll down to page numbers and browse to the next page")
	public void scrollAndGotoNextPage() {
		scorllToElement(nextPageButton);
		timeOut(2000);
		clickOnElement(nextPageButton);
	}
	


	
	
	
	
	

	
	

}
