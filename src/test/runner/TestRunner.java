package runner;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberTagStatement;
import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;


@CucumberOptions(features = {"src/test/features/"}, glue = {"steps"},format = {"pretty"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"})
public class TestRunner {


    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("output/PLMS Reports.html");
    }


    @Test(dataProvider = "features")
    public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper) {

        List<CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();

        for (Iterator<CucumberTagStatement> element = elements.iterator(); element.hasNext(); ) {
            //ToDo: Bring the scenario name from Excel sheet using the out-of-box library we have in utilities package
            //Pass the hardcoded scenario name

            CucumberTagStatement scenarioName = element.next();


            //ToDo:Verify and store the scenario name in a collection and then store the feature name and retrive the value to perform operation
            //  Settings.ScenarioContext = scenarioName.getVisualName();
        }

        // Settings.FeatureContext = cucumberFeatureWrapper.getCucumberFeature().getGherkinFeature().getName();


        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @org.testng.annotations.AfterClass(alwaysRun = true)
    public void afterClass() {
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
       // Reporter.setTestRunnerOutput("Sample test runner output message");
        for (String s : org.testng.Reporter.getOutput()) {
            Reporter.setTestRunnerOutput(s);
        }
        testNGCucumberRunner.finish();
    }


}






