package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Base;

public class Hooks extends Base{

@Before
public void setUp(){
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

}
@After 
public void tearDown() {
	//driver.close();
	driver.quit();
	
}

}
