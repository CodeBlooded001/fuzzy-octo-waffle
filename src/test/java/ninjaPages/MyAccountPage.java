package ninjaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	final WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	By accountBreadCrumb = By.xpath("//ul[@class='breadcrumb']/li[2]");
	
	public WebElement accountBreadCrumb() {
		return driver.findElement(accountBreadCrumb);
	}
}
