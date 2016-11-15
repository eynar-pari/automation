package controls.selenium_controls;

import controls.Control;
import org.openqa.selenium.By;

/**
 * Created by Eynar on 16/10/2016.
 */
public class Table extends Control {
   public Table(){}

    public boolean existElement(String value){
        searchCriteria=By.xpath(value);
        find();
        return control.isDisplayed();
    }

}
