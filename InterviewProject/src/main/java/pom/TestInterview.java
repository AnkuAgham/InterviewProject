package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestInterview {
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement textbox_Username;

	@FindBy(xpath = "//input[@id='password']") private WebElement textbox_Password;

	
	@FindBy(xpath = "//input[@id='login-button']") private WebElement button_Login;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement button_Navigator;
	
	@FindBy(xpath = "//a[@id='about_sidebar_link']") private WebElement button_About;

	public TestInterview(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username){
		textbox_Username.sendKeys(username);
	
	}
	
	public void enterPassword(String password){
		textbox_Password.sendKeys(password);
	
	}
	
	public void clickOnLoginButton(){
		button_Login.click();;
	}
	
	public void openNavigator() {
		button_Navigator.click();
	}

	public void openAbout() {
		button_About.click();
	}
}

