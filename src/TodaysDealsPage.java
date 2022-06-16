import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodaysDealsPage {

	// WebElements --------------------------------------------------------------------------
	public static WebElement Lightning_Deals(WebDriver driver) {
		
		WebElement element = driver.findElement(By.linkText("Lightning Deals"));
		
		return element;	
	}
	
	public static WebElement Devices(WebDriver driver) {
		
		WebElement element = driver.findElement(By.linkText("Devices"));
		
		return element;	
	}
	

	public static WebElement Smart_Watches(WebDriver driver) {
		
		WebElement element = driver.findElement(By.linkText("Smart Watches"));
	return element;
	}
	
//--------------------------------------------------------------------------------------------
		
	// Click on these WebElements ---------------------------------------
	
	public void clickLightning_Deals(WebDriver driver) {
		Lightning_Deals(driver).click();
	}
	
	public void clickDevices(WebDriver driver) {
		Devices(driver).click();
	}
	
	public void clickSmart_Watches(WebDriver driver) {
		Smart_Watches(driver).click();
	}
	
	
	
}
