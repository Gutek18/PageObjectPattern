package page.objects;

import Manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShoppingCart {

    public ShoppingCart() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Cart > a")
    WebElement checkoutButton;

    public void proceedToCheckout() {
        WaitForElement.waitUntilElementIsClickable(checkoutButton);
        checkoutButton.click();
        logger.info("Click on checkout button");
    }
}
