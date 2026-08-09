package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	String ProjectPath = System.getProperty("user.dir");

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - Browser is open");
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\Practice\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Inside Step - User is on google search page");
	}

	@When("User enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		System.out.println("Inside Step - User enters a text in search box");
	}

	@And("Hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Inside Step - Hits Enter Button");
	}

	@Then("User navigated to search results")
	public void user_navigated_to_search_results() {
		driver.getPageSource().contains("Online Courses");
		System.out.println("Inside Step - User navigated to search results");
		driver.close();
		driver.quit();
	}
}
