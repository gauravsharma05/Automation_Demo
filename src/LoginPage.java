import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	// WebElements ---------------------------------------------------------------
	public static WebElement email(WebDriver driver) {
		
	WebElement element = driver.findElement(By.name("email"));
	
	return element;	
}
	
	public static WebElement password(WebDriver driver) {	
	
	WebElement element = driver.findElement(By.id("ap_password"));
	
	return element;
	}
	
	public static WebElement Continue(WebDriver driver) {
		
		WebElement element = driver.findElement(By.className("a-button-input"));
		
		return element;
	}
	//-------------------------------------------------------------------------------
	
	// Click on continue ------------------------------------------------------------
	public void clickContinue(WebDriver driver) {
		Continue(driver).click();
	}
	
	
	
	
}
