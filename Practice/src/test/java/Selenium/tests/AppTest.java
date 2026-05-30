package Selenium.tests;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Selenium.Pageobjects.CartPage;
import Selenium.Pageobjects.LandingPage;
import Selenium.Pageobjects.OrderPage;
import Selenium.Pageobjects.PaymentsPage;
import Selenium.Pageobjects.ProductsCatalogue;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertFalse;



/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     * 
     * 
     */
	


	@Test
   public  void submitOrder(){

	   LandingPage lp = new LandingPage(driver);
	   lp.goTo();
	   lp.loginToApplication("gschandru91@gmail.com", "Rahul@1991");
	   ProductsCatalogue pc = new ProductsCatalogue(driver);
	   pc.addAllProductsToCart();
	   pc.clickOnCart();
	   CartPage cp = new CartPage(driver);
	   List<WebElement> productList = cp.collectAllProducts();
	   cp.checkout();
	   PaymentsPage pp = new PaymentsPage (driver);
	   pp.placeOrder();
	   OrderPage op = new OrderPage (driver);
	   List<WebElement> orderlist = op.collectAllProducts();
	  assertTrue(orderlist.containsAll(productList), "Not all values from productlist are in orderList");
	    
	   
	  
}
}
