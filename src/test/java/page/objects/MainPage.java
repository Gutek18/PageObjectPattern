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

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#MainImageContent > map > area:nth-child(2)")
    private WebElement circularFishButton;

    @FindBy(css = "#MenuContent > a:nth-child(3)")
    private WebElement signIn;

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement bannerAfterLoginLogo;

    public LogInPage signInButton(){
        WaitForElement.waitUntilElementIsVisible(signIn);
        signIn.click();
        logger.info("Clicking SignIn Button");
        return new LogInPage();
    }

    public FishPage fishButton() {
        WaitForElement.waitUntilElementIsClickable(circularFishButton);
        circularFishButton.click();
        logger.info("Clicking on fish button");
        return new FishPage();
    }

    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
        boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();
        logger.info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }

}
