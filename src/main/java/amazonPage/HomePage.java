package amazonPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {  
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	@FindBy(xpath ="//a[@id='nav-logo-sprites']")
	public static WebElement logo;
	 
	@FindBy(xpath ="//input[@id='twotabsearchtextbox']" )
	public WebElement search;
	
	public void clickSearchField() {
		search.click();
	}
}
