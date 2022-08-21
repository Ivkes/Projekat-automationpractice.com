package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage

{
    public CheckoutPage (WebDriver driver)
    {
        super(driver);
    }

    By totalPriceBy = By.id("total_price_container");
By productPriceBy = By.id("total_product");
By shippingPriceBy = By.id("total_shipping");
By checkoutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");

    public CheckoutPage verifyTotalPrice(By totalPrice)
{
	String productPrice = readText(productPriceBy);
	productPrice = productPrice.substring(1);
	String shippingPrice = readText(shippingPriceBy);
	shippingPrice = shippingPrice.substring(1);
	String finalPrice = readText(totalPriceBy);
	finalPrice = finalPrice.substring(1);

	Double x = Double.parseDouble(productPrice);
	Double y = Double.parseDouble(shippingPrice);
	Double z = Double.parseDouble(finalPrice);
	Double zbir = x + y;

	assertEquals(z, zbir);
	return this;
}
public CheckoutPage clickOnProceedToCheckoutButton()
{
	click(checkoutButtonBy);
	return this;
}




}
