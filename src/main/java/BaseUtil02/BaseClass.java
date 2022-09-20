package BaseUtil02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import amazonPage.HomePage;

public class BaseClass {
	WebDriver driver;
	HomePage homePage = new HomePage(driver);

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/Users/fargabuddin/eclipse-workspace/gov.portal.amazon/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/portal");

	} 
	@AfterMethod
	public void tearup() {
		driver.quit();
	}
}
