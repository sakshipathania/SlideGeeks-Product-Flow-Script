package SetupClass.StepDefinition;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class facebook_logout extends SetupClass {
	WebDriverWait wait = new WebDriverWait(driver,50);

@Given("^navigate to the facebook url\\.$")
public void navigate_to_the_facebook_url() throws InterruptedException {
 
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
    driver.manage().deleteAllCookies();
}


}
