package jUnitTest;

import java.util.concurrent.TimeUnit;
import pageObject.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BootstrapModalTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private BootstrapModal bootstrapPage;

	
	public void initializeSettings() {
		bootstrapPage = new BootstrapModal(webDriver);
		bootstrapPage.openViaUrl(BootstrapModal.getUrl());
		bootstrapPage.initializeElements(webDriver);
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
	public void saveFirstModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection1Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection1Click();
	}
	
	@Test
	public void closeFirstModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection1Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection1Click();
	}
	
	@Test
	public void saveSecondModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection2Click();
	}
	
	@Test
	public void closeSecondModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection2Click();
	}
	
	@Test
	public void saveThirdModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.launchSection3Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection3Click();
	}
	
	@Test
	public void closeThirdModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.launchSection3Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection3Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection2Click();
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}
}
