package gradle.cucumber;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static common.My_values.*;
/**
 * Created by Eynar on 3/3/2016.
 */
@RunWith(Cucumber.class)
public class Runner {

    @Before()
    public void beforeScenario(Scenario scenario) {
        JsonValues = new HashMap<>();
    }


    @After()
    public void afterScenario(Scenario scenario) {
    }
}

