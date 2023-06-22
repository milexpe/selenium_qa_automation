package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;


public class LoginTests extends BaseTest{
	String validEmail = "milexpe@gmail.com";
	String invadlidEmail = "test@gmail.com";
	String validPassword = "Wizeline123!";
	String invalidPassword = "test";

	@Test
	public void succesfulLogin() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.NavigateToTodoist();
		homePage.goToLoginPage();
		loginPage.loginToTodoist(validEmail, validPassword);
	}
	
	@Test
	public void unsuccesfulLogin() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		homePage.NavigateToTodoist();
		homePage.goToLoginPage();
		loginPage.loginToTodoist(invadlidEmail, invalidPassword);
	}
	
}
