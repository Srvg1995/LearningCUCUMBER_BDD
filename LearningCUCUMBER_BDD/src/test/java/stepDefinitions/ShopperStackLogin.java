package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopperStackLogin {
	public WebDriver driver;
	
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shopperstack.com/");
	}
	    
	@Given("Login page will be displayed")
	public void login_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {
	   driver.findElement(By.id("Email")).sendKeys(userName);
	   driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("Shopper should be successfully logged in")
	public void shopper_should_be_successfully_logged_in() {
	   Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Hello, ')]")).isDisplayed());
	}

	@Then("Browser must be close")
	public void browser_must_be_close() {
	    driver.quit();
	}

	@Then("Merchant should be successfully logged in")
	public void merchant_should_be_successfully_logged_in() {
	   System.out.println("Merchant not logged in");
	}

	@Then("Admin must be successfull logged in")
	public void admin_must_be_successfull_logged_in() {
	    Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Approved Merchants']")).isDisplayed());
	}
	
	
	@Given("Shopper Login is displayed")
	public void shopper_login_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Shopper')]")).isDisplayed());
	  
	}
	@Given("Merchant Login is displayed")
	public void merchant_login_is_displayed() {
	    
	}
	@Given("Admin Login is displayed")
	public void admin_login_is_displayed(){
	    
	}
	
}
