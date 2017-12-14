package steps;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import framework.base.DriverContext;
import framework.base.FrameworkInitialize;
import framework.config.ConfigReader;
import framework.config.Settings;
import framework.utilities.ExcelUtil;
import framework.utilities.LogUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestInitialize extends FrameworkInitialize {


    @Before
    public void Initialize() throws IOException {
        //Initialize Config
        ConfigReader.PopulateSettings();

        //Logging
        Settings.Logs = new LogUtil();
        Settings.Logs.CreateLogFile();
        Settings.Logs.Write("Framework Initialize");


        Settings.Logs.Write("Test Cycle Created");
        InitializeBrowser(Settings.BrowserType);
        Settings.Logs.Write("Browser Initialized");
        DriverContext.Driver.manage().deleteAllCookies();
        DriverContext.Browser.GoToUrl(Settings.AUT);
        Settings.Logs.Write("Navigated to URL " + Settings.AUT);
        DriverContext.Driver.manage().window().maximize();
        DriverContext.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @After
    public void TearDown(Scenario scenario) throws IOException {
        int num = 0;
        int maximum = 10000;
        int minimum = 10;
        Random rn = new Random();
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        int randomNum = minimum + i+num;

        if (scenario.isFailed()) {
            try {
                File srcimg = ((TakesScreenshot) DriverContext.Driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(srcimg, new File("output/images/" + randomNum + ".png"));
                Reporter.addScreenCaptureFromPath("images/" + randomNum + ".png");

            } catch (IOException e) {
                e.printStackTrace();
            }
            num++;
        }
        DriverContext.Driver.quit();
    }

}
