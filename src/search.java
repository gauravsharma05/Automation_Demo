import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

		//click on go using xpath
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		//click on go using cssSelector
	//	driver.findElement(By.cssSelector("input[value='Go']")).click();
		
		//read the text from the RESULTS string
		//String str = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']")).getText();
		
		  
		String str = driver.findElement(By.cssSelector("h2.a-size-medium-plus.a-spacing-none.a-color-base.a-text-bold")).getText();

		
		Assert.assertEquals(str, "Results");
		System.out.println(str);
		
		
		//click on the first iphone ------------------------------------------------
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//click on add to basket----------------------------------------------------
		//driver.findElement(By.id("add-to-cart-button")).click();
		
		//click on add to basket----------------------------------------------------
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		
		//click on "no Thanks" for insurance ---------------------------------------
		
		
		//driver.findElement(By.id("attachSiNoCoverage")).click();
		
	
		driver.quit();
	}
}
