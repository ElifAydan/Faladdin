package tests.android;

import Base.BaseTest;

import Pages.Login;
import Pages.Setting;
import org.testng.annotations.Test;

public class   hpTests extends BaseTest {
    @Test
    public void SuccessGoogleWithLogin()  {
        Login hb1 = new Login(appiumDriver);
        hb1.StartedButtonClick().MenuBarButtonClick().AccountIconClick().MyGoogleAccountClick()
                .SelectAccountButtonClick().MyGoogleAccountSelectClick().WelcomeToScreenClosedButtonClick()
                .AccountIconClick();
        Setting hb2=new Setting(appiumDriver);
        hb2.ProfileNameControl();

    }


}
