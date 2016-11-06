package pages;

import controls.FactoryControl;
import controls.selenium_controls.Button;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 16/10/2016.
 */
public class ContactManagerStop {

    public Button okButton=new FactoryControl<Button>(Button.class).makeControl();

    public ContactManagerStop() {
        okButton.searchCriteria = By.id("ContactManagerPage");
    }


}
