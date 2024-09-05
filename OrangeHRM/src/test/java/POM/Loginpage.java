package POM;

	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Loginpage {
	    WebDriver driver;
	    WebDriverWait wait;
	    By username_l = By.xpath("//input[@name='username']");
	    By password_l = By.xpath("//input[@name='password']");
	    By loginButton_l = By.xpath("//button[@type='submit']");

	    // Constructor
	    public Loginpage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void LoginToHRM(String username,String password) {
	       WebElement username_e = wait.until(ExpectedConditions.elementToBeClickable(username_l));
	       username_e.sendKeys(username);
	       WebElement password_e = wait.until(ExpectedConditions.elementToBeClickable(password_l));
	    	password_e.sendKeys(password);
	    }

	    public void clickLoginButton() {
	    	WebElement loginButton_e = wait.until(ExpectedConditions.elementToBeClickable(loginButton_l));
	    	loginButton_e.click();
	    }
	    
	    public String getLoginPageTitle() {
	        return driver.getTitle();
	    }
	    public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			Loginpage lp = new Loginpage(driver);
			lp.LoginToHRM("Admin", "admin123");
			lp.clickLoginButton();
			Thread.sleep(2000);
			Adminpage ap = new Adminpage(driver);
			ap.navigatetoAdminpage();
			
		
		}
	}

	 

