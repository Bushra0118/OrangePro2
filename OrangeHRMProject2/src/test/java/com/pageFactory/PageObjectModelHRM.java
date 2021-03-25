package com.pageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectModelHRM {
	
	
	@FindBy (how= How.XPATH, using = "//*[@name='txtUsername']")
	private WebElement UserName;
	
	@FindBy (how= How.XPATH, using = "//*[@name='txtPassword']")
	private WebElement Password;

	@FindBy (how= How.XPATH, using = "//*[@type='submit']")
	private WebElement login;
	
	@FindBy (how= How.XPATH, using = "//*[@id='welcome']")
	private WebElement logout;
	


	
     public WebElement getUserName() {
		return UserName;
	}
	
	
	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogout() {
		return logout;
	}





	

	
}
