package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobTitlespage {
	WebDriver driver;
	WebDriverWait wait;
	public JobTitlespage(WebDriver driver) {
		 this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	        By Job_l =By.xpath("//span[text()='Job ']");
	        By Jobtiltes_l = By.xpath("//a[text()='Job Titles']");
	        By AddButton_l = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	        By jobTitleField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
	         By jobDescriptionField = By.xpath("//textarea[@placeholder='Type description here']");
	        By saveButton = By.xpath("//button[normalize-space()='Save']");
	       public By geteditexistingJobTitleLocator_l (String ExistingJobTitle) {
	     	return By.xpath("//div[text()='"+ ExistingJobTitle +"']/following::i[@class='oxd-icon bi-pencil-fill'][1]");
           }
	       public By deleteexistingJobTitleLocator_l (String JobTitle) {
		     	return By.xpath("//div[text()='"+JobTitle+"']/following::i[@class='oxd-icon bi-trash'][1]");
	           }
	        By confirmDeleteButton = By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']");
	        
	        public void navigatetoJobTitlepage() throws InterruptedException {
	        	WebElement Job_e = wait.until(ExpectedConditions.elementToBeClickable(Job_l));
	        	Job_e.click();
	        	Thread.sleep(2000);
	        	WebElement JobTitles_e = wait.until(ExpectedConditions.elementToBeClickable(Jobtiltes_l));
	        	JobTitles_e.click();
	        }
	        public void clickaddbutton() {
	        	 WebElement Addbutton_e = wait.until(ExpectedConditions.elementToBeClickable(AddButton_l));
	        	 Addbutton_e.click();
	        }
	         public void addJobTitle(String JobTitle ,String JobDescription) {
	        	
	        	 WebElement jobtitlefield_e = wait.until(ExpectedConditions.elementToBeClickable(jobTitleField));
	        	 WebElement JobDescription_e = wait.until(ExpectedConditions.elementToBeClickable(jobDescriptionField));
	        	 jobtitlefield_e.sendKeys(JobTitle);
	        	 JobDescription_e.sendKeys(JobDescription);
	        	 WebElement Savebutton_e = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
	        	 Savebutton_e.click();	 
	        	 
	         }
	         public void clicksavebutton() {
	        	 WebElement Savebutton_e = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
	        	 Savebutton_e.click();	 
	        	 
	         }
	         public void selectjobtitlefromtable(String ExistingJobTitle) {
	        	 WebElement editexistingjobtitle_e = wait.until(ExpectedConditions.elementToBeClickable(geteditexistingJobTitleLocator_l(ExistingJobTitle)));
	        	 editexistingjobtitle_e.click();
	         }
	         public void EditExistingJobTitle(String UpdatedJobTitle ,String UpdatedJobDescription) {
	      
	        	 WebElement jobtitlefield_e = wait.until(ExpectedConditions.elementToBeClickable(jobTitleField));
	        	 WebElement JobDescription_e = wait.until(ExpectedConditions.elementToBeClickable(jobDescriptionField));
	        	
	        	 jobtitlefield_e.sendKeys(UpdatedJobTitle);
	        	 JobDescription_e.sendKeys(UpdatedJobDescription); 
	         }
	         public void saveeditedjobtitle() {
	        	 WebElement Savebutton_e = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
	        	 Savebutton_e.click();
	        	 
	         }
	        public void deleteJobTitle(String JobTitleToDelete) {
	        	WebElement deletejobtitle_e = wait.until(ExpectedConditions.elementToBeClickable(deleteexistingJobTitleLocator_l(JobTitleToDelete)));
	        	driver.switchTo().alert().accept();
	        }
	}

