package utilities;

import broswerfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by)
    {

        driver.findElement(by).click();
    }
    public void sendTextToElement(By by, String text)
    {

        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromElement(By by)
    {

        return driver.findElement(by).getText();
    }
    // **********************Alert Methods***************
    public void switchToAlert(){

        driver.switchTo().alert();
    }
    public void acceptAlert()
    {

        driver.switchTo().alert().accept();
    }
    public void dismissAlert()
    {

        driver.switchTo().alert().dismiss();
    }
    public String getTextFromAlert(){

        return driver.switchTo().alert().getText();
    }
    //*********************Select Class Methods******************
    public void selectByValueFromDropDown(By by, String value)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown);
        s1.selectByValue(value);
    }
    public void selectByIndexFromDropDown(By by, int index){
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown);
        s1.selectByIndex(index);
    }
    //*********************Action Methods***************
    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
}
