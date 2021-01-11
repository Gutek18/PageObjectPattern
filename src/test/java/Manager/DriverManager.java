package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }
    private static final BrowserType BROWSER_TYPE = BrowserType.FIREFOX;
    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(BrowserType.CHROME);
//            driver = BrowserFactory.getBrowser(BrowserType.FIREFOX);
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            driver.quit();
        }
        driver = null;
    }
}
