package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AjaxFormSubmit extends BasePage {
	private final static String Url = mainUrl + "ajax-form-submit-demo.html";
	
	public AjaxFormSubmit(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Ajax Form Demo section
	private WebElement nameBox;
	private WebElement commentBox;
	private WebElement submitButton;
	private WebElement resultMessage;
	
	//methods for Ajax Form Demo section
	public AjaxFormSubmit nameBoxClick() {
		nameBox.click();
		return this;
	}
	
	public AjaxFormSubmit nameBoxInputText(String inputName) {
		nameBox.sendKeys(inputName);
		return this;
	}
	
	public AjaxFormSubmit commentBoxClick() {
		commentBox.click();
		return this;
	}
	
	public AjaxFormSubmit commentBoxInputText(String inputComment) {
		commentBox.sendKeys(inputComment);
		return this;
	}
	
	public AjaxFormSubmit submitButtonClick() {
		submitButton.click();
		return this;
	}
	
	public WebElement getResultMessage() {
		return resultMessage;
	}
	
	public AjaxFormSubmit initializeElements(RemoteWebDriver webDriver) {
		nameBox = webDriver.findElement(By.xpath("//*[@id=\"title\"]"));
		commentBox = webDriver.findElement(By.xpath("//*[@id=\"description\"]"));
		submitButton = webDriver.findElement(By.xpath("//*[@id=\"btn-submit\"]"));
		resultMessage = webDriver.findElement(By.xpath("//*[@id=\"submit-control\"]"));
		return this;
	}
}
