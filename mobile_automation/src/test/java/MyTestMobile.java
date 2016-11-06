import driver_handler.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AddContactPage;
import pages.ContactManagerPage;
import pages.ContactManagerStop;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by Eynar on 10/23/2016.
 */
public class MyTestMobile {

    private AddContactPage addContactPage;
    private ContactManagerPage contactManagerPage;
    @Before
    public void setUp() throws Exception {
        Driver.getCurrentBrowser().getDriver();
        addContactPage= new AddContactPage();
        contactManagerPage=new ContactManagerPage();
    }

    @After
    public void tearDown() throws Exception {
       Driver.getCurrentBrowser().getDriver().quit();
    }

    @Test
    public void verify_contact_is_not_added() {
      contactManagerPage.addContactButton.click();
      addContactPage.contactNameField.setValue("Eynar Pari");
      addContactPage.contactPhoneField.setValue("70521314");
      addContactPage.contactEmailField.setValue("eynar.pari@gmail.com");
      addContactPage.saveButton.click();
    }
}
