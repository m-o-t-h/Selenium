package jUnitTest;

import java.util.concurrent.TimeUnit;
import pageObject.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButtonsTests extends BasePath {
	private String path=CHROMEPATH;
	private RemoteWebDriver webDriver;
	private RadioButtonsDemo radioButtonsPage;
	

	public void initializeSettings() {
		radioButtonsPage = new RadioButtonsDemo(webDriver);
		radioButtonsPage.openViaUrl(RadioButtonsDemo.getUrl());
		radioButtonsPage.initializeElements(webDriver);
	}
	 
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", path);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	//Tests for Radio Button Demo section
	@Test
	public void maleTest() throws Exception {
		initializeSettings();
		radioButtonsPage.maleRBClick();
		radioButtonsPage.checkButtonTier1Click();
		
		Assert.assertEquals("Radio button 'Male' is checked",radioButtonsPage.getResultMessageTier1().getText());
	}
	
	@Test
	public void femaleTest() throws Exception {
		initializeSettings();
		radioButtonsPage.femaleRBClick();
		radioButtonsPage.checkButtonTier1Click();
		
		Assert.assertEquals("Radio button 'Female' is checked",radioButtonsPage.getResultMessageTier1().getText());
	}
	
    @Test
    public void nothingCheckedTest() throws Exception {
    	initializeSettings();
    	radioButtonsPage.checkButtonTier1Click();

        Assert.assertEquals("Radio button is Not checked",radioButtonsPage.getResultMessageTier1().getText());
    }
	
	//Tests for Group Radio Buttons Demo section
    @Test
    public void nothingChckedT2() throws Exception {
    	initializeSettings();
        radioButtonsPage.checkButtonTier2Click();

        Assert.assertEquals("Sex :\n" + "Age group:",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void maleZeroToFive() throws Exception {
    	initializeSettings();
    	radioButtonsPage.maleGroupRadioButtonClick();
    	radioButtonsPage.zeroToFiveGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex : Male\n" + "Age group: 0 - 5",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void maleFiveToFifteen() throws Exception {
    	initializeSettings();
    	radioButtonsPage.maleGroupRadioButtonClick();
    	radioButtonsPage.fiveToFifeteenGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex : Male\n" + "Age group: 5 - 15",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void maleFifteenToFiftyTest() throws Exception {
    	initializeSettings();
    	radioButtonsPage.maleGroupRadioButtonClick();
    	radioButtonsPage.fifeteenToFiftyGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();

        Assert.assertEquals("Sex : Male\n" + "Age group: 15 - 50",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void maleNothingCheckedT2() throws Exception {
    	initializeSettings();
        radioButtonsPage.maleGroupRadioButtonClick();
        radioButtonsPage.checkButtonTier2Click();

        Assert.assertEquals("Sex : Male\n" + "Age group:",radioButtonsPage.getResultMessageTier2().getText());
    }

    @Test
    public void femaleZeroToFive() throws Exception {
    	initializeSettings();
        radioButtonsPage.femaleGroupRadioButtonClick();
        radioButtonsPage.zeroToFiveGroupRadioButtonClick();
        radioButtonsPage.checkButtonTier2Click();

        Assert.assertEquals("Sex : Female\n" + "Age group: 0 - 5",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void femaleFivetoFifteen() throws Exception {
    	initializeSettings();
    	radioButtonsPage.femaleGroupRadioButtonClick();
    	radioButtonsPage.fiveToFifeteenGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex : Female\n" + "Age group: 5 - 15",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void femaleFifteentoFifty() throws Exception {
    	initializeSettings();
    	radioButtonsPage.femaleGroupRadioButtonClick();
    	radioButtonsPage.fifeteenToFiftyGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex : Female\n" + "Age group: 15 - 50",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void femaleNothingChecked() throws Exception {
    	initializeSettings();
    	radioButtonsPage.femaleGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex : Female\n" + "Age group:",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void nothingZeroToFive() throws Exception {
    	initializeSettings();
    	radioButtonsPage.zeroToFiveGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex :\n" + "Age group: 0 - 5",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void nothingFiveFifteenCheckedT2() throws Exception {
    	initializeSettings();
        radioButtonsPage.fiveToFifeteenGroupRadioButtonClick();
        radioButtonsPage.checkButtonTier2Click();
        
        Assert.assertEquals("Sex :\n" + "Age group: 5 - 15",radioButtonsPage.getResultMessageTier2().getText());
    }
    
    @Test
    public void nothingFifteenToFifty() throws Exception {
    	initializeSettings();
    	radioButtonsPage.fifeteenToFiftyGroupRadioButtonClick();
    	radioButtonsPage.checkButtonTier2Click();
    	
    	Assert.assertEquals("Sex :\n" + "Age group: 15 - 50",radioButtonsPage.getResultMessageTier2().getText());
    }
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}