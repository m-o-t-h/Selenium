package pageObject;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {
	private RemoteWebDriver webDriver;
	protected final static String mainUrl = "https://www.seleniumeasy.com/test/";
	
	public BasePage(RemoteWebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public BasePage openViaUrl(String url) {
		webDriver.get(url);
		return this;
	}

}
