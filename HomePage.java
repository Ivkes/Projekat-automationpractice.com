package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

 public HomePage (WebDriver driver)
 {
	super(driver);
}

By homePageTitleBy = By.xpath("//*[@id='center_column']/h1");
String expectedLink = "http://automationpractice.com/index.php";

By shoppingCartBadgeBy = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");
By addToCartButtonBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
By numberOfItemsPopularBy = By.xpath("//*[@id='homefeatured']/li");
By numberofItemsBestSellersBy = By.xpath("//*[@id='blockbestsellers']/li");
By tShirtSectionBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
By mouseOverBy = By.xpath("//*[@id='center_column']/ul/li/div");

By totalPriceBy = By.id("total_price_container");
By productPriceBy = By.id("total_product");
By shippingPriceBy = By.id("total_shipping");
By checkoutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");

//*[@id="blockbestsellers"]/li

public HomePage verifySuccesfulLogin(String expectedText)
{
 	String actualText = readText(homePageTitleBy);
 	assertTextEquals(expectedText, actualText);
	return this;
 }
 

public HomePage verifyProductAddedToCart (String expTextProductAddInCart)
{
 	String productInCartMessage = readText(shoppingCartBadgeBy);
	assertTextEquals(expTextProductAddInCart, productInCartMessage);
	return this;
}

public HomePage clickOnTshirtButton(){
	click(tShirtSectionBy);
	return this;
}
public HomePage clickOnAddToCartButton(){
	WebElement mouseOver = driver.findElement(mouseOverBy);
	WebElement addToCart = driver.findElement(addToCartButtonBy);
	
	Actions action = new Actions(driver);
	
	driver.manage().window().setSize(new Dimension(1000, 2000));
	action.moveToElement(mouseOver).click(addToCart).build().perform();
	return this;
}
 public HomePage numberOfProductsPopular (int expectedNumberOfProducts)
 {
	int actualNumberOfProducts = countItems(numberOfItemsPopularBy);
 	assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
	return this;
}

public HomePage numberOfProductsBS (int expectedNumberOfProducts)
 {
	int actualNumberOfProducts = countItems(numberOfItemsPopularBy);
 	assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
	return this;
}


 

}