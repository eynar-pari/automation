package driver_handler;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Eynar on 16/10/2016.
 */
public class Driver{

    //private WebDriver driver;
    private AppiumDriver<AndroidElement> driver;
    private WebDriverWait webDriverWait;
    private static Driver currentBrowser = null;
    private Driver(){
        File app = new File(new File( "F:\\"), "ContactManager.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", ".ContactManager");
        capabilities.setCapability("avd", "MyVM3");
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
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
