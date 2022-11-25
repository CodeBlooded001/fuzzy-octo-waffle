package ninjaPages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	final WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//By accountBreadCrumb = By.xpath("//ul[@class='breadcrumb']/li[2]");
	
	@FindBy(xpath="//ul[@class='breadcrumb']/li[2]")
	private WebElement accountBreadCrumb;
	
	public WebElement accountBreadCrumb() {
		return accountBreadCrumb;
	}
}
