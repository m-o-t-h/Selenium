package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FileDownloadDemo extends BasePage {
	private final static String Url = mainUrl + "generate-file-to-download-demo.html";
	
	public FileDownloadDemo(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for File Download section
	private WebElement enterDataField;
	private WebElement generateFileButton;
	private WebElement downloadFileButton;
	
	//methods for File Download section
	
	public FileDownloadDemo enterDataFieldInputText(String enterData) {
		enterDataField.sendKeys(enterData);
		return this;
	}
	
	public FileDownloadDemo generateFileButtonClick() {
		generateFileButton.click();
		return this;
	}
	
	public FileDownloadDemo downloadFileButtonClick() {
		downloadFileButton.click();
		return this;
	}
	
	public WebElement getDownloadFileButton() {
		return downloadFileButton;
	}
	
	public FileDownloadDemo initializeElements(RemoteWebDriver webDriver) {
		enterDataField = webDriver.findElement(By.xpath("//*[@id=\"textbox\"]"));
		generateFileButton = webDriver.findElement(By.xpath("//*[@id=\"create\"]"));
		downloadFileButton = webDriver.findElement(By.xpath("//*[@id=\"link-to-download\"]"));
		return this;
	}
}
