package mTS.stage.cms.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mTS.stage.cms.base.BaseClass;


public class LoginPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;


	public LoginPage(WebDriver driver, Properties properties) {
		this.driver = driver;
		this.properties = properties;

	}

	private By emailTextBox = By.id("email");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.xpath("//span[contains(text(),'LOGIN')]");
	private By firstNavigationButton = By.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-one-continue-btn-icon.png']");
	private By secondNavigationButton = By.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-two-continue-btn-icon.png']");
	private By thirdNavigationButton = By.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-three-continue-btn-icon.png']");


	public By getEmailTextBox() {
		return emailTextBox;
	}
	public void setEmailTextBox(By emailTextBox) {
		this.emailTextBox = emailTextBox;
	}
	public By getPasswordTextBox() {
		return passwordTextBox;
	}
	public void setPasswordTextBox(By passwordTextBox) {
		this.passwordTextBox = passwordTextBox;
	}
	public By getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(By loginButton) {
		this.loginButton = loginButton;
	}
	public By getFirstNavigationButton() {
		return firstNavigationButton;
	}
	public void setFirstNavigationButton(By firstNavigationButton) {
		this.firstNavigationButton = firstNavigationButton;
	}
	public By getSecondNavigationButton() {
		return secondNavigationButton;
	}
	public void setSecondNavigationButton(By secondNavigationButton) {
		this.secondNavigationButton = secondNavigationButton;
	}
	public By getThirdNavigationButton() {
		return thirdNavigationButton;
	}
	public void setThirdNavigationButton(By thirdNavigationButton) {
		this.thirdNavigationButton = thirdNavigationButton;
	}



	public void loginAsUser() {
		driver.findElement(getEmailTextBox()).sendKeys(properties.getProperty("username"));
		driver.findElement(getPasswordTextBox()).sendKeys(properties.getProperty("password"));
		driver.findElement(getLoginButton()).click();
		driver.findElement(getFirstNavigationButton()).click();
		driver.findElement(getSecondNavigationButton()).click();
		driver.findElement(getThirdNavigationButton()).click();
	}
}
