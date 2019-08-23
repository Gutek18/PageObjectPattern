package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class BuyFishTest extends TestBase {

    @Test
    public void test() {
        //obiekt storny
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.enterTheStore();

        MainPage mainPage = new MainPage();
        mainPage.fishButton();

        FishPage fishPage = new FishPage();
        fishPage.angelFishLink();

        AngelFish angelFish = new AngelFish();
        angelFish.addingToCartSmallFish();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.proceedToCheckout();

        LogInPage logInPage = new LogInPage();
        String pageText = "You must sign on before attempting to check out. Please sign on and try checking out again.";
        assertEquals(logInPage.getLogInText(), pageText);
    }
}
