package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

 public WebDriver driver;

@Before
 public void setup (){
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ivy\\Desktop\\AutomationPractise\\AutomationPractise\\AutomationPractise\\lib\\geckodriver.exe");
//driver = new FirefoxDriver();

 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivy\\Desktop\\AutomationPractise\\AutomationPractise\\AutomationPractise\\lib\\chromedriver.exe");
 driver = new ChromeDriver();

driver.manage().window().maximize();


}

 @After

public void teardown(){
driver.quit();
 }


}

