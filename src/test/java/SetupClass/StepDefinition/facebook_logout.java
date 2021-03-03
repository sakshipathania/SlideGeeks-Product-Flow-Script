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
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
    Thread.sleep(7000);
	webelement account = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i"));
	Thread.sleep(5000);
	account.click();
	Thread.sleep(7000);
	webelement logout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
	Thread.sleep(5000);
	logout.click();
}


}
