package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	/*
	 *Constructor that will be automatically 
	  called as soon as the object of the class is created.
	  
	 *WebDriver is passed as an argument to the constructor.
	 
	 *this.driver = driver ; 
	 *"this" keyword is used to initilize the local driver variable with the 
	 	actual driver we will use in our test class.
	 *the actual driver is the one that we pass as an argument to the constructor.
	 *
	  
	  **/
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	/*By class methods helps to locate the web elements on the page.*/
	//Locator for the login button
	By loginButton = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
	
	//Method for clicking the login button
	public void loginClick() {
		driver.findElement(loginButton).click();
	}
}
