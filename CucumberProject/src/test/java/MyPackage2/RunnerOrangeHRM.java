package MyPackage2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(features = "./src/test/resources/FeatureFiles", 
glue = "MyPackage2", 
dryRun = false, 
monochrome = true,
plugin={"html:target/htmlop/op.html","json:jsonop/op.json","junit:junitop/op.xml"},
tags="@DataTableOrangeHRM5",
publish=true

)

public class RunnerOrangeHRM {

}
