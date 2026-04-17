package Selenium.Practice;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertFalse;



/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
   public static void main(String[] args) {
	
	   //WebDriverManager.chromedriver().setup();
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	   assertFalse(orderlist.containsAll(productList), "Not all values from productlist are in orderList");
	    
	   
	  
}
}
