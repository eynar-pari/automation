/**
 * Created by Eynar on 16/10/2016.
 */

import driver_handler.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuLeftBar;

import static org.junit.Assert.assertTrue;

public class VerifyCreateProject {

    LoginPage loginPage;
    MenuLeftBar menuLeftBar;
    @BeforeMethod
    public void preconditions(){
        String baseUrl = "http://todo.ly/";
        Driver.getCurrentBrowser().getDriver().navigate().to(baseUrl);
        loginPage=new LoginPage();
        loginPage.login("eynar.pari@gmail.com","Control123");
        menuLeftBar= new MenuLeftBar();

    }

    @Test
    public void addProjectTest(){
        String project_name="Project UI";
        menuLeftBar.addNewProjectButton.click();
        menuLeftBar.newProjectField.setValue(project_name);
        menuLeftBar.addProject.click();
        assertTrue("Project was not created",menuLeftBar.isPrjectDisplayed(project_name));
    }

    @AfterMethod
    public void cleanUp(){
        Driver.getCurrentBrowser().getDriver().close();
    }
}
