package jUnitTest;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObject.*;
public class WindowPopupTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private WindowPopupExample windowPopupPage;

	
	public void initializeSettings() {
		windowPopupPage = new WindowPopupExample(webDriver);
		windowPopupPage.openViaUrl(WindowPopupExample.getUrl());
		windowPopupPage.initializeElements(webDriver);
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
	public void openTwitterThenClose() throws Exception {
		String winHandleBefore = webDriver.getWindowHandle();
		initializeSettings();
		windowPopupPage.followTwitterButtonClick();
		for(String winHandle : webDriver.getWindowHandles()){
			webDriver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		webDriver.close();
		webDriver.switchTo().window(winHandleBefore);
	}
	
	@Test
	public void openFacebookThenClose() throws Exception {
		String winHandleBefore = webDriver.getWindowHandle();
		initializeSettings();
		windowPopupPage.likeFacebookButtonClick();
		for(String winHandle : webDriver.getWindowHandles()){
			webDriver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		webDriver.close();
		webDriver.switchTo().window(winHandleBefore);
	}

	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}
