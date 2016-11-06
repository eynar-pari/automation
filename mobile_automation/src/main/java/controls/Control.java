package controls;

import driver_handler.Driver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Eynar on 16/10/2016.
 */
public abstract class Control {
    public By searchCriteria;
   //public WebElement control;
    public AndroidElement control;
    public AndroidElement find()

    {
        WebDriverWait wait = new WebDriverWait( Driver.getCurrentBrowser().getDriver(), 60);

        wait.until(ExpectedConditions.elementToBeClickable(searchCriteria));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCriteria));
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isDisplayed();
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isEnabled();
        Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isSelected();
        return Driver.getCurrentBrowser().getDriver().findElement(searchCriteria);
    }

    private void WaitElement(By locatorCell)
    {


    }
    public void click()
    {
     control= this.find();
     control.click();
    }

    public void doubleClick(){
        control= this.find();
    }

    public void setValue(String value)
    {
        control=this.find();
        control.sendKeys(value);
    }

    public boolean isDisplayed()
    {
        WebDriverWait wait = new WebDriverWait( Driver.getCurrentBrowser().getDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(searchCriteria));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCriteria));
        return Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isDisplayed();

    }

    public void setValueAndEnter(String value){

        control=this.find();
        control.sendKeys(value);
        control.sendKeys(Keys.ENTER);

    }
    public void exit(){

    }
}
