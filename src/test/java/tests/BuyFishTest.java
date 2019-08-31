package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class BuyFishTest extends TestBase {

    @Test
    public void test() {

        // Fluent interface
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.enterTheStore()
                .fishButton()
                .angelFishLink()
                .addingToCartSmallFish()
                .proceedToCheckout();

//        MainPage mainPage = new MainPage();
//        mainPage.fishButton().angelFishLink();
//        FishPage fishPage = new FishPage();
//        fishPage.angelFishLink();
//        AngelFish angelFish = new AngelFish();
//        angelFish.addingToCartSmallFish();
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.proceedToCheckout();

        LogInPage logInPage = new LogInPage();
        String pageText = "You must sign on before attempting to check out. Please sign on and try checking out again.";
        assertEquals(logInPage.getLogInText(), pageText);
    }
}
