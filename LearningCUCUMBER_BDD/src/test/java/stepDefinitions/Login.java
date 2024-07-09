package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver; //Declared as Global Variable,sothat I can use this same 'driver' instance throughout my class.
	
	
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	  driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   driver.findElement(By.id("Email")).sendKeys("qa_testuser123@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Password@123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("User should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
	}

	@Then("browser should close")
	public void browser_should_close() {
	   driver.close();
	}


}