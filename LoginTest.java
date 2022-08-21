package tests;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
public HomePage homePage;
public LoginPage loginPage;

String username = "ivkesbg@gmail.com";
String password = "Dzesika17";
String expectedText = "MY ACCOUNT";
String textOdjave = "Authentication";



String emptyUsername = "";
String emptyUsernameError = "An email address required.";


String invalidPassword = "test1";
String invalidPasswordError = "Authentication failed.";


@Test
public void verifySuccesfulLogin(){
LoginPage loginPage = new LoginPage(driver);
HomePage homePage = new HomePage(driver);
loginPage.basePage();
loginPage.login(username, password);
homePage.verifySuccesfulLogin(expectedText);


try{
Thread.sleep(10000);
}
 catch(InterruptedException e){
 e.printStackTrace();
}
}


@Test
public void verifyEmptyUsernameError(){
LoginPage loginPage = new LoginPage(driver);
loginPage.basePage();
loginPage.login(emptyUsername, password);
loginPage.verifyUnsuccesfulLogin(emptyUsernameError);
 
 try{
 Thread.sleep(5000);
}
catch(InterruptedException e){
 e.printStackTrace();
}
}


@Test
public void verifyInvalidPasswordError()
{
LoginPage loginPage = new LoginPage(driver);
loginPage.basePage();
loginPage.login(username, invalidPassword);
loginPage.verifyUnsuccesfulLogin(invalidPasswordError);

try{
 Thread.sleep(5000);
 }
catch(InterruptedException e){
 e.printStackTrace();
 }
}

 @Test
 public void verifySucsessfulLogout(){
     loginPage = new LoginPage(driver);
     loginPage.basePage();
     loginPage.login(username, password);
     loginPage.clickOnSignOutButton();
     loginPage.verifySuccesfulLogout(textOdjave);
     try{
        Thread.sleep(5000);
        }
       catch(InterruptedException e){
        e.printStackTrace();
        }
 }






}