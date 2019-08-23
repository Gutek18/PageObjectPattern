package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void zamknacDrivera() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
