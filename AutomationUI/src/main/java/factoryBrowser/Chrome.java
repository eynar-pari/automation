package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import static utils.MyValues.*;
/**
 * Created by Eynar on 16/10/2016.
 */
public class Chrome implements Browser {

    @Override
    public WebDriver createDriver() {

        System.setProperty(WEB_DRIVER_CHROME, DRIVER_CHROME_PATH);
        return new ChromeDriver();
    }
}
