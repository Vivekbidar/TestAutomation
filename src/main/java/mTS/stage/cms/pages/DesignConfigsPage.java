package mTS.stage.cms.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import mTS.stage.cms.testdata.ExcelTestData;

import java.io.File;



public class DesignConfigsPage  {

	public static WebDriver driver;

	//constructor for maintaining same driver instance
	public DesignConfigsPage(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(10));
	}


	//Webelements for navigating design configs page
	private By designConfigsLnk=By.xpath("//div[@title='Design Configs']");
	//Webelements for pages module
	private By pageTb = By.xpath("//span[text()='Pages']");
	private By addPageBtn = By.xpath("//span[text()='Add Page']");
	private By nameTxtBx = By.id("name_input");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By searchMenuTxtBx = By.xpath("//input[@type='text']");
	private By oneOfOneResultsTxt = By.xpath("//p[text()='1-1 of 1']");
	private By uploadImage = By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge']");
	private By closeButton = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root']");
	private By draftButton = By.xpath("//span[text()='Draft']");



	//Webelements for banners module component
	private By pageNameTxt = By.xpath("(//tbody[@class='MuiTableBody-root']/tr/td)[1]");
	private By addComponentBtn = By.xpath("//button[@type='submit']");
	private By bannersDpDwn = By.xpath("//div[text()='Banners']");
	private By heroBanner1BComponent = By.xpath("//div[text()='1B - Hero Banner, H1, CTA']");
	private By targetLocationArea = By.xpath("//div[@class='droppable page-builder-space']");
	private By h1TitleTxtBx = By.xpath("//div[text()='1B - Hero Banner, H1, CTA']/../..//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']");
	private By imageUploadbtn = By.xpath("//div[@class='d-flex align-items-center img-select justify-content-center']");////*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge']
	private By collapse1BHeroBanner = By.xpath("//div[@data-rbd-drag-handle-draggable-id='HERO_BANNER_W_CTA_0']//div[text()='1B - Hero Banner, H1, CTA']");
	private By saveDraftbtn=By.xpath("//span[text()='Save as Draft']");

	//Webelements related to carousels component
	private By carouselsDpDwn = By.xpath("//div[text()='Carousels']");
	private By landscape2DComponent = By.xpath("//div[text()='2D - Landscape C, Body, CTA']");
	private By h2TitleOfCarouselsComponentTxtBx = By.xpath("//div[text()='2D - Landscape C, Body, CTA']/../..//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']");
	private By body1OfCarouselsComponentTxtBx = By.xpath("//div[text()='2D - Landscape C, Body, CTA']/../..//textarea[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputMultiline MuiInput-inputMultiline MuiInputBase-inputAdornedEnd']");
	private By collapseLandscape2Dcomponent = By.xpath("//div[@class='d-flex page-builder-component']//div[text()='2D - Landscape C, Body, CTA']");
	private By slie2Button = By.xpath("//span[text()='Slide 2']");
	private By slie3Button = By.xpath("//span[text()='Slide 3']");
	private By slie4Button = By.xpath("//span[text()='Slide 4']");
	private By removeButton = By.xpath("//div[text()='Remove']");
	private By selectRedirectionDropDown = By.xpath("//div[@id='redirect_page_select']");
	private By selectRedirectionPageOption = By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root   MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']");


	//Webelements related to image component
	private By imageDpDwn = By.xpath("//div[text()='Image Components']");
	private By largeimage10Component = By.xpath("//div[text()='10 - Large Image w/Body, CTA, H3']");
	private By h1TitleOfImageComponentTxtBx = By.xpath("(//div[text()='10 - Large Image w/Body, CTA, H3']/../..//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd'])[1]");
	private By h3TitleOfImageComponentTxtBx = By.xpath("(//div[text()='10 - Large Image w/Body, CTA, H3']/../..//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd'])[2]");
	private By body1TitleOfImageComponentTxtBx = By.xpath("//textarea[@aria-invalid='false']");
	private By collapselargeimage10Component = By.xpath("//div[@class='page-builder-component-item']//div[text()='10 - Large Image w/Body, CTA, H3']");


	public void uploadImage() throws AWTException {
		String fileLocation = "C:\\Users\\VivekanandS\\Desktop\\Green image (3).png";
		StringSelection str = new StringSelection(fileLocation);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void clearData(By selector) {
		WebElement element = driver.findElement(selector);
		String s = Keys.chord(Keys.CONTROL, "a");
		element.sendKeys(s);
		element.sendKeys(Keys.DELETE);
	}



	//getter setter methods for navigating design configs page
	public By getDesignConfigsLnk() {
		return designConfigsLnk;
	}
	public void setDesignConfigsLnk(By designConfigsLnk) {
		this.designConfigsLnk = designConfigsLnk;
	}

	//getter setter method for pages module
	public By getPageTb() {
		return pageTb;
	}
	public void setPageTb(By pageTb) {
		this.pageTb = pageTb;
	}
	public By getAddPageBtn() {
		return addPageBtn;
	}
	public void setAddPageBtn(By addPageBtn) {
		this.addPageBtn = addPageBtn;
	}
	public By getNameTxtBx() {
		return nameTxtBx;
	}
	public void setNameTxtBx(By nameTxtBx) {
		this.nameTxtBx = nameTxtBx;
	}
	public By getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}
	public By getSearchMenuTxtBx() {
		return searchMenuTxtBx;
	}
	public void setSearchMenuTxtBx(By searchMenuTxtBx) {
		this.searchMenuTxtBx = searchMenuTxtBx;
	}
	public By getOneOfOneResultsTxt() {
		return oneOfOneResultsTxt;
	}
	public void setOneOfOneResultsTxt(By oneOfOneResultsTxt) {
		this.oneOfOneResultsTxt = oneOfOneResultsTxt;
	}
	public By getUploadImage() {
		return uploadImage;
	}
	public void setUploadImage(By uploadImage) {
		this.uploadImage = uploadImage;
	}
	public By getDraftButton() {
		return draftButton;
	}

	public void setDraftButton(By draftButton) {
		this.draftButton = draftButton;
	}

	//getter setter for banners component
	public By getPageNameTxt() {
		return pageNameTxt;
	}
	public void setPageNameTxt(By pageNameTxt) {
		this.pageNameTxt = pageNameTxt;
	}
	public By getAddComponentBtn() {
		return addComponentBtn;
	}
	public void setAddComponentBtn(By addComponentBtn) {
		this.addComponentBtn = addComponentBtn;
	}
	public By getBannersDpDwn() {
		return bannersDpDwn;
	}
	public void setBannersDpDwn(By bannersDpDwn) {
		this.bannersDpDwn = bannersDpDwn;
	}
	public By getHeroBanner1BComponent() {
		return heroBanner1BComponent;
	}
	public void setHeroBanner1BComponent(By heroBanner1BComponent) {
		this.heroBanner1BComponent = heroBanner1BComponent;
	}
	public By getTargetLocationArea() {
		return targetLocationArea;
	}
	public void setTargetLocationArea(By targetLocationArea) {
		this.targetLocationArea = targetLocationArea;
	}
	public By getH1TitleTxtBx() {
		return h1TitleTxtBx;
	}
	public void setH1TitleTxtBx(By h1TitleTxtBx) {
		this.h1TitleTxtBx = h1TitleTxtBx;
	}
	public By getImageUploadbtn() {
		return imageUploadbtn;
	}
	public void setImageUploadbtn(By imageUploadbtn) {
		this.imageUploadbtn = imageUploadbtn;
	}
	public By getCollapse1BHeroBanner() {
		return collapse1BHeroBanner;
	}
	public void setCollapse1BHeroBanner(By collapse1bHeroBanner) {
		collapse1BHeroBanner = collapse1bHeroBanner;
	}
	public By getSaveDraftbtn() {
		return saveDraftbtn;
	}
	public void setSaveDraftbtn(By saveDraftbtn) {
		this.saveDraftbtn = saveDraftbtn;
	}
	public By getCloseButton() {
		return closeButton;
	}

	public void setCloseButton(By closeButton) {
		this.closeButton = closeButton;
	}

	//getter setter for carousels component
	public By getCarouselsDpDwn() {
		return carouselsDpDwn;
	}
	public void setCarouselsDpDwn(By carouselsDpDwn) {
		this.carouselsDpDwn = carouselsDpDwn;
	}
	public By getLandscape2DComponent() {
		return landscape2DComponent;
	}
	public void setLandscape2DComponent(By landscape2dComponent) {
		landscape2DComponent = landscape2dComponent;
	}
	public By getH2TitleOfCarouselsComponentTxtBx() {
		return h2TitleOfCarouselsComponentTxtBx;
	}
	public void setH2TitleOfCarouselsComponentTxtBx(By h2TitleOfCarouselsComponentTxtBx) {
		this.h2TitleOfCarouselsComponentTxtBx = h2TitleOfCarouselsComponentTxtBx;
	}
	public By getBody1OfCarouselsComponentTxtBx() {
		return body1OfCarouselsComponentTxtBx;
	}
	public void setBody1OfCarouselsComponentTxtBx(By body1OfCarouselsComponentTxtBx) {
		this.body1OfCarouselsComponentTxtBx = body1OfCarouselsComponentTxtBx;
	}
	public By getCollapseLandscape2Dcomponent() {
		return collapseLandscape2Dcomponent;
	}
	public void setCollapseLandscape2Dcomponent(By collapseLandscape2Dcomponent) {
		this.collapseLandscape2Dcomponent = collapseLandscape2Dcomponent;
	}
	public By getSlie2Button() {
		return slie2Button;
	}
	public void setSlie2Button(By slie2Button) {
		this.slie2Button = slie2Button;
	}
	public By getSlie3Button() {
		return slie3Button;
	}
	public void setSlie3Button(By slie3Button) {
		this.slie3Button = slie3Button;
	}
	public By getSlie4Button() {
		return slie4Button;
	}
	public void setSlie4Button(By slie4Button) {
		this.slie4Button = slie4Button;
	}
	public By getRemoveButton() {
		return removeButton;
	}
	public void setRemoveButton(By removeButton) {
		this.removeButton = removeButton;
	}
	public By getSelectRedirectionDropDown() {
		return selectRedirectionDropDown;
	}
	public void setSelectRedirectionDropDown(By selectRedirectionDropDown) {
		this.selectRedirectionDropDown = selectRedirectionDropDown;
	}
	public By getSelectRedirectionPageOption() {
		return selectRedirectionPageOption;
	}
	public void setSelectRedirectionPageOption(By selectRedirectionPageOption) {
		this.selectRedirectionPageOption = selectRedirectionPageOption;
	}


	//getter setter for images component
	public By getImageDpDwn() {
		return imageDpDwn;
	}
	public void setImageDpDwn(By imageDpDwn) {
		this.imageDpDwn = imageDpDwn;
	}
	public By getLargeimage10Component() {
		return largeimage10Component;
	}
	public void setLargeimage10Component(By largeimage10Component) {
		this.largeimage10Component = largeimage10Component;
	}
	public By getH1TitleOfImageComponentTxtBx() {
		return h1TitleOfImageComponentTxtBx;
	}
	public void setH1TitleOfImageComponentTxtBx(By h1TitleOfImageComponentTxtBx) {
		this.h1TitleOfImageComponentTxtBx = h1TitleOfImageComponentTxtBx;
	}
	public By getH3TitleOfImageComponentTxtBx() {
		return h3TitleOfImageComponentTxtBx;
	}
	public void setH3TitleOfImageComponentTxtBx(By h3TitleOfImageComponentTxtBx) {
		this.h3TitleOfImageComponentTxtBx = h3TitleOfImageComponentTxtBx;
	}
	public By getBody1TitleOfImageComponentTxtBx() {
		return body1TitleOfImageComponentTxtBx;
	}
	public void setBody1TitleOfImageComponentTxtBx(By body1TitleOfImageComponentTxtBx) {
		this.body1TitleOfImageComponentTxtBx = body1TitleOfImageComponentTxtBx;
	}
	public By getCollapselargeimage10Component() {
		return collapselargeimage10Component;
	}
	public void setCollapselargeimage10Component(By collapselargeimage10Component) {
		this.collapselargeimage10Component = collapselargeimage10Component;
	}




	public void navigateToDesignConfigPage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getDesignConfigsLnk()).click();

	}

	public boolean createPage() throws IOException, InvalidFormatException {
		driver.findElement(getAddPageBtn()).click();
		driver.findElement(getNameTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		driver.findElement(getAddBtn()).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSearchMenuTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		boolean isPageCreated = driver.findElement(getOneOfOneResultsTxt()).isDisplayed();
		return isPageCreated;
	}

	public boolean addComponentsInAPage() throws InvalidFormatException, IOException, AWTException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSearchMenuTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getPageNameTxt()).click();
		driver.findElement(getAddComponentBtn()).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement bannersDpDwnScrolling=driver.findElement(getBannersDpDwn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", bannersDpDwnScrolling);
		bannersDpDwnScrolling.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions actions=new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath("//div[text()='1B - Hero Banner, H1, CTA']")), driver.findElement(By.xpath("//div[@class='droppable page-builder-space']"))).build().perform();
		driver.findElement(getH1TitleTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 1));
		driver.findElement(getUploadImage()).click();
		uploadImage();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getCollapse1BHeroBanner()).click();

		//carousel
		WebElement CarouselsDpDwnScrolling = driver.findElement(getCarouselsDpDwn());
		js.executeScript("arguments[0].scrollIntoView();", CarouselsDpDwnScrolling);
		CarouselsDpDwnScrolling.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.dragAndDrop(driver.findElement(By.xpath("//div[text()='2D - Landscape C, Body, CTA']")), driver.findElement(By.xpath("//div[@class='droppable page-builder-space']"))).build().perform();
		driver.findElement(getH2TitleOfCarouselsComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 2));
		driver.findElement(getBody1OfCarouselsComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 2, 2));
		driver.findElement(getUploadImage()).click();
		uploadImage();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSelectRedirectionDropDown()).click();
		driver.findElement(getSelectRedirectionPageOption()).click();
		driver.findElement(getSlie2Button()).click();
		driver.findElement(getRemoveButton()).click();
		driver.findElement(getSlie3Button()).click();
		driver.findElement(getRemoveButton()).click();
		driver.findElement(getSlie4Button()).click();
		driver.findElement(getRemoveButton()).click();
		driver.findElement(getCollapseLandscape2Dcomponent()).click();

		//image component
		WebElement getImageDpDwnScrolling = driver.findElement(getImageDpDwn());
		js.executeScript("arguments[0].scrollIntoView();", getImageDpDwnScrolling);
		getImageDpDwnScrolling.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actions.dragAndDrop(driver.findElement(By.xpath("//div[text()='10 - Large Image w/Body, CTA, H3']")), driver.findElement(By.xpath("//div[@class='droppable page-builder-space']"))).build().perform();
		driver.findElement(getH1TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 3));
		driver.findElement(getH3TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 2, 3));
		driver.findElement(getBody1TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 3, 3));
		driver.findElement(getUploadImage()).click();
		uploadImage();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getCollapselargeimage10Component()).click();
		driver.findElement(getCloseButton()).click();
		WebElement clickongetSaveDraftbtn = driver.findElement(getSaveDraftbtn());
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickongetSaveDraftbtn);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSearchMenuTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		boolean isPageInDraft = driver.findElement(getDraftButton()).isDisplayed();
		return isPageInDraft;


	}

	public boolean editComponentsInAPage() throws InvalidFormatException, IOException
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSearchMenuTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getPageNameTxt()).click();
		clearData(getH1TitleTxtBx());
		driver.findElement(getH1TitleTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 2, 1));
		driver.findElement(getCollapse1BHeroBanner()).click();

		//carousel
		clearData(getH2TitleOfCarouselsComponentTxtBx());
		driver.findElement(getH2TitleOfCarouselsComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 3, 2));
		clearData(getBody1OfCarouselsComponentTxtBx());
		driver.findElement(getBody1OfCarouselsComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 4, 2));
		driver.findElement(getCollapseLandscape2Dcomponent()).click();

		//image component
		clearData(getH1TitleOfImageComponentTxtBx());
		driver.findElement(getH1TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 4, 3));
		clearData(getH3TitleOfImageComponentTxtBx());
		driver.findElement(getH3TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 5, 3));
		clearData(getBody1TitleOfImageComponentTxtBx());
		driver.findElement(getBody1TitleOfImageComponentTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 6, 3));
		driver.findElement(getCollapselargeimage10Component()).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement clickongetSaveDraftbtnEdit = driver.findElement(getSaveDraftbtn());
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickongetSaveDraftbtnEdit);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(getSearchMenuTxtBx()).sendKeys(ExcelTestData.testData("DesignConfigs", 1, 0));
		boolean isPageEdited = driver.findElement(getDraftButton()).isDisplayed();
		return isPageEdited;

	}
}



