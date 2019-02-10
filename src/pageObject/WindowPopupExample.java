package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowPopupExample extends BasePage {
	private final static String Url = mainUrl + "window-popup-modal-demo.html";
	
	public WindowPopupExample(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Single Window Popup
	private WebElement followTwitterButton;
	private WebElement likeFacebookButton;
	
	//elements for Multiple Window Popup
	private WebElement followTwitterAndFacebookButton;
	private WebElement followAllButton;
	
	//methods for Single Window Popup
	public WindowPopupExample followTwitterButtonClick() {
		followTwitterButton.click();
		return this;
	}
	
	public WindowPopupExample likeFacebookButtonClick() {
		likeFacebookButton.click();
		return this;
	}
	
	//methods for Multiple Window Popup
	public WindowPopupExample followTwitterAndFacebookButtonClick() {
		followTwitterAndFacebookButton.click();
		return this;
	}
	
	public WindowPopupExample followAllButtonClick() {
		followAllButton.click();
		return this;
	}
	
	public WindowPopupExample initializeElements(RemoteWebDriver webDriver) {
		followTwitterButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
		likeFacebookButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/a"));
		followTwitterAndFacebookButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/a"));
		followAllButton = webDriver.findElement(By.xpath("//*[@id=\"followall\"]"));
		return this;
	}
}
