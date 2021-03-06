package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import sun.plugin2.message.LaunchJVMAppletMessage;

import java.util.Locale;

public class Driver {
    // private = restricted access
    // data type of driver is WebDriver
    private static WebDriver driver;

    private Driver(){

    }
    public synchronized static WebDriver getDriver(String browser){   // Getter
        //String browser ==> it originally comes from xml file to test base class
        //from test base it comes here

        if(driver == null){
            //first we check if the value from xml file is null or not
            //if the value from xml file NOT null we use
            // the value from xml file IS null, we ge the browser from properties file

            browser = browser == null ? ConfigurationReader.getProperty("browser"): browser;

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case "chromeHeadlesss":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    driver.manage().window().maximize();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;

                case "firefoxHeadless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    driver.manage().window().maximize();
                    break;

                case "ie":
                    if(System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new RuntimeException("You are operating Mac OS which doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
                    break;


                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    break;

                case "safari":
                    if(System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("You are operating Windows OS which doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                    break;
                default:
                    throw new RuntimeException("Illegal brower type!");
            }
        }

        return driver;
    }
    public static WebDriver getDriver(){
        return getDriver(null);
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
