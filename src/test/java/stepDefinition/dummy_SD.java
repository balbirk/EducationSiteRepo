package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dummy_SD {
	
	public static WebDriver driver;
	String URL = "https://juice-shop.herokuapp.com/#/register";
	
	

	
	By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
	By closeBanner = By.xpath("button[@aria-label='Close Welcome Banner']/span/mat-icon[@class='mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color']");
	By emailID = By.id("emailControl");
	By passwordTxt = By.id("passwordControl");
	By confirmPassword = By.id("repeatPasswordControl");
	By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
	By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
	By secQnAns = By.id("securityAnswerControl");
	By meWantDialog = By.xpath("//div[@role='dialog']//div[@class='cc-compliance']/a");
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
				
		driver = new ChromeDriver();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(5));
		chromeOptions.setPageLoadTimeout(Duration.ofMillis(30000));
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		chromeOptions.setAcceptInsecureCerts(true);
		
		chromeOptions.setScriptTimeout(Duration.ofSeconds(30));
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.findElement(meWantDialog).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(dismissBtn));
		
		driver.findElement(dismissBtn).click();
		
		driver.findElement(emailID).sendKeys("vijay@gmail.com");
		driver.findElement(passwordTxt).sendKeys("bharathi@123");
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword));
		driver.findElement(confirmPassword).sendKeys("bharathi.1234");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(secQnBox));
		driver.findElement(secQnBox).click();
		driver.findElement(secQn).click();
		driver.findElement(secQnAns).sendKeys("vijay");
		
	}

	@When("I complete action")
	public void i_complete_action() {
	   
	}

	@When("some other action")
	public void some_other_action() {
	   
	}

	@When("yet another action")
	public void yet_another_action() {
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	   
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	   
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	   
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	   
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	   
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	   
	}

}
