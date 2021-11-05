package junitmain;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass {
	
	public static WebDriver driver;
	@BeforeClass
	public static void sample() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
	}

	@AfterClass
	public static void sample1() {
		driver.quit();

	}
	
	@Before
	public void sample2() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}
	
	@After
	public void sample3() {
		 driver.findElement(By.xpath("//a[contains(text(), 'Welcome')]")).isDisplayed();
		 System.out.println(true);
	}
	
	@Test
	public void sample4() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	

}
