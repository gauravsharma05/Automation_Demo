import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TodaysDealsTest {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		clickCookieButton(driver);

		
		TodaysDealsPage TodaysDeals = new TodaysDealsPage();
				
		// click on "Today's Deals"
		//click on "Lightning Deals"
		// click on "Devices"
		// click on "Smart Watches"
		
		TodaysDeals.clickLightning_Deals(driver);

		//	Thread.sleep(4000);
		

		TodaysDeals.clickDevices(driver);
		Thread.sleep(2000);
		
		TodaysDeals.clickSmart_Watches(driver);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

	// Method to click on the cookie button
		public static void clickCookieButton(WebDriver driver) {
		List<WebElement> z = driver.findElements(By.id("sp-cc-accept"));

		if (z.size() > 0) {
			driver.findElement(By.id("sp-cc-accept")).click();
		}
		}
	
	
}
