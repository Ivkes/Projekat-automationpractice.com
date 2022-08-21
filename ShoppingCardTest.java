package tests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class ShoppingCardTest extends BaseTest{
public LoginPage loginPage;
 public HomePage homePage;

String username = "ivkesbg@gmail.com";
String password = "Dzesika17";
int numberOfAllItems = 7;
String productInCartMessage = "Product successfully added to your shopping cart";
By totalPriceBy = By.xpath("//*[@id='total_price_container']");



 @Test
public void verifySuccesfulAddToCart(){
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    loginPage.basePage();
   
    homePage.clickOnTshirtButton();
    homePage.clickOnAddToCartButton();
    homePage.verifyProductAddedToCart(productInCartMessage);
    try{
        Thread.sleep(5000);
         }
         catch(InterruptedException e){
         e.printStackTrace();
        }
        
     }
    



@Test
 public void NumberOfItemsPopular()
 {

loginPage = new LoginPage(driver);
 homePage = new HomePage(driver);

loginPage.basePage();
homePage.numberOfProductsPopular(numberOfAllItems);
try{
    Thread.sleep(5000);
     }
     catch(InterruptedException e){
     e.printStackTrace();
    }
    
 }


 @Test
 public void NumberofItemsBestSellers()
 {
loginPage = new LoginPage(driver);
 homePage = new HomePage(driver);

loginPage.basePage();
homePage.numberOfProductsBS(numberOfAllItems);
try{
    Thread.sleep(5000);
     }
     catch(InterruptedException e){
     e.printStackTrace();
    }
    
}

@Test
public void totalPriceAssert()
{
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    loginPage.basePage();
    CheckoutPage checkoutPage = new CheckoutPage(driver);
 
    homePage.clickOnTshirtButton();
    homePage.clickOnAddToCartButton();
    checkoutPage.clickOnProceedToCheckoutButton();
    checkoutPage.verifyTotalPrice(totalPriceBy);
try{
    Thread.sleep(5000);
     }
     catch(InterruptedException e){
     e.printStackTrace();
    }
}
}






