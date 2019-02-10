package jUnitTest;

import java.util.concurrent.TimeUnit;
import pageObject.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptAlertsTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private JavaScriptAlerts javaScriptAlertsPage;

	
	public void initializeSettings() {
		javaScriptAlertsPage = new JavaScriptAlerts(webDriver);
		javaScriptAlertsPage.openViaUrl(JavaScriptAlerts.getUrl());
		javaScriptAlertsPage.initializeElements(webDriver);
	}
	
	public void acceptAlert() {
		Alert alert = webDriver.switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() {
		Alert alert = webDriver.switchTo().alert();
		alert.dismiss();
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
	public void confirmAlertBox() throws Exception {
		initializeSettings();
		javaScriptAlertsPage.submitButtonSection1Click();
		Thread.sleep(2000);
		acceptAlert();
	}
	
	@Test
	public void confirmPopupBox() throws Exception {
		initializeSettings();
		javaScriptAlertsPage.submitButtonSection2Click();
		Thread.sleep(2000);
		acceptAlert();
		
		Assert.assertEquals("You pressed OK!",javaScriptAlertsPage.getResultMessageSection2().getText());
	}
	
	@Test 
	public void dismissPopupBox() throws Exception {
		initializeSettings();
		javaScriptAlertsPage.submitButtonSection2Click();
		Thread.sleep(2000);
		dismissAlert();
		
		Assert.assertEquals("You pressed Cancel!",javaScriptAlertsPage.getResultMessageSection2().getText());
	}
	
	@Test
	public void inputPopupBox() throws Exception {
		initializeSettings();
		javaScriptAlertsPage.submitButtonSection3Click();
		webDriver.switchTo().alert().sendKeys("Better than newbie");
		Thread.sleep(2000);
		acceptAlert();
		
		Assert.assertEquals("You have entered 'Better than newbie' !",javaScriptAlertsPage.getResultMessageSection3().getText());
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}
}
