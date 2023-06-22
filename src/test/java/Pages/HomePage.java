package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver){
		 super(driver);
	}
	
	//Page Variables
	String baseURL = "https://todoist.com";
	
	//Web Elements
	By loginLink = By.cssSelector("ul._3XsmI a[href='/users/showlogin'");

	
	// Page Methods
	
	//Go to Homepage
	public HomePage NavigateToTodoist() {
		driver.get(baseURL);
        return this;
	}
	
	//Go to LoginPage
    public LoginPage goToLoginPage (){
        click(loginLink);
        return new LoginPage(driver);
    }

}
