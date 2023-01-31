package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class Login extends Basepage {
	
	protected By USERNAME = By.xpath("//input[@id='identifierId']");
	protected By PASSWORD = By.cssSelector("input[name='password']");
	protected By NEXT1 =  By.cssSelector("button[class = \"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]");
	protected By NEXT2 = By.cssSelector("button[class =\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]");
	public By loginUserName = By.cssSelector(".user-name");
	public void enterUsername(String username) {
		writeText(USERNAME, username);
		clickOnElement(NEXT1);
	}
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
		clickOnElement(NEXT2);
	}
	@Step("Highlight user name after successful sign-up")
	public void userNameHighlight() {
		highlighter(loginUserName);
	}
}
