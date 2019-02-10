package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BootstrapModal extends BasePage {
	private final static String Url = mainUrl + "bootstrap-modal-demo.html#";
	
	public BootstrapModal(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Single Modal Example
	private WebElement launchSection1;
	private WebElement closeSection1;
	private WebElement saveChangesSection1;
	
	//elements for Multiple Modal Example
	private WebElement launchSection2;
	private WebElement launchSection3;
	private WebElement closeSection2;
	private WebElement closeSection3;
	private WebElement saveChangesSection2;
	private WebElement saveChangesSection3;
	
	//methods for Single Modal Example
	public BootstrapModal launchSection1Click() {
		launchSection1.click();
		return this;
	}
	
	public BootstrapModal closeSection1Click() {
		closeSection1.click();
		return this;
	}
	
	public BootstrapModal saveChangesSection1Click() {
		saveChangesSection1.click();
		return this;
	}
	
	//methods for Multiple Modal Example
	public BootstrapModal launchSection2Click() {
		launchSection2.click();
		return this;
	}
	
	public BootstrapModal launchSection3Click() {
		launchSection3.click();
		return this;
	}
	
	public BootstrapModal closeSection2Click() {
		closeSection2.click();
		return this;
	}
	
	public BootstrapModal closeSection3Click() {
		closeSection3.click();
		return this;
	}
	
	public BootstrapModal saveChangesSection2Click() {
		saveChangesSection2.click();
		return this;
	}
	
	public BootstrapModal saveChangesSection3Click() {
		saveChangesSection3.click();
		return this;
	}
	
	public BootstrapModal initializeElements(RemoteWebDriver webDriver) {
		launchSection1 = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a"));
		closeSection1 = webDriver.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]"));
		saveChangesSection1 = webDriver.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[2]"));
		launchSection2 = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a"));
		launchSection3 = webDriver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/a"));
		closeSection2 = webDriver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[4]/a[1]"));
		closeSection3 = webDriver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[6]/a[1]"));
		saveChangesSection2 = webDriver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[4]/a[2]"));
		saveChangesSection3 = webDriver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[6]/a[2]"));
		return this;
	}
}
