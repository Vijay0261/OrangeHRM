package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Adminpage;
import POM.JobTitlespage;
import POM.Loginpage;
import Utility.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobTitlesteps {
	WebDriver driver = DriverFactory.getDriver();
	@Given("I am logged into OrangeHRM as an admin with valid details {string} and {string}")
	public void i_am_logged_into_orange_hrm_as_an_admin_with_valid_details_and(String username, String password) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		lp.LoginToHRM(username, password);
		lp.clickLoginButton();
	}
	@When("I navigate to the Job Titles page")
	public void i_navigate_to_the_job_titles_page() throws InterruptedException {
		Thread.sleep(3000);
		Adminpage ap = new Adminpage(driver);
		ap.navigatetoAdminpage();
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.navigatetoJobTitlepage();
	   
	}
	@When("I click on Add button")
	public void i_click_on_add_button() {
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.clickaddbutton();
		
	   
	}
	@When("I enter {string} as the Job Title and {string} as the Job Description")
	public void i_enter_as_the_job_title_and_as_the_job_description(String JobTitle, String JobDescription) {
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.addJobTitle(JobTitle, JobDescription);
		Jp.clicksavebutton();
	}
	
	
	@When("I upload {string} as the Job Specification file")
	public void i_upload_as_the_job_specification_file(String string) {
	   
	}
	@When("I click on Save button")
	public void i_click_on_save_button() {
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.clicksavebutton();
	  
	}
	@Then("I should see Successfully Saved message")
	public void i_should_see_successfully_saved_message() {
	   
	}
	@Then("I should see {string} listed in the Job Titles table")
	public void i_should_see_listed_in_the_job_titles_table(String string) {
	    
	}


	
	@When("I select {string} from the Job Titles table and click on Edit button")
	public void i_select_from_the_job_titles_table_and_click_on_edit_button(String ExistingJobTitle) {
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.selectjobtitlefromtable(ExistingJobTitle);
	   
	}
	@When("I update the Job Title to {string} and Job Description to {string}")
	public void i_update_the_job_title_to_and_job_description_to(String UpdatedJobTitle, String UpdatedJobDescription) {
		JobTitlespage Jp = new JobTitlespage(driver);
		Jp.EditExistingJobTitle(UpdatedJobTitle, UpdatedJobDescription);
		Jp.saveeditedjobtitle();
	}

	@When("I upload {string} as the updated Job Specification file")
	public void i_upload_as_the_updated_job_specification_file(String string) {
	 
	}
	@Then("I should see Successfully Updated message")
	public void i_should_see_successfully_updated_message() {
	  
	}

	




}
