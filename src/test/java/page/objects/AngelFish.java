package page.objects;

import Manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;


public class AngelFish {

    public AngelFish() {
                PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(5) > a")
    WebElement addToCartSmallAngelfish;

    public ShoppingCart addingToCartSmallFish() {
        WaitForElement.waitUntilElementIsClickable(addToCartSmallAngelfish);
        addToCartSmallAngelfish.click();
        logger.info("Add fish to cart");
        return new ShoppingCart();
    }

}
