package stepsDefinition;

import core.BaseTest;
import io.cucumber.java.*;

public class CucumberHooks {

    @Before
    public static void setUp() {
        BaseTest.createDriver("chrome");
        System.out.println("Setup before scenario");
    }

    @After
    public void tearDown() {
//        BaseTest.closeDriver();
        System.out.println("Cleanup after scenario");
    }


}
