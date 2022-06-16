import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		
		// click on sign in 
		driver.findElement(By.xpath("//span[@class ='nav-line-2 ']")).click();
		
		LoginPage login = new LoginPage();
		
		//enter email address
		
		login.email(driver).sendKeys("test@test.com");
		
		//click on continue
		
		//driver.findElement(By.className("a-button-input")).click();
		
		login.clickContinue(driver);
		
		//enter password
		
		//driver.findElement(By.name("ap_password")).sendKeys("password");
		
		login.password(driver).sendKeys("password");
		
		//click on sign In
		
		driver.findElement(By.id("signInSubmit")).click();
		
		//click on sign In
		
		//driver.findElement(By.className("a-button-input")).click();
				
		driver.quit();
	
	}

}
