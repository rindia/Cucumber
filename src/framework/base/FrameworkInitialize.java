package framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class FrameworkInitialize extends Base {


    public static void InitializeBrowser(BrowserType browserType)
    {

        WebDriver driver = null;
        switch (browserType)
        {
            case Chrome:
            {
                System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
                driver = new ChromeDriver();

               // driver = new ChromeDriver();
                break;
            }
            case Firefox:
            {
                //Open the browser
                //System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
                driver= new FirefoxDriver();
                break;
            }
            case IE:
            {
                break;
            }
        }


        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);

    }


}
