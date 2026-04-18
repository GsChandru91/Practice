package Selenium.Practice;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;

/**
 * Hello world!
 *
 */
public class PaymentsPage extends AbstractComponent
{
	WebDriver driver;

	public PaymentsPage(WebDriver driver){
		super (driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
	}
    	
 @FindBy(xpath = "//input[@placeholder = 'Select Country']")
	WebElement selectCountry;
 
 @FindBy(xpath = "//a[normalize-space()='Place Order']")
	WebElement placeOrder;
 
 @FindBy(xpath = "//button/span[normalize-space()='India']")
	WebElement india;
 
 
 public void placeOrder() {
	 
	 waitForWebElementToAppear(selectCountry);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 selectCountry.click();
	 selectCountry.sendKeys("India");
	 js.executeScript("arguments[0].click();",  india);  
	 waitForWebElementToclickable(placeOrder);
	 js.executeScript("arguments[0].click();",  placeOrder);
	
	
	 
 }
 
 
 
 
 
 
 
 
   


}
