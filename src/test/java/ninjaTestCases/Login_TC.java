package ninjaTestCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ninjaPages.LoginPage;
import ninjaPages.MyAccountPage;

public class Login_TC {
	WebDriver driver;
	@Test
	public void login() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterEmail().sendKeys("yashuqa001@gmail.com");
		loginpage.enterPassword().sendKeys("yashu12345!");
		loginpage.loginClick().click();

		MyAccountPage myAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(myAccountPage.accountBreadCrumb().isDisplayed());
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
	}

}
