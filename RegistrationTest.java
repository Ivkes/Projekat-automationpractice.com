package tests;

import java.util.Random;

import org.checkerframework.checker.units.qual.K;
import org.junit.Test;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest

{
public HomePage homePage;
public RegistrationPage registrationPage;
public LoginPage loginPage;

String ime= "IVANA";
String prezime="VASIC";
String email= "ivkesbg11@gmail.com";
String sifra="11111";
String imezadostavu="IVANA";
String prezimezadostavu="VASIC";
String dostavnaadresa="Vasiceva";
String grad="Belgrade";
String drzava= "";
String zemlja="United States";
String zipkod="11160";
String phone="+38164123456";
String adressalias="MOJA ADRESA";
String ocekivaniTextRega="My account";



@Test
public void verifySuccesfulRegistration()
{
LoginPage loginPage = new LoginPage(driver);
HomePage homePage = new HomePage(driver);
RegistrationPage registrationPage = new RegistrationPage(driver);

loginPage.basePage();
registrationPage.registration(ime, prezime, email, sifra, imezadostavu, prezimezadostavu, dostavnaadresa, grad, drzava, zemlja, zipkod, phone, adressalias);
registrationPage.verifySuccesfulRegistration(ocekivaniTextRega);



try{
Thread.sleep(10000);
}
 catch(InterruptedException e){
 e.printStackTrace();
}

    
}
}
