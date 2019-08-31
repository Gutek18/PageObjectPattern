package tests;

import Manager.DriverManager;
import Manager.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static navigation.ApplicationURLs.LOGIN_URL;

public class TestBase {

    @BeforeMethod
    public void beforeMethod() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(LOGIN_URL);
    }

    @AfterMethod
    public void afterMethod() {
        DriverManager.closedDriver();
    }
}
