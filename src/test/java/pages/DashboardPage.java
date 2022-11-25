package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By heading = By.xpath("//div[@class='main-header']");
	By logoutButton = By.id("submit");
	
	//Method to capture the Page Header
	/*We use the return type of the method as String, 
	  which returns the heading retrieved using the getText() method.*/
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	public void clickLogout() {
		driver.findElement(logoutButton).click();
	}

}
