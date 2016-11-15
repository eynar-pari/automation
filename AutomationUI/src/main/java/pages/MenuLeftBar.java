package pages;

import controls.FactoryControl;
import controls.selenium_controls.Button;
import controls.selenium_controls.Textbox;
import driver_handler.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Eynar on 10/23/2016.
 */
public class MenuLeftBar {


    public Button addNewProjectButton=new FactoryControl<Button>(Button.class).makeControl();
    public Textbox newProjectField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Button addProject =new FactoryControl<Button>(Button.class).makeControl();


    public MenuLeftBar() {
        addNewProjectButton.searchCriteria= By.id("Div2");
        newProjectField.searchCriteria=By.id("NewProjNameInput");
        addProject.searchCriteria=By.id("NewProjNameButton");
    }

    public boolean isPrjectDisplayed(String value){

        By searchCriteria=By.xpath(".//*[@class='ProjItemTable']/tbody/tr/td[contains(.,'"+value+"')]");
        WebDriverWait wait = new WebDriverWait( Driver.getCurrentBrowser().getDriver(), 60);
       wait.until(ExpectedConditions.elementToBeClickable(searchCriteria));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchCriteria));
        return Driver.getCurrentBrowser().getDriver().findElement(searchCriteria).isDisplayed();
    }
}
