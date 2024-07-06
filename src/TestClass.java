import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("andriod");
		
		
		// click on sign in 
		driver.findElement(By.xpath("//span[@class ='nav-line-2 ']")).click();
		
		//enter email address
		
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		
		//click on continue
		driver.findElement(By.className("a-button-input")).click();
		
		//enter password
		
		//driver.findElement(By.name("ap_password")).sendKeys("password");
		//
		driver.findElement(By.id("ap_password")).sendKeys("password");
		
		//click on sign In
		
		driver.findElement(By.id("signInSubmit")).click();
		
		//click on sign In
		
		//driver.findElement(By.className("a-button-input")).click();
		
		driver.quit();
				
	}

}

