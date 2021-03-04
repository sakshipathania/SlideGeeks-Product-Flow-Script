package SetupClass.StepDefinition;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

	

public class Google_logout extends SetupClass {

WebDriverWait wait = new WebDriverWait(driver,50); 
	
@Given("^open the google plus page\\.$")
public void open_the_google_plus_page() throws InterruptedException {
    Thread.sleep(3000);
	driver.get("https://mail.google.com");
	Thread.sleep(5000);
driver.manage().deleteAllCookies();
Thread.sleep(8000);
	
}
	
}
