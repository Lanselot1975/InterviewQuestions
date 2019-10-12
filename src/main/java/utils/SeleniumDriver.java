package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static SeleniumDriver seleniumDriver;

    private static WebDriver driver;

    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

//    private SeleniumDriver() {
//
//        String browser = "firefox";
//
//        if(browser.equals("chrome")){
//            if (isWindows()) {
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
//            } else if (isMac()) {
//                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
//            }
//            driver = new ChromeDriver();
//
//        }else if(browser.equals("firefox")){
//            if (isWindows()) {
//                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe");
//            } else if (isMac()) {
//                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver");
//            }
//            driver = new FirefoxDriver();
//        }
//
//        driver.manage().window().maximize();
//
//        waitDriver = new WebDriverWait(driver, TIMEOUT);
//        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//    }

    private SeleniumDriver(String browser) {

//        String browser = "firefox";

        if(browser.equals("chrome")){
            if (isWindows()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
            }
            driver = new ChromeDriver();

        }else if(browser.equals("firefox")){
            if (isWindows()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resourcesexecutables/geckodriver.exe");
            } else if (isMac()) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver");
            }
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public static boolean isWindows() {

        return (OS.indexOf("win") >= 0);

    }

    public static boolean isMac() {

        return (OS.indexOf("mac") >= 0);

    }
    public static void openPage(String url){

        driver.get(url);
    }

    public static void closePage(){
        driver.close();
    }

    public static WebDriver getDriver(){

        return driver;
    }

//    public static void setDriver(){
//
//        if(seleniumDriver == null){
//            seleniumDriver = new SeleniumDriver();
//        }
//    }
    public static void setDriver(String browser){

        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver(browser);
        }
    }

    public static void switchWindow(String windowName){

        driver.switchTo().window(windowName);
    }

    public static void tearDown(){

        if(driver != null){
            driver.quit();
        }

        seleniumDriver = null;
    }
}
