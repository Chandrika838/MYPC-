package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		 features = {
			        "classpath:feature/UserCopyProperties.feature",
			     	      
			    },

    glue = {
        "Stepdefinitation",
        "hookclass"
    },

    plugin = {
        "pretty",
        "json:target/cucumber.json",
        
    },

    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {

        return super.scenarios();
    }
}