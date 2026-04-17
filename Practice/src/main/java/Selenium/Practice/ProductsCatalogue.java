package Selenium.Practice;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;

/**
 * Hello world!
 *
 */
public class ProductsCatalogue extends AbstractComponent
{
	WebDriver driver;

	public ProductsCatalogue(WebDriver driver){
		super (driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
	}
    	
 @FindBy(xpath= "//section[@id='products']/div[@class='container']/div[@class='row']/div/div/div/button[2]")
 List<WebElement> productList;
 
 @FindBy(id= "userPassword")
 WebElement userPassword;
 
 @FindBy(id= "login")
 WebElement loginBtn;
 

 
 public List<WebElement> addAllProductsToCart() {
	 
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   for (WebElement button: productList  ) {
		   
		   js.executeScript("arguments[0].click();", button);

		   waitForWebElementToAppear(button);	  
		   
	   }
	return productList;
	   	
}
 
 
 
 
 
 
 
 
 
   


}
