package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	public static WebDriver launchBrowser() {
		System.out.println("launch browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

}
