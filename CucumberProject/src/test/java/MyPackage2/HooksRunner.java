package MyPackage2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(features = "./src/test/resources/FeatureFiles/HooksDemo.feature", 
glue = "MyPackage", 
dryRun = false, 
monochrome = true,
plugin={"pretty","html:target/htmlop/op.html","json:jsonop/op.json","junit:junitop/op.xml"},
//tags="@sanity or @smoke",  // we can add feature file level tagging also. But we should avoid any one, its better
publish=true

)

public class HooksRunner {

}
