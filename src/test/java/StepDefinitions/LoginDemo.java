package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemo {
	
	WebDriver driver = null;
	String ProjectPath = System.getProperty("user.dir");
	
	@Given("Open Browser")
	public void open_browser() {
		System.out.println("Inside Step - Browser is open");
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium Practice\\Practice\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@And("User Is on Login Page")
	public void user_is_on_login_page() {

	}

	@When("User Enters UserName and Password")
	public void user_enters_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@And("Clicks on LoginButton")
	public void clicks_on_login_button() {

	}

	@Then("User Is on Application Home Page")
	public void user_is_on_application_home_page() {

	}


}
