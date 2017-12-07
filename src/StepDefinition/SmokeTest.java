package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest 
{
	                                     
	WebDriver driver;

@Given("^Open Chrome and start application$")
public void open_Chrome_and_start_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDrive\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://intermediary-uat2-atom-mso.iress.co.uk/#/");		   
    
}

@And("^i enter a valid username and valid password$")
public void i_enter_a_valid_username_and_valid_password() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("MercyAsBroker36");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Password.1");	
   
}

@And("^i click on the login button the should belogged in successfully$")
public void i_click_on_the_login_button_the_should_belogged_in_successfully() throws Throwable {
	driver.findElement(By.xpath("//a[@ng-click='login()']")).click();
	/*
	if(driver.getCurrentUrl().equalsIgnoreCase("https://intermediary-uat2-atom-mso.iress.co.uk/cm.html#/intermediary-home"))
    {
        System.out.println("Test 1 Passed. This is the home page! Please check"); 
    }else{
        System.out.println("Test 1 Failed. This is not the home screen please check");
    }

	Assert.assertEquals(driver.findElement(By.cssSelector(".page-header.ng-scope.ng-binding")).getText(),"Welcome Miss Mercy Dobbidi");
	System.out.println("Test 1 Passed");
	*/ 
}

@And("^i should be on the MSO home Screen$")
public void i_should_be_on_the_MSO_home_Screen() throws Throwable {
	String url = driver.getCurrentUrl();
	 System.out.println("CurrentUrl");
	if(driver.getCurrentUrl().equalsIgnoreCase("https://intermediary-uat2-atom-mso.iress.co.uk/cm.html#/intermediary-home"))
    {
        System.out.println("Test 1 Passed. This is the home page! Please check"); 
    }else{
        System.out.println("Test 1 Failed. This is not the home screen please check");
    }
	/*
	Assert.assertEquals(driver.findElement(By.cssSelector(".page-header.ng-scope.ng-binding")).getText(),"Welcome Miss Mercy Dobbidi");
	System.out.println("Test 2 Passed");
	*/

}

@When("^I click on the User name and the log off link$")
public void i_click_on_the_User_name_and_the_log_off_link() throws Throwable {
	driver.findElement(By.id(".//*[@id='cm-nav']/div/div[2]/div/ul/li[1]/a/span[1]")).click();
    driver.findElement(By.id(".//*[@id='cm-nav']/div/div[2]/div/ul/li[1]/ul/li[4]/a")).click();	
  
}

@Then("^I should be logged out of the application$")
public void i_should_be_logged_out_of_the_application() throws Throwable {
	 Assert.assertEquals(driver.findElement(By.xpath("//a[@href='registration.html#/registration']")).getText(),"Register for Digital Mortgages Intermediary");
	 System.out.println("Test 3 Passed. Logged Out"); 
	
}


	
	
	
	
	
}