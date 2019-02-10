package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TableFilterDemo extends BasePage {
private final static String Url = mainUrl + "table-records-filter-demo.html";
	
	public TableFilterDemo(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Filter Records section
	private WebElement greenButton;
	private WebElement orangeButton;
	private WebElement redButton;
	private WebElement allColoursButton;
	
	//methods for Filter Records section
	public TableFilterDemo greenButtonClick() {
		greenButton.click();
		return this;
	}
	
	public WebElement getGreenButton() {
		return greenButton;
	}
	
	public TableFilterDemo orangeButtonClick() {
		orangeButton.click();
		return this;
	}
	
	public WebElement getOrangeButton() {
		return orangeButton;
	}
	
	public TableFilterDemo redButtonClick() {
		redButton.click();
		return this;
	}
	
	public WebElement getRedButton() {
		return redButton;
	}
	
	public TableFilterDemo allColoursButtonClick() {
		allColoursButton.click();
		return this;
	}
	
	public WebElement getAllColoursButton() {
		return allColoursButton;
	}
	
	public TableFilterDemo initializeElements(RemoteWebDriver webDriver) {
		greenButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[1]"));
		orangeButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[2]"));
		redButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[3]"));
		allColoursButton = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[4]"));
		return this;
	}
}
