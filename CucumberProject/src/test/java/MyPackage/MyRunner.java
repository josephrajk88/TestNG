package MyPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/FeatureFiles/DataTableOrangeHRM3.feature" }, glue = {
		"MyPackage2" }, dryRun = true, monochrome = true,publish=true,
				tags="@DataTableOrangeHRM3"

)

public class MyRunner {

}
