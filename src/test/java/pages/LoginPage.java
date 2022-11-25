package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.id("userName");
	By password = By.id("password");
	By login = By.id("login");
	
	/*This method accepts a String value for the username,
	  Which is passed to the sendKeys method by the following
	  code : driver.findElement(userName).sendKeys(user);*/
	public void enterUserName(String user) {
		driver.findElement(userName).sendKeys(user);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
