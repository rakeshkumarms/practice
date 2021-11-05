package junitmain;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Training.Base;

public class FirstClass extends Base {
	
	@BeforeClass
	public static void sample() {
		driver=launchBrowser();  
	}

	@AfterClass
	public static void sampleA() {
		driver.quit();


	}
	
	@Before
	public void sample1() {
		openUrl("https://opensource-demo.orangehrmlive.com/");

	}
	
	@After @Ignore
	public void sample2() {
		screenshot("C:\\Users\\Jigsaw\\eclipse-workspace\\junit\\src\\test\\resources\\Data");
	}
	
	@Test
	public void sample3() {
		WebElement usr = driver.findElement(By.id("txtUsername"));
		type(usr, "admin");
		
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		type(pwd, "admin123");
		
		screenshot("C:\\Users\\Jigsaw\\eclipse-workspace\\junit\\src\\test\\resources\\Data\\valid.png");

		WebElement lgn = driver.findElement(By.id("btnLogin"));
		tap(lgn);
		
		
		
	}
	
	
	
}
