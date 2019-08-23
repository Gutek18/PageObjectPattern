package page.objects;

import Manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPage {


    public MainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#MainImageContent > map > area:nth-child(2)")
    private WebElement circularFishButton;
    private Logger logger = LogManager.getRootLogger();

    public void fishButton() {
        WaitForElement.waitUntilElementIsClickable(circularFishButton);
        circularFishButton.click();
        logger.info("Clicking on fish button");
    }

}
