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

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content ul[class='messages'] li")
    WebElement logintext;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(css = "#Catalog > form > p:nth-child(2) > input[type=password]:nth-child(4)")
    WebElement passwordField;

    @FindBy(name="signon")
    WebElement logInButton;

    public MainPage clickingOnLogInButton(){
        WaitForElement.waitUntilElementIsClickable(logInButton);
        logInButton.click();
        logger.info("Clicking on Login Button");
        return new MainPage();
    }
    public String getLogInText() {
        WaitForElement.waitUntilElementIsClickable(logintext);
        String text = logintext.getText();
        logger.info("Getting text");
        return text;
    }

    public LogInPage typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
        return this;
    }

    public LogInPage typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }
}
