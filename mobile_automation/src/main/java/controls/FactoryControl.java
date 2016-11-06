package controls;

import org.openqa.selenium.By;

/**
 * Created by Eynar on 16/10/2016.
 */
public class FactoryControl<T>{

    private Class<T> control;

    public FactoryControl(Class<T> control)
    {
        this.control = control;
    }

    public T makeControl() {
        try {
            return control.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
