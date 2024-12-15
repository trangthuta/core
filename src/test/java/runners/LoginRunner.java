package runners;

import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME;

@Cucumber
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("ui/login")
@SelectPackages("stepsDefinition")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepsDefinition,stepsDefinition/login")
public class LoginRunner {
}
