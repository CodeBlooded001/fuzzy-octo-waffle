package testCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		/*The below driver is the actual driver that will
		  will initilize the driver in the page class
		  
		  After creating the objects the each class, we can 
		  now easily reference any method with the class.
		 */
		//Creating object of HomePage
		HomePage home = new HomePage(driver);
		//crearing object of LoginPage
		LoginPage login = new LoginPage(driver);
		//creating object of Dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		
		home.loginClick();
		
		//Enter Username and Password
		
		login.enterUserName("yashuy");
		login.enterPassword("Yashu12345!");
		
		//Click on login button
		
		login.clickLogin();
		Thread.sleep(3000);
		
		//Capturing the page heading and print on console
		System.out.println("The Page Heading is "+dashboard.getHeading());
		
		//Click on the Logout button
		dashboard.clickLogout();
		
		//close browser instance
		driver.quit();
	}

}
