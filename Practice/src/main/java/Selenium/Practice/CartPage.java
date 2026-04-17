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
public class CartPage extends AbstractComponent
{
	WebDriver driver;

	public CartPage(WebDriver driver){
		super (driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
	}
    	
 @FindBy(xpath = "//button[contains(text(), 'Checkout')]")
	WebElement checkOut;
 
 @FindBy(xpath="//div[@class='cart']//h3")
 List<WebElement> productList;
 
 
 public void checkout() {
	 
	 waitForWebElementToAppear(checkOut);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].click();", checkOut);
	
	 
 }
 
 public List<WebElement> collectAllProducts() {
	 
	 //List<WebElement> productsCart=pc.addAllProductsToCart();
	   for (WebElement products: productList) {
		   System.out.println(products.getText());
	   }   
	   
	   return productList;
 }
 
 
 
 
 
 
 
 
   


}
