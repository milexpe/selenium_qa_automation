package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

public class BasePage {
	public WebDriver driver;
    public WebDriverWait wait;
    
    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }
    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    
    //Click Method
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    
    //Write Text
    public void setText(By elementBy,String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
    
    //Get Text
    public String getText(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).isDisplayed();
        return driver.findElement(elementBy).getText();
    }
    
    //Assert 2 string are equal
    public void areEqual(String expectedText, String actualText) {
        assertEquals(expectedText, actualText);
    }
}
