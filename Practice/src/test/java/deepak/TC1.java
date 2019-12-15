package deepak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class TC1 {
	ChromeDriver driver;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
	  WebElement username=driver.findElement(By.id("email"));
	  username.sendKeys("sdfhg");
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	   
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	   
	}
}
