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
public class AddContactPage {

    public Textbox contactNameField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Textbox contactEmailField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Textbox contactPhoneField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Button saveButton =new FactoryControl<Button>(Button.class).makeControl();


    public AddContactPage() {
        contactNameField.searchCriteria= By.id("com.example.android.contactmanager:id/contactNameEditText");
        contactEmailField.searchCriteria=By.id("com.example.android.contactmanager:id/contactEmailEditText");
        contactPhoneField.searchCriteria=By.id("com.example.android.contactmanager:id/contactPhoneEditText");
        saveButton.searchCriteria=By.id("com.example.android.contactmanager:id/contactSaveButton");
    }
}
