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

public class Google_existing_user_sign_in_9 extends SetupClass {

	WebDriverWait wait = new WebDriverWait(driver,30);
	JavascriptExecutor js = (JavascriptExecutor) driver;
  
	@Given("^user is already on Home Page of Geeks Website ix$")
	public void user_is_already_on_Home_Page_of_Geeks_Website_ix() throws Throwable {
		
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
	    
	}

	@Then("^user navigates to google login page ix$")
	public void user_navigates_to_google_login_page_ix() throws Throwable {
		WebElement g_login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#google-signin-btn > i")));
		 Thread.sleep(3000);
		 g_login_btn.click();
		 Thread.sleep(3000);
		
	}

	@Then("^user login to website ix$")
	public void user_login_to_website_ix() throws Throwable {
		
      driver.manage().window().maximize();
		
		  // Store the CurrentWindow for future reference
		 // String handle = " ";
		  String currentWindow = driver.getWindowHandle();
		  String popupWindowHandle = null;
		   
		  // Switch To Popup Window
		  
		  for(String handle : driver.getWindowHandles()){
		   if(!handle.equals(currentWindow)){
		    
		    popupWindowHandle = handle;
		     driver.switchTo().window(popupWindowHandle);
			   driver.manage().window().maximize();
		   }
		  }
	       Thread.sleep(5000);
	       
		
		try
		{
			WebElement another_btn=driver.findElement(By.xpath("//div[text()='Use another account']"));
			another_btn.click();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
		
		}
		
		Thread.sleep(3000);
	        WebElement g_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")));
		Thread.sleep(3000);
               g_email.sendKeys("sakshi.pathania@slidetech.in");
          Thread.sleep(3000);
    
    WebElement g_login_btn1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")));
		Thread.sleep(3000);
	       g_login_btn1.click();
		
		Thread.sleep(3000);
    
               WebElement g_pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")));
		Thread.sleep(3000);
               g_pass.sendKeys("Sakshi@456");
	       
	       Thread.sleep(3000);
	       WebElement g_login_btn2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")));
		Thread.sleep(3000);
	       g_login_btn2.click();
		
		Thread.sleep(3000);
		  driver.switchTo().window(currentWindow);
	}

	@Then("^user is redirected my dashboard page ix$")
	public void user_is_redirected_my_dashboard_page_ix() throws Throwable {
		log.info("Hey, I am on Pricing");
	}

	@Then("^user download a free product ix$")
	public void user_download_a_free_product_ix() throws Throwable {
		
		driver.get("https://www.slidegeeks.com/free-downloads");
		Thread.sleep(6000);
		
		WebElement Download= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section[2]/div/div/div[1]/div/div[2]/div[1]/div/div/p/a/span"));
		
		//WebElement Download = (WebElement)js.executeScript("('a.btn-download')", "");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Download);
		Download.click();
		Thread.sleep(3000);
		
		 WebElement download_btn = driver.findElement(By.xpath("//*[@class=\"btn-download pg-button pg-addtocart pg-green-background-btn\"]"));
		 Thread.sleep(3000);
		 download_btn.click();
		 Thread.sleep(3000);
		 
	    	}

	@Then("^user signout of website ix$")
	public void user_signout_of_website_ix() throws Throwable {

		// Log out
				/* WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.afterBody.signin-page-wrapper.main-wrapper > header > div > div > nav > div > div.rgth_sechedr > div.navigation_wrapper > div.social_right > div > div.contact.login-option > ul > li:nth-child(2) > a")));
				 Thread.sleep(3000);
				 login_btn.click();
				 Thread.sleep(3000);
				 log.info("Hey, I am on Home page Again after Sign out");
				 Thread.sleep(1000);*/
		 WebElement Signout = driver.findElement(By.xpath("//a[@href ='/logout']"));
		Thread.sleep(3000);
		Signout.click();
	}
}
