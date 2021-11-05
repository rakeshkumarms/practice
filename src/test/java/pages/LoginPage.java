package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Training.Base;

public class LoginPage extends Base {
	
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	 
		
		PageFactory.initElements(driver, this);
				
	}
		
	@FindBy(id = "txtUsername")
	private WebElement username;
	
	@FindBy(id = "txtPassword")
	private WebElement password;	
	
	@FindBy(id = "btnLogin")
	private WebElement login;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	
	
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
