package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static utils.MyValues.*;
/**
 * Created by Eynar on 16/10/2016.
 */
public class FireFox implements Browser {

    @Override
    public WebDriver createDriver() {
        System.setProperty(WEB_DRIVER_GECKO, DRIVER_FIREFOX_PATH);
        return new FirefoxDriver();
    }
}
