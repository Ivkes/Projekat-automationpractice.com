package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.Action;
import javax.xml.xpath.XPath;


public class RegistrationPage extends BasePage

{
public RegistrationPage (WebDriver driver)
{
   super(driver);
}


 By firstNameBy = By.id("customer_firstname");
 By lastNameBy = By.id("customer_lastname");

 By emailBy = By.id("email");
 By sifraBy = By.id("passwd");

 By shippingNameBy = By.xpath("//*[@id='firstname']");
 By shippingLastNameBy = By.xpath("//*[@id='lastname']");
 By addressBy = By.cssSelector("#address1"); 
 By cityBy = By.xpath("//*[@id='city']");
 By stateBy = By.cssSelector("select#id_state>option");
 By zipcodeBy = By.id("postcode");
 By countryBy = By.xpath("//*[contains(@id,\"id_country\")]/option");
 By phoneBy = By.xpath("//*[@id='phone']");
 By aliasAddressBy = By.id("alias");

 By glavniSignInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
 By emailZaRegBy = By.id("email_create");
 By createButtonBy= By.xpath("//*[@id='SubmitCreate']/span");


 By registerButtonBy = By.id("submitAccount");
 By registrConteiner= By.xpath("//*[@id='columns']/div[1]/span[2]");
 String ocekivaniTextRega="My account";



public RegistrationPage registration (String ime, String prezime, String email, String sifra, String imezadostavu, String prezimezadostavu, String dostavnaadresa, String grad, String statename, String zemlja, String zipkod, String phone, String adressalias)
{
  click(glavniSignInButtonBy);
  writeText(emailZaRegBy, email);
  click(createButtonBy);



  writeText(firstNameBy, ime);
  writeText(lastNameBy, prezime);
  writeText(emailBy, email);
  writeText(sifraBy, sifra);
  writeText(shippingNameBy, imezadostavu);
  writeText(shippingLastNameBy, prezimezadostavu);
  writeText(addressBy, dostavnaadresa);
  writeText(cityBy, grad);
  probaNalazenjaDrzave();
  //nadjiDrzavu();
  
  writeText(zipcodeBy, zipkod);
  writeText(phoneBy, phone);
  writeText(aliasAddressBy, adressalias);
  clickOnRegistrationButton();
  return this; 

}
public RegistrationPage verifySuccesfulRegistration(String ocekivaniTextRega)
{
  String actText = readText(registrConteiner);
  assertTextEquals(ocekivaniTextRega, actText);
  return this;

 }
 
 //public RegistrationPage nadjiDrzavu()
 //{
 // WebElement mojOdabirElement = driver.findElement(By.cssSelector("select#id_state"));  
 
  //Select dropdown= new Select(mojOdabirElement);
  //dropdown.selectByIndex(3);
  //return this;
 //}
 
 
 public RegistrationPage probaNalazenjaDrzave()
 {
 click(stateBy);
 driver.findElement(By.xpath("//*[@id='id_state']/option[3]")).click();

 return this;
 }


 

public RegistrationPage clickOnRegistrationButton()
 {
   click(registerButtonBy);
   return this;
   
 }

 

    
       


}
