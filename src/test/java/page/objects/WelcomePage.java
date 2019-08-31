package page.objects;

import Manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WelcomePage {

    public WelcomePage() {
        //    inicjalizacja WebElementów
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content > p:nth-child(2) > a")
    private WebElement button;

    public MainPage enterTheStore() {
        WaitForElement.waitUntilElementIsClickable(button);
        button.click();
        logger.info("Enter the store");
        return new MainPage();
    }
}
