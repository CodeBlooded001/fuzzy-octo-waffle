package ninjaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    
	final WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By email = By.id("input-email");
	By password = By.id("input-password");
	By loginButton = By.xpath("//input[@type='submit']");
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement loginClick() {
		return driver.findElement(loginButton);
	}

}
