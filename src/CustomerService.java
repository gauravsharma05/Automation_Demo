
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerService {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("sp-cc-accept")).click();
		// click on customer service --------------------------------------------------
		driver.findElement(By.linkText("Customer Service")).click();
		
		//Assert the text on the customer service page --------------------------------
		String str = driver.findElement(By.xpath("//div[@class ='a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container']")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "Hello. What can we help you with?");
		
		//click on Best Sellers --------------------------------------------------------
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		
		//Assert the text on the Best Sellers page -------------------------------------
		String str2 = driver.findElement(By.id("zg_banner_text")).getText();
		System.out.println(str2);
		Assert.assertEquals(str2, "Amazon Best Sellers");
		
		//click on New releases --------------------------------------------------------
        driver.findElement(By.linkText("New Releases")).click();
		// Assert the text on new releases page ----------------------------------------
		String str3 = driver.findElement(By.id("zg_banner_text")).getText();
		System.out.println(str3);
		Assert.assertEquals(str3,"Amazon Hot New Releases");

		driver.quit();
}
}
