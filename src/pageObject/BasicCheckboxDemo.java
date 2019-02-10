package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicCheckboxDemo extends BasePage {
	private final static String Url = mainUrl + "basic-checkbox-demo.html";
	
	public BasicCheckboxDemo(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Single Checkbox Demo
	private WebElement singleCheckbox;
	private WebElement resultMessage;
	
	//elements for Multiple CheckboxDemo
	private WebElement checkOption1;
	private WebElement checkOption2;
	private WebElement checkOption3;
	private WebElement checkOption4;
	private WebElement checkButton;
	
	//methods for Single Checkbox Demo
	public BasicCheckboxDemo singleCheckboxClick() {
		singleCheckbox.click();
		return this;
	}
	
	public WebElement getSingleCheckbox() {
		return singleCheckbox;
	}
	
	public WebElement getResultMessage() {
		return resultMessage;
	}
	
	//methods for Multiple CheckboxDemo
	public BasicCheckboxDemo checkOption1Click() {
		checkOption1.click();
		return this;
	}
	
	public WebElement getCheckOption1() {
		return checkOption1;
	}
	
	public BasicCheckboxDemo checkOption2Click() {
		checkOption2.click();
		return this;
	}
	
	public WebElement getCheckOption2() {
		return checkOption2;
	}
	
	public BasicCheckboxDemo checkOption3Click() {
		checkOption3.click();
		return this;
	}
	
	public WebElement getCheckOption3() {
		return checkOption3;
	}
	
	public BasicCheckboxDemo checkOption4Click() {
		checkOption4.click();
		return this;
	}
	
	public WebElement getCheckOption4() {
		return checkOption4;
	}
	
	public BasicCheckboxDemo checkButtonClick() {
		checkButton.click();
		return this;
	}
	
	public BasicCheckboxDemo initializeElements(RemoteWebDriver webDriver) {
		singleCheckbox = webDriver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
		resultMessage = webDriver.findElement(By.xpath("//*[@id=\"txtAge\"]"));
		checkOption1 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
		checkOption2 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input"));
		checkOption3 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
		checkOption4 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input"));
		checkButton = webDriver.findElement(By.xpath("//*[@id=\"check1\"]"));
		return this;
	}
}