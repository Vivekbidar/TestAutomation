package mTS.stage.cms.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BaseClass {

	public WebDriver driver;
	public Properties properties;
	public BaseClass baseClass;

	public Properties initializeProperties() {
		try {
			properties = new Properties();

			FileInputStream fis = new FileInputStream(".\\src\\main\\java\\mTS\\stage\\cms\\testdata\\config.properties");
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties;
	}

	public WebDriver initializeBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}
	
}
