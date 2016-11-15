package factoryBrowser;

/**
 * Created by Eynar on 16/10/2016.
 */
public class FactoryBrowser {

    public static Browser makeBrowser(String browser)
    {
        Browser browserBuilder=null;

        switch (browser.toLowerCase())
        {
            case "firefox":
                browserBuilder= new FireFox();
                break;
            case "chrome":
                browserBuilder= new Chrome();
                break;
            case "internetexplorer":
                browserBuilder= new FireFox();
                break;
            default:
                browserBuilder= new FireFox();
                break;

        }
        return browserBuilder;
    }

}
