import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		TodaysDealsPage TodaysDeals = new TodaysDealsPage();
				
		
		
		TodaysDeals.clickLightning_Deals(driver);
		//driver.findElement(By.linkText("Lightning Deals")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Devices")).click();
		TodaysDeals.clickDevices(driver);
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Smart Watches")).click();
		TodaysDeals.clickSmart_Watches(driver);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
