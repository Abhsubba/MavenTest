package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

WebDriver driver;

@Given("Open firefox or chrome and lauch App")
public void open_firefox_or_chrome_and_lauch_App() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhirup Subba\\Downloads\\alllink\\chromedriver.exe");
	
driver = new ChromeDriver();	
	driver.manage().window().maximize();
//driver.manage().window().fullscreen();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	driver.get("https://freecrm.com/");	
		
	
    
}

@When("i enter vaild {string} and valid {string}")
public void i_enter_vaild_and_valid(String username, String password) throws InterruptedException {
  
	driver.findElement(By.cssSelector(".btn")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(password);
	Thread.sleep(3000);
	

	
	
}


@Then("user successfully login")
public void user_successfully_login() {
	
	driver.findElement(By.cssSelector(".ui")).click();
}

@Then("Close")
public void close() {
	driver.close();
   
}	
	
	
}
