package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Loginpage;
import Utility.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	WebDriver driver = DriverFactory.getDriver();
	

@Given("the user is on the OrangeHRM login page")
public void the_user_is_on_the_orange_hrm_login_page() {
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
}
@When("the user enters a valid username {string} and a valid password {string}")
public void the_user_enters_a_valid_username_and_a_valid_password(String username, String password) {
	Loginpage lp = new Loginpage(driver);
	lp.LoginToHRM(username, password);
    
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
	Loginpage lp = new Loginpage(driver);
	lp.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
	Loginpage lp = new Loginpage(driver);
	lp.getLoginPageTitle();
}




}
