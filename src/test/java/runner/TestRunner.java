package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = "src/test/resources/features/featuredProducts.feature",
        glue = {"org/products/stepdefs"},
        plugin = {"pretty", "html:target/cucumber-reportsNew/FeatureProducts.html", "json:target/cucumber.json"},
        dryRun = false,
        monochrome = true,
        publish = false)



public class TestRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
