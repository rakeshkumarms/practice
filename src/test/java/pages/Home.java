package pages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Training.Base;

public class Home extends Base {
	
	static WebDriver driver;
	
	static LoginPage lp;

	@BeforeClass
	public static void sample() {
		driver=launchBrowser();  
		lp=new LoginPage(driver);
	}

	@AfterClass
	public static void sampleA() {
			
		driver.quit();
		
	}
	
	@Before
	public void sample1() {
		openUrl("https://opensource-demo.orangehrmlive.com/");

	}
	
	@After
	public void sample2() {
		
		tap(lp.getLogout());
	}
	
	
	@Test
	public void sample3(){
		type(lp.getUsername(), "Admin");
		
		type(lp.getPassword(), "admin123");
		screenshot("C:\\Users\\Jigsaw\\eclipse-workspace\\junit\\src\\test\\resources\\Data\\valid3.png");
		
		tap(lp.getLogin());
		
						
	}
	
	
	
}




