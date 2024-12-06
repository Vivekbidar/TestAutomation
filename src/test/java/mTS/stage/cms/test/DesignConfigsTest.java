package mTS.stage.cms.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mTS.stage.cms.base.BaseClass;
import mTS.stage.cms.pages.DesignConfigsPage;
import mTS.stage.cms.pages.LoginPage;

public class DesignConfigsTest   {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DesignConfigsPage designConfigsPage;

	@BeforeMethod
	public void preSetUp() {
		baseClass = new BaseClass();
		properties = baseClass.initializeProperties();
		driver = baseClass.initializeBrowser();
		driver.get(properties.getProperty("stageURL"));
		loginPage = new LoginPage(driver, properties);

	}

	@Test(enabled = true, priority = 1)
	public void verifyCreatePageTest() throws IOException, InvalidFormatException {
		loginPage.loginAsUser();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		Boolean isPageCreated =designConfigsPage.createPage();
		Assert.assertTrue(isPageCreated, "Design Config page is not created");
	}

	@Test(enabled = true, priority = 2)
	public void verifyAddComponentsTest() throws InvalidFormatException, IOException, AWTException {
		loginPage.loginAsUser();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		Boolean isPageInDraft =designConfigsPage.addComponentsInAPage();
		Assert.assertTrue(isPageInDraft, "The components are not added and failed to draft the page");
	}

	@Test(enabled = true, priority = 3)
	public void verifyeditComponentsTest() throws InvalidFormatException, IOException, AWTException {
		loginPage.loginAsUser();
		designConfigsPage=new DesignConfigsPage(driver);
		designConfigsPage.navigateToDesignConfigPage();
		Boolean isPageEdited =designConfigsPage.editComponentsInAPage();
		Assert.assertTrue(isPageEdited, "The components are not edited and failed to draft the page");
	}

	@AfterMethod
	public void postSetUp() {
		driver.quit();
	}
}

