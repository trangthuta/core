package runners;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Cucumber
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("ui/login")
@SelectPackages("stepsDefinition")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepsDefinition,stepsDefinition/login")
public class LoginRunner {
}
