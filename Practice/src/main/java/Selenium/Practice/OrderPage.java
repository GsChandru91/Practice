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
public class OrderPage extends AbstractComponent
{
	WebDriver driver;

	public OrderPage(WebDriver driver){
		super (driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	
	}
    	

 
 @FindBy(xpath="//div[@class='ng-star-inserted']//td[@class='line-item product-info-column m-3']//div[@class='title']")
 List<WebElement> productList;
 
 

 public List<WebElement> collectAllProducts() {
	 
	 //List<WebElement> productsCart=pc.addAllProductsToCart();
	   for (WebElement products: productList) {
		   System.out.println("Orderspage: "+products.getText());
	   }   
	   
	   return productList;
 }
 
 
 
 
 
 
 
 
   


}
