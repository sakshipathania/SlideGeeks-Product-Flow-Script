package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Email_Sign_In_Incorrect_Data_3 extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on Home Page of Geeks Website vi$")
	public void user_is_already_on_Home_Page_of_Geeks_Website_vi() throws Throwable {
	   
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
	}

	@Then("^user navigates to login page vi$")
	public void user_navigates_to_login_page_vi() throws Throwable {
		
		WebElement login_signin_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div/div/nav/div/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a")));
		 Thread.sleep(3000);
		 login_signin_btn.click();
		 Thread.sleep(3000);
	    
	}

	@Then("^user login to website with invalid email and password vi$")
	public void user_login_to_website_with_invalid_email_and_password_vi() throws Throwable {
		
		WebElement login_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/form/div[1]/input")));
		 Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",login_email);
		 login_email.sendKeys("hkjfujsid@hsujrf.hjsdgf");
		 Thread.sleep(3000);
		 
		WebElement login_password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/form/div[2]/input")));
		 Thread.sleep(3000);
		login_password.sendKeys("12#@#@#3456");
		 Thread.sleep(3000);
		 
		 WebElement login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-account-action > div > div:nth-child(2) > div > form > div.btn-wrapper.login_btn > input")));
		 Thread.sleep(3000);
		 login_btn.click();
		 Thread.sleep(3000);
	    
	}

	@Then("^validate the error message vi$")
	public void validate_the_error_message_vi() throws Throwable {
	    
		driver.get(AppURL);
		Thread.sleep(2000);
		
	}

	@Then("^user login to website with valid email and password vi$")
	public void user_login_to_website_with_valid_email_and_password_vi() throws Throwable {
		
		Thread.sleep(3000);
		WebElement old_paid_email1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/form/div[1]/input")));
               old_paid_email1.sendKeys("sakshi.pathania@slidetech.in");
          Thread.sleep(3000);
               WebElement old_paid_pass1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/form/div[2]/input")));
               old_paid_pass1.sendKeys("Qwerty@1");
	       
	       Thread.sleep(3000);
	       WebElement old_paid_login_btn1=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#pg-account-action > div > div:nth-child(2) > div > form > div.btn-wrapper.login_btn > input")));
	       old_paid_login_btn1.click();
		
		driver.get("https://www.slidegeeks.com/business/product/emerging-marketplace-strategies-growth-ppt-powerpoint-presentation-complete-deck");
		Thread.sleep(5000);
		 
		 WebElement download_btn1 = driver.findElement(By.xpath("//*[@class=\"btn-download pg-button pg-addtocart pg-green-background-btn\"]"));
		 Thread.sleep(3000);
		 download_btn1.click();
		 Thread.sleep(3000);
		
		 WebElement Signout = driver.findElement(By.xpath("//a[@href ='/logout']"));
		Thread.sleep(3000);
		Signout.click();
	}

}
