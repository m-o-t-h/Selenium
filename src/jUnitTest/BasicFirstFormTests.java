package jUnitTest;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObject.*;

public class BasicFirstFormTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private BasicFirstForm simpleFormPage;

	
	public void initializeSettings() {
		simpleFormPage = new BasicFirstForm(webDriver);
		simpleFormPage.openViaUrl(BasicFirstForm.getUrl());
		simpleFormPage.initializeElements(webDriver);
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", path);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	//Tests for Single Input Field section
	@Test
	public void singleInputTest() throws Exception {
		initializeSettings();
		simpleFormPage.messageBoxClick();
		simpleFormPage.messageBoxInputText("Test message");
		simpleFormPage.showMessageButtonClick();
		
		Assert.assertEquals("Test message",simpleFormPage.getResultMessage().getText());
	}
	
	//Tests Two Input Fields section
	@Test
	public void noInputTest() throws Exception {
		initializeSettings();
		simpleFormPage.valueResultButtonClick();
		
		Assert.assertEquals("NaN",simpleFormPage.getValueResultMessage().getText());
	}
	
	@Test
	public void twoNumberTest() throws Exception {
		initializeSettings();
		simpleFormPage.valueFieldAClick();
		simpleFormPage.valueFieldAInput("1900");
		simpleFormPage.valueFieldBClick();
		simpleFormPage.valueFieldBInput("39");
		simpleFormPage.valueResultButtonClick();
		
		Assert.assertEquals("1939",simpleFormPage.getValueResultMessage().getText());
	}
	
	@Test
	public void oneNumberTest()throws Exception {
		initializeSettings();
		simpleFormPage.valueFieldAClick();
		simpleFormPage.valueFieldAInput("123");
		simpleFormPage.valueFieldBClick();
		simpleFormPage.valueFieldBInput("test");
		simpleFormPage.valueResultButtonClick();
		
		Assert.assertEquals("NaN",simpleFormPage.getValueResultMessage().getText());
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}
