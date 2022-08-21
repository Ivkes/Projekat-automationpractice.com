package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

 public LoginPage (WebDriver driver){
 super(driver);
}

String baseURL = "http://automationpractice.com/index.php";
By usernameBy = By.xpath("//*[@id='email']");
By passwordBy = By.xpath("//*[@id='passwd']");
By glavniSignInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
By signinButtonBy = By.xpath("//*[@id='SubmitLogin']/span");
By errorContainer = By.xpath("//*[@id='center_column']/div[1]/ol/li");
By signOutButton= By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
By potvrdaOdjave= By.xpath("//*[@id='columns']/div[1]/span[2]");

public LoginPage basePage(){
 driver.get(baseURL);
return this;
}

 public LoginPage login(String username, String password)
 {
 click(glavniSignInButtonBy);
 writeText(usernameBy, username);
 writeText(passwordBy, password);
 click(signinButtonBy);
 return this;
}

 public LoginPage verifyUnsuccesfulLogin(String expectedText){
 String actualText = readText(errorContainer);
 assertTextEquals(expectedText, actualText);
 return this;
}

public LoginPage clickOnSignOutButton()
{
    click(signOutButton);
    return this;
}
public LoginPage verifySuccesfulLogout(String textOdjave)
{
 	String actualText = readText(potvrdaOdjave);
 	assertTextEquals(textOdjave, actualText);
	return this;
 }
 
 
 
 
 


}

