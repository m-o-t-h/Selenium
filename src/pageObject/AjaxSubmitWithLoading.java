package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AjaxSubmitWithLoading extends BasePage {
private final static String Url = mainUrl + "ajax-form-submit-demo.html";
	
	public AjaxSubmitWithLoading(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Ajax Form
	private WebElement nameBox;
	private WebElement commentBox;
	private WebElement submitButton;
	private WebElement resultMessage;
	
	//methods for Ajax Form
	public AjaxSubmitWithLoading nameBoxClick() {
		nameBox.click();
		return this;
	}
	
	public AjaxSubmitWithLoading nameBoxInputText(String inputName) {
		nameBox.sendKeys(inputName);
		return this;
	}
	
	public AjaxSubmitWithLoading commentBoxClick() {
		commentBox.click();
		return this;
	}
	
	public AjaxSubmitWithLoading commentBoxInputText(String inputComment) {
		commentBox.sendKeys(inputComment);
		return this;
	}
	
	public AjaxSubmitWithLoading submitButtonClick() {
		submitButton.click();
		return this;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public WebElement getResultMessage() {
		return resultMessage;
	}
	
	public AjaxSubmitWithLoading initializeElements(RemoteWebDriver webDriver) {
		nameBox = webDriver.findElement(By.xpath("//*[@id=\"title\"]"));
		commentBox = webDriver.findElement(By.xpath("//*[@id=\"description\"]"));
		submitButton = webDriver.findElement(By.xpath("//*[@id=\"btn-submit\"]"));
		resultMessage = webDriver.findElement(By.xpath("//*[@id=\"submit-control\"]"));
		return this;
	}
}
