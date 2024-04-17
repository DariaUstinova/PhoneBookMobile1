package tests;

import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class SplashScreenTest extends AppiumConfig {

    @Test
    public void splashScreenCheckVersion(){
       String resultVersion =  new SplashScreen(driver).getCurrentVersion();
    }


}
