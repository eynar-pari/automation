package pages;

import controls.FactoryControl;
import controls.selenium_controls.Button;
import controls.selenium_controls.Textbox;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 16/10/2016.
 */
public class LoginPage {

    public Button loginLink=new FactoryControl<Button>(Button.class).makeControl();
    public Textbox emailField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Textbox passwordField=new FactoryControl<Textbox>(Textbox.class).makeControl();
    public Button loginButton=new FactoryControl<Button>(Button.class).makeControl();


    public LoginPage() {
        loginLink.searchCriteria= By.xpath("//img[@src='/Images/design/pagelogin.png']");
        emailField.searchCriteria=By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
        passwordField.searchCriteria=By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
        loginButton.searchCriteria=By.id("ctl00_MainContent_LoginControl1_ButtonLogin");
    }

    public void login(String email, String password)
    {
        loginLink.click();
        emailField.setValue(email);
        passwordField.setValue(password);
        loginButton.click();
    }


}
