package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adminpage {
	WebDriver driver;
	WebDriverWait wait;
	 public Adminpage(WebDriver driver) {
		  this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
	 }
	 By Admin_l = By.xpath("//span[text()='Admin']");
	 
	 public void navigatetoAdminpage() {
		 WebElement Admin_e = wait.until(ExpectedConditions.elementToBeClickable(Admin_l));
		 Admin_e.click();
		 
	 }

}
