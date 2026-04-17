package Selenium.Practice;


import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class LandingPage 
{
	WebDriver driver;

	public LandingPage(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
    	
 @FindBy(id= "userEmail")
 WebElement userEmail;
 
 @FindBy(id= "userPassword")
 WebElement userPassword;
 
 @FindBy(id= "login")
 WebElement loginBtn;
 
 public void goTo() {
	 
	 driver.get("https://rahulshettyacademy.com/client");
	 driver.manage().window().maximize();
 }
 
 public void loginToApplication(String user ,String password) {
	 
	 userEmail.sendKeys(user);
	 userPassword.sendKeys(password);
	 loginBtn.click();	
 }
 
 
 
 
 
 
 
 
   


}
