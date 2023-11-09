package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pom.TestInterview;

public class Test {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	TestInterview testinterview= new TestInterview(driver);
	
	testinterview.enterUserName("standard_user");
	testinterview.enterPassword("secret_sauce");
	testinterview.clickOnLoginButton();
	
	testinterview.openNavigator();
	testinterview.openAbout();
	
	String expectedUrl=("https://saucelabs.com/ site");
	String actualURL=driver.getCurrentUrl();
	
	Assert.assertEquals(expectedUrl, actualURL);
	
	driver.navigate().back();
	
	String exppageTitle="Swage Labs";
	String currentTitle=driver.getTitle();
	Assert.assertEquals(exppageTitle, currentTitle);
	

	
	}
}