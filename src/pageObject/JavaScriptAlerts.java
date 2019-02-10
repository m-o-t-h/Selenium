package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptAlerts extends BasePage {
	private final static String Url = mainUrl + "javascript-alert-box-demo.html";
	
	public JavaScriptAlerts(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Java Script Alert Box section
	private WebElement submitButtonSection1; 
	
	//elements for Java Script Confirm Box section
	private WebElement submitButtonSection2;
	private WebElement resultMessageSection2;
	
	//elements for Java Script Alert Box section
	private WebElement submitButtonSection3;
	private WebElement resultMessageSection3;
	
	//methods for Java Script Alert Box section
	public JavaScriptAlerts submitButtonSection1Click() {
		submitButtonSection1.click();
		return this;
	}
	
	//methods for Java Script Confirm Box section
	public JavaScriptAlerts submitButtonSection2Click() {
		submitButtonSection2.click();
		return this;
	}
	
	public WebElement getResultMessageSection2() {
		return resultMessageSection2;
	}
	
	//methods for Java Script Alert Box section
	public JavaScriptAlerts submitButtonSection3Click() {
		submitButtonSection3.click();
		return this;
	}
	
	public WebElement getResultMessageSection3() {
		return resultMessageSection3;
	}
	
	
	public JavaScriptAlerts initializeElements(RemoteWebDriver webDriver) {
		submitButtonSection1 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
		submitButtonSection2 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
		resultMessageSection2 = webDriver.findElement(By.xpath("//*[@id=\"confirm-demo\"]"));
		submitButtonSection3 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
		resultMessageSection3 = webDriver.findElement(By.xpath("//*[@id=\"prompt-demo\"]"));
		return this;
	}
}
