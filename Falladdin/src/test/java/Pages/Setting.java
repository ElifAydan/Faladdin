package Pages;
import Base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Constants.Constants.*;
public class Setting extends BasePage {
    public Setting(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public Setting ProfileNameControl()  {
            waitElement(ProfileName);
            Assert.assertEquals(findElement(ProfileName).getText(), "Elif, ");

            return this;
    }}
