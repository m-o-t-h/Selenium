package jUnitTest;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObject.*;
public class TableFilterTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private TableFilterDemo tableFilterPage;
	
	
	public void initializeSettings() {
		tableFilterPage = new TableFilterDemo(webDriver);
		tableFilterPage.openViaUrl(TableFilterDemo.getUrl());
		tableFilterPage.initializeElements(webDriver);
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
	public void filterGreenThenAllElements() throws Exception {
		initializeSettings();
		tableFilterPage.greenButtonClick();
		Thread.sleep(1000);
		tableFilterPage.allColoursButtonClick();
	}
	
	@Test
	public void filterRedThenAllElements() throws Exception {
		initializeSettings();
		tableFilterPage.redButtonClick();
		Thread.sleep(1000);
		tableFilterPage.allColoursButtonClick();
	}
	
	@Test
	public void filterOrangeThenAllElements() throws Exception {
		initializeSettings();
		tableFilterPage.orangeButtonClick();
		Thread.sleep(1000);
		tableFilterPage.allColoursButtonClick();
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}
