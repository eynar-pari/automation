package pages;

import controls.FactoryControl;
import controls.selenium_controls.Button;
import controls.selenium_controls.Textbox;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 16/10/2016.
 */
public class ContactManagerPage {

    public Button addContactButton=new FactoryControl<Button>(Button.class).makeControl();

    public ContactManagerPage() {
        addContactButton.searchCriteria = By.id("com.example.android.contactmanager:id/addContactButton");
    }
}
