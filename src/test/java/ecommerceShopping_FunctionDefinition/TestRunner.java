package ecommerceShopping_FunctionDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" }, features = {
		"src/test/java/Features/Shopping.feature" }, glue = { "ecommerceShopping_FunctionDefinition" }
)

public class TestRunner {

}
