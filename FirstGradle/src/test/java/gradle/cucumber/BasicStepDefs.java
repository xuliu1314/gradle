package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.itextpdf.text.log.SysoLogger;

public class BasicStepDefs {

	WebDriver driver = null;

	public void initializeDriver() {
		driver = new ChromeDriver();
		// take chrome to front window.
		String parent_window = driver.getWindowHandle();
		driver.switchTo().window(parent_window);
	}
	

	/*
	 * Basic feature steps
	 */

	@Given("^\"([^\"]*)\" use Cucumber Main class to run tests$")
	public void I_use_Cucumber_Main_class_to_run_tests(String testString) throws Throwable {
		System.out.println("Hello cucumber jvm " + testString);

  }
	
	 @When("^I search for \"([^\"]*)\"$")
	 public void I_search_for(String search) throws Throwable {
	   WebElement element = driver.findElement(By.name("q"));
	   element.sendKeys(search);
	   element.submit();
	 }

	/*
	 * Register a baiDu account feature steps
	 */

	@Given("^the page is open \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
		initializeDriver();
		driver.get(page);
	}



	@When("^I want to set my user name as \"([^\"]*)\"$")
	public void I_want_to_set_my_user_name(String userName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement name = driver.findElement(By.name("userName"));
		name.sendKeys(userName);
	}

	@When("^I want to set my mobile number as \"([^\"]*)\"$")
	public void i_want_to_set_my_mobile_number_as11(String mobileNumber) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement mobile;
		mobile = driver.findElement(By.cssSelector("#TANGRAM__PSP_3__phone"));
		mobile.sendKeys(mobileNumber);
	}

	@Then("^Set a login in password \"([^\"]*)\"$")
	public void set_a_login_in_password(String passWord) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement pw = driver.findElement(By.id("TANGRAM__PSP_3__password"));
		pw.sendKeys(passWord);
	}

	@When("^I want to get the verification codes$")
	public void i_want_to_get_the_verification_codes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement vefcode = driver.findElement(By.cssSelector("#TANGRAM__PSP_3__verifyCodeSend"));
		vefcode.click();
	}

	@Then("^I agree the terms and condition$")
	public void i_agree_the_terms_and_condition() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('TANGRAM__PSP_3__isAgree').checked=true;");

	}

	/*
	 * senario2: cucumber with parameter
	 */
	@Given("^I want to set my login in account as \"([^\"]*)\"$")
	public void i_want_to_set_my_login_in_account_as(String arg1) throws Throwable {
		WebElement name = driver.findElement(By.name("userName"));
		name.sendKeys(arg1);
	}

	@Then("^Set a register pass word as \"([^\"]*)\"$")
	public void set_a_register_pass_word_as(String passWord) throws Throwable {
		WebElement pw = driver.findElement(By.id("TANGRAM__PSP_3__password"));
		pw.sendKeys(passWord);
	}

	@When("^I want to set my register mobile number as (\\d+)$")
	public void i_want_to_set_my_register_mobile_number_as(String mobileNumber) throws Throwable {
		WebElement mobile;
		mobile = driver.findElement(By.cssSelector("#TANGRAM__PSP_3__phone"));
		mobile.sendKeys(mobileNumber);
	}

	@After
	public void cleanUp() {
		driver.close();
	}

}
