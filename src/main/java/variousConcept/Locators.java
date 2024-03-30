package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void TestLocators() {
//	name
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.name("Password")).sendKeys("1234");
		
//		id
		driver.findElement(By.id("sex-0")).click();
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\marta\\Documents\\QA\\Selenium\\2022-06-11--Session 2.pptx");
//	css selector
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input[id='profession-1'][value='Automation Tester']")).click();
	    driver.findElement(By.cssSelector("input[id='tool-1'][type='checkbox']")).click();
	    driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
	    
		
//		link
	   
		/*driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.findElement(By.partialLinkText("Backend")).click();
		driver.findElement(By.linkText("TF-API Product Backend")).click();*/
//	    Xpath
//	    driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
	    driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("James");
		
		
		
		
	}

}
