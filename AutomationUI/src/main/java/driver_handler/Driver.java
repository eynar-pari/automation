package driver_handler;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Eynar on 16/10/2016.
 */
public class Driver{

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private static Driver currentBrowser = null;
    private Driver(){
        driver =FactoryBrowser.makeBrowser("chrome").createDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, 30);

    }

    public static Driver getCurrentBrowser() {
        if (currentBrowser==null)
            currentBrowser=new Driver();
        return currentBrowser;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait() {
        return webDriverWait;
    }

    public void quitDriver() {
        try {
            driver.quit();
        } catch (Exception e) {
        }
        driver = null;
    }
}
