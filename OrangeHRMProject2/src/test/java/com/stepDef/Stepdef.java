package com.stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageFactory.PageObjectModelHRM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	PageObjectModelHRM pom;
	 
	
	@Given("^open a browser and go to the website$")
	public void open_a_browser_and_go_to_the_webside() {
		System.setProperty("webdriver.chrome.driver" ,"./Driver/chromedriver1.exe" );
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		pom = PageFactory.initElements(driver, PageObjectModelHRM.class);
		
	  }
	@When("^user verify the page title \"([^\"]*)\"$")
	public void user_verify_the_page_title(String arg1) throws Throwable {
		
   String actual = driver.getTitle();
   System.out.println(actual);
	String expected = "OrangeHRM";
	Assert.assertTrue("Title should be OrangeHRM ", actual.contains(expected));
	
	   
	}
     @When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		
		pom.getUserName().sendKeys("Admin");
		
		pom.getPassword().sendKeys("admin123");
	    
	    
	}

	@When("Click the Login butten")
	public void click_the_Login_butten() {
		//driver.findElement(By.xpath("//*[@type='submit']")).submit();
	    pom.getLogin().submit();
	    
	}

	@Then("User Logout")
	public void user_Logout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='welcome']")).click();
		pom.getLogout().click();
	 driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).click();
	   driver.close();
	   
	}



}
