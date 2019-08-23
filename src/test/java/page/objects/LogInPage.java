package page.objects;

import Manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogInPage {

    public LogInPage() {

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content ul[class='messages'] li")
    WebElement logintext;

    public String getLogInText(){
        WaitForElement.waitUntilElementIsClickable(logintext);
        String text = logintext.getText();
        logger.info("Getting text");
        return text;
    }
}
