package Pages;

import Base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Constants.Constants.*;
public class Login extends BasePage  {
    public  Login(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public Login StartedButtonClick()  {
        click(StartedButton);
        return this;
}
    public Login MenuBarButtonClick()  {
        clickElement(MenuBarButton);
        return this;

    }
    public Login AccountIconClick()  {
        clickElement(AccountIcon);
        return this;

    }
    public Login GoogleWithLoginClick() {
        clickElement(GoogleWithLogin);
        return this;

    }
   /* public Login PositiveButtonClick()  {

        clickElement(PositiveButton);
        return this;

    } */
    public Login MyGoogleAccountClick()  {

        clickElement(MyGoogleAccount);

        return this;

    }

    public Login MyGoogleAccountSelectClick()  {

        clickElement(MyGoogleAccountSelect);

        return this;

    }

    public Login WelcomeToScreenClosedButtonClick()  {
        clickElement(WelcomeToScreenClosedButton);
        return this;

    }

    public Login SelectAccountButtonClick()  {
        clickElement(SelectAccountButton);
        return this;

    }

    public Login EmailAddressText()  {
        sendKeys(EmailAddress,"elifaydakayar1991@gmail.com");
        return this;
    }

    public Login SendButtonClick()  {
        clickElement(SendButton);
        return this;
    }

    public Login OpenEmailButtonClick(){
        clickElement(OpenEmailButton);
        return this;
    }



}
