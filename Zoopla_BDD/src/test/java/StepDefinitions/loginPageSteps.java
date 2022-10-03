package StepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base;


public class loginPageSteps extends Base

{
	
	@Given("user is on Guru99 Login page")
	public void user_is_on_guru99_login_page()  {
		driver.get("https://demo.guru99.com/v4/");
		System.out.println("Successfully on login page");

	}

	@When("user gets the tilte of the page")
	public void user_gets_the_tilte_of_the_page() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
		Thread.sleep(4000);
		System.out.println("Verified title");

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {

		System.out.println("Successfully Login page title verified");
		Thread.sleep(3000);
	}

	@Then("Reset button should be display")
	public void reset_button_should_be_display() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnReset']")).click();
		Thread.sleep(3000);
		System.out.println("Reset button display");
	}

	@When("user enters userid as {string} in userID text field")
	public void user_enters_userid_as_in_user_id_text_field(String username) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		Thread.sleep(2000);
		System.out.println("Successfully enter userid");

	}

	@And("user enters password as {string} in password text filed")
	public void user_enters_password_as_in_password_text_filed(String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(2000);
		System.out.println("Successfully enter password");

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

	@Then("user gets the title of the page and page title should be {string}")
	public void user_gets_the_title_of_the_page_and_page_title_should_be(String string){
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		System.out.println("Home page title verified");
	}

}
