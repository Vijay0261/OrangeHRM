package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import POM.Loginpage;
import POM.PaygradePage;
import Utility.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paygradestepdefs {
	WebDriver driver = DriverFactory.getDriver();
	
	@When("I navigate to the Pay Grades page")
	public void i_navigate_to_the_pay_grades_page() {
		PaygradePage pp = new PaygradePage(driver);
		pp.NavigatetoPayGradesPage();
	   
	}
	@When("I enter {string} as the Pay Grade name")
	public void i_enter_as_the_pay_grade_name(String PayGradeName) {
		PaygradePage pp = new PaygradePage(driver);
		pp.enterpaygradename(PayGradeName);
		pp.clicksavebutton();
	   
	}
	@Then("I should see {string} listed in the Pay Grades table")
	public void i_should_see_listed_in_the_pay_grades_table(String string) {
	   
	}

	
	@When("I select {string} from the Pay Grades table")
	public void i_select_from_the_pay_grades_table(String string) {
	    
	}
	@When("I click on Add Currency button")
	public void i_click_on_add_currency_button() {
		PaygradePage pp = new PaygradePage(driver);
		pp.addcurrencybutton();
	}
	@When("I select {string} as the currency")
	public void i_select_as_the_currency(String Currency) {
		PaygradePage pp = new PaygradePage(driver);
		pp.addcurrency(Currency);
	}
	@When("I enter {string} as the Minimum Salary and {string} as the Maximum Salary")
	public void i_enter_as_the_minimum_salary_and_as_the_maximum_salary(String MinSalary, String MaxSalary) {
		PaygradePage pp = new PaygradePage(driver);
		pp.minimumandmaximumcurrency(MinSalary, MaxSalary);
	   
	}
	@Then("I should see {string} listed in the currencies table for {string}")
	public void i_should_see_listed_in_the_currencies_table_for(String string, String string2) {
	   
	}

	@When("I select {string} from the Pay  table")
	public void i_select_from_the_pay_table(String ExistingPayGradeName) {
		PaygradePage pp = new PaygradePage(driver);
		pp.deleteexistingpaygrade_l(ExistingPayGradeName);
	   
	}
	@When("I click on Delete button ")
	public void i_click_on_delete_button() {
		PaygradePage pp = new PaygradePage(driver);
		pp.confirmdeletebutton();
	   
	}
	@When("I confirm the deletion")
	public void i_confirm_the_deletion() {
		
	}
	@Then("I should see Successfully Deleted message")
	public void i_should_see_successfully_deleted_message() {
	    
	}
	@Then("I should not see {string} listed in the Pay Grades table")
	public void i_should_not_see_listed_in_the_pay_grades_table(String ExistingPayGradeName) {
	   
	}







}