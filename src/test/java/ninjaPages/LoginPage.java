package ninjaPages;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	final WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Page Object Model
	// By email = By.id("input-email");
	// By password = By.id("input-password");
	// By loginButton = By.xpath("//input[@type='submit']");

	// Page Factory
	@FindBy(id = "input-email")
	private WebElement email;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	public WebElement enterEmail() {

		// return driver.findElement(email);

		// directly return web element
		return email;
	}

	public WebElement enterPassword() {
		//return driver.findElement(password);
		
		// directly return web element
		return password;
		
	}

	public WebElement loginClick() {
		//return driver.findElement(loginButton);
		
		// directly return web element
		return loginButton;
	}

}
