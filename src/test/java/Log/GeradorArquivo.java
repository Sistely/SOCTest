package Log;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Sistely/eclipse-workspace/ProvaSOC/src/test/java/SOCFeatures/SOC.feature", glue = {
		"StepDefinitions" })

public class GeradorArquivo {

}
