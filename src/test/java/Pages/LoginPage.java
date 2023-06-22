package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		 super(driver);
	}
	
	By emailInput = By.id("email");
	By passwordInput = By.id("password");
	By loginButton = By.cssSelector("#login_form button");

	
	public LoginPage loginToTodoist(String username, String password) {
		setText(emailInput,username);
		setText(passwordInput,password);
		click(loginButton);
		return this;
	}
}
