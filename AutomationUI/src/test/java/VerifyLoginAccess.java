/**
 * Created by Eynar on 16/10/2016.
 */

import driver_handler.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class VerifyLoginAccess {

    LoginPage loginPage;
    @BeforeMethod
    public void preconditions(){
        String baseUrl = "http://todo.ly/";
       // Driver.getCurrentBrowser().getDriver().get(baseUrl);
        Driver.getCurrentBrowser().getDriver().navigate().to(baseUrl);
        loginPage=new LoginPage();
    }

    @Test
    public void addProjectTest(){
       loginPage.login("eynar.pari@gmail.com","P@ssword");
    }

    @AfterMethod
    public void cleanUp(){
        Driver.getCurrentBrowser().getDriver().close();
    }
}
