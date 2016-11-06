package utils;

import java.io.IOException;

/**
 * Created by Eynar on 17/10/2016.
 */
public  class MyValues {
    public static final String WEB_DRIVER_CHROME="webdriver.chrome.driver";
    public static final String WEB_DRIVER_GECKO="webdriver.gecko.driver";

    public static String DRIVER_CHROME_PATH=getProjectPath()+"\\src\\main\\java\\drivers\\chromedriver.exe";
    public static String DRIVER_FIREFOX_PATH=getProjectPath()+"/src/main/java/drivers/geckodriver2";


    private static String getProjectPath()
    {
        try {
            return new java.io.File( "." ).getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
