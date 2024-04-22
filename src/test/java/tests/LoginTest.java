package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.ContactListScreen;
import screens.SplashScreen;

public class LoginTest extends AppiumConfig {

    @Test
    public void loginPositive(){
        ContactListScreen contactListScreen =
                new SplashScreen(driver)
                        .switchToAuthScreen()
                        .fillEmailField("testtest@test.com")
                        .fillPasswordField("Codirovka84!")
                        .clickByLoginButton();
        AuthenticationScreen authenticationScreen = contactListScreen.logout();
        Assert.assertTrue(authenticationScreen.isItAuthenticationScreen());
    }
//loginNegative
}
