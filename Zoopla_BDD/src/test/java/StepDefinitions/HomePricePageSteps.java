package StepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.Base;

public class HomePricePageSteps extends Base {
	
	@Given("user is on Zoopla Login Page")
	public void user_is_on_Zoopla_login_page() {
		driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2F&return_url=%2F&with_confirmation=true");
		System.out.println("user on login page");
	}

	@When("user enter {string} in userID text field as {string}")
	public void user_enter_in_user_id_text_field_as(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string2);
		Thread.sleep(2000);
		System.out.println("Successfully enter userid");
	}

	@And("user enter {string} in password text field as {string}")
	public void user_enter_in_password_text_field_as(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
		Thread.sleep(2000);
		System.out.println("Successfully enter password");
	}

	@And("user click on Login Button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[(text()='Sign in')]")).click();
		Thread.sleep(4000);
	}

	@Then("user login to Zoopla Home Page")
	public void user_login_to_gdpl_home_page() throws InterruptedException {
		System.out.println("Zoopla HomePage Display");
		Thread.sleep(4000);
	}
	
	///////******************//////////
	
	@When("user click on House price link")
	public void user_click_on_house_price_link() {
		driver.findElement(By.xpath("//div[@class='c-PJLV c-PJLV-icHtgLL-css']/ul/li[3]")).click();
	}

	
	@Then("user able to see {string} page")
	public void user_able_to_see_page(String string ) throws InterruptedException {
		Thread.sleep(4000);
		String title=driver.getTitle();
		Thread.sleep(4000);
		Assert.assertEquals("Sold House Prices - Get UK house prices online - Zoopla", title);
		Thread.sleep(4000);
		System.out.println("Sucessfully land on House Price page ");
	}

	@Then("user enters {string} in search text field")
	public void user_enters_in_search_text_field(String string1) {
		driver.findElement(By.xpath("//input[starts-with(@id, 'downshift')]")).sendKeys(string1);
	}

	@Then("user hit on Search button")
	public void user_hit_on_search_button() {
		driver.findElement(By.xpath("//button[@class='c-klmMZv c-klmMZv-eAsDER-category-primary c-ldDavI']")).click();
	}

	@Then("user {string} Page display")
	public void user_page_display(String string) throws InterruptedException {
		Thread.sleep(4000);
		String title=driver.getTitle();
		Assert.assertEquals("House prices in Oxford Road, London SE19 - sold prices and estimates - Zoopla", title);
		Thread.sleep(4000);
		System.out.println("Successfully land on" + title);
	}


}
