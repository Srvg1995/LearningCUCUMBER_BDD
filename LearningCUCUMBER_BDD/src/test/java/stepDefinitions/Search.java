package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//This below program is to pass multiple data in your Feature file using 'Examples' and 'Scenario Outline' keyword.
public class Search {
	public WebDriver driver;
	public String searchItem;

	@Given("Welcome page is displayed")
	public void welcome_page_is_displayed() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("User enters {string}in serach text field")   
	// @When("^User enters \"([^\"]*)\" in serach text field$")===>'Regular expressions'to allow even integer/float/double kind of data as well.
	public void user_enters_in_serach_text_field(String searchItem) {
		this.searchItem=searchItem;
		driver.findElement(By.id("small-searchterms")).sendKeys(searchItem);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Then("Search results must be displayed")
	public void search_results_must_be_displayed() {
		Assert.assertTrue(driver.findElement(By.name("Q")).getAttribute("value").contains(searchItem));	//validation for Search Text field
	    driver.quit();
	}
}


