import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestSellersTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		
		//click on Best Seller
		driver.findElement(By.linkText("Best Sellers")).click();
		
		BestSellersPage BestSeller = new BestSellersPage();
		
		BestSeller.Amazon_Devices_and_Accessories(driver).click();
		driver.navigate().back();
		
		BestSeller.clickAmazon_Devices_and_Accessories(driver);
		driver.navigate().back();
		
		BestSeller.clickAmazon_Launchpad(driver);
		driver.navigate().back();
		
		BestSeller.clickApps_and_Games(driver);
		driver.navigate().back();
		
		
		driver.quit();
		
	}

}
