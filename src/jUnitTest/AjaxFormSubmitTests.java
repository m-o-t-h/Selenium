package jUnitTest;
import pageObject.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AjaxFormSubmitTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private AjaxFormSubmit ajaxFormSubmitPage;
	
	
	public void initializeSettings() {
		ajaxFormSubmitPage = new AjaxFormSubmit(webDriver);
		ajaxFormSubmitPage.openViaUrl(AjaxFormSubmit.getUrl());
		ajaxFormSubmitPage.initializeElements(webDriver);
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", path);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void inputTextIntoBoxes() throws Exception {
		initializeSettings();
		ajaxFormSubmitPage.nameBoxClick();
		ajaxFormSubmitPage.nameBoxInputText("Joanna");
		ajaxFormSubmitPage.commentBoxClick();
		ajaxFormSubmitPage.commentBoxInputText("Komentarz");
		ajaxFormSubmitPage.submitButtonClick();
		Thread.sleep(2000);
		
		Assert.assertEquals("Form submited Successfully!",ajaxFormSubmitPage.getResultMessage().getText());
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}
