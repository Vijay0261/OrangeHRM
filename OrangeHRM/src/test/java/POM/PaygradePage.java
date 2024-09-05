package POM;

import java.awt.peer.LabelPeer;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaygradePage {
	WebDriver driver;
	WebDriverWait wait;
	Actions act = new Actions(driver);
	  public PaygradePage(WebDriver driver) {
		  this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
	 }
	 
	  By Job_l =By.xpath("//span[text()='Job ']");
      By PayGrades_l = By.xpath("//a[text()='Pay Grades']");
      By AddButton_l = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
      By PaygradeName_l = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']");
      By SaveButton_l = By.xpath("//button[text()=\" Save \"]");
      By addcurrencyButton_l = By.xpath("//i[@class= \"oxd-icon bi-plus oxd-button-icon\"]");
      By SelectCurrencyDropdown_l = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
      public By Minimumsalary_l(String MinSalary) {
    	  return By.xpath("//label[text()='Minimum Salary']/following::input[@class='oxd-input oxd-input--active'][1]");
      }
      public By Maximumsalary_l(String MaxSalary) {
    	  return By.xpath("//label[text()='Maximum Salary']/following::input[@class='oxd-input oxd-input--active'][1]");
      }
    
      By CurrencySavebuuton_l = By.xpath("//h6[text()='Add Currency']/following::button[text()=' Save ']");
      
      public By deleteexistingpaygrade_l (String PayGradeName) {
	     	return By.xpath("//div[text()='"+PayGradeName+"']/following::i[@class='oxd-icon bi-trash'][1]");
         }
      
      
       public void NavigatetoPayGradesPage() {
    	   WebElement Job_e = wait.until(ExpectedConditions.elementToBeClickable(Job_l));
       	Job_e.click();
       	WebElement PayGrades_e = wait.until(ExpectedConditions.elementToBeClickable(PayGrades_l));
       	PayGrades_e.click();
       }
       public void enterpaygradename(String PayGradeName) {
    	   WebElement AddButton_e = wait.until(ExpectedConditions.elementToBeClickable(AddButton_l));
    	   WebElement PayGradename_e = wait.until(ExpectedConditions.elementToBeClickable(PaygradeName_l));
    	   AddButton_e.click();
    	   PayGradename_e.sendKeys(PayGradeName);
    	   
       }
       public void clicksavebutton() {
    	   WebElement SaveButton_e = wait.until(ExpectedConditions.elementToBeClickable(SaveButton_l));
    	   SaveButton_e.click();
       }
       public void  addcurrencybutton() {
    	   WebElement CurrencySavebuuton_e = wait.until(ExpectedConditions.elementToBeClickable(addcurrencyButton_l));
    	   CurrencySavebuuton_e.click();
    	   
    	   
       }
       public void addcurrency(String Currency) {
    	   Select currencyDropdown_e = new Select(driver.findElement(SelectCurrencyDropdown_l));
    	   currencyDropdown_e.selectByValue(Currency);
       }
       public void minimumandmaximumcurrency(String MinSalary,String MaxSalary) {
    	   WebElement Minimumsalary_e = wait.until(ExpectedConditions.elementToBeClickable(Minimumsalary_l(MinSalary)));
    	   WebElement Maximumsalary_e = wait.until(ExpectedConditions.elementToBeClickable(Maximumsalary_l(MaxSalary)));
    	   Minimumsalary_e.sendKeys(MinSalary);
    	   Maximumsalary_e.sendKeys(MaxSalary);
       }
    	  
       public void savecurrency() {
    	   
    	   WebElement CurrencySavebuuton_e = wait.until(ExpectedConditions.elementToBeClickable(CurrencySavebuuton_l));
    	   CurrencySavebuuton_e.click();
       }
       
 
	public void deletepaygrade(String ExistingPayGradeName) {
		WebElement deleteexistingpaygrade_e = wait.until(ExpectedConditions.elementToBeClickable(deleteexistingpaygrade_l(ExistingPayGradeName)));
 	   deleteexistingpaygrade_e.click();
		
	}
	public void confirmdeletebutton() {
		 driver.switchTo().alert().accept();
		
	}
       }

