import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodaysDealsPage {

	// WebElements --------------------------------------------------------------------------
	public static WebElement Lightning_Deals(WebDriver driver) {
		
		WebElement element =  driver.findElement(By.xpath("//*[@data-csa-c-element-id='filter-bubble-deals-collection-lightning-deals']"));

		
		return element;	
	}
	
	public static WebElement Devices(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//*[@data-csa-c-element-id='filter-bubble-deals-collection-amazon-devices']"));
		return element;	
	}
	

	public static WebElement Smart_Watches(WebDriver driver) {
		
		WebElement element =  driver.findElement(By.xpath("//*[@data-csa-c-element-id='filter-bubble-deals-collection-smart-watches']"));
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
