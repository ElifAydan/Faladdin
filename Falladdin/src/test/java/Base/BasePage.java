package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofMillis;

public class BasePage extends BaseTest {
    public AndroidDriver<MobileElement> appiumDriver;
    public WebDriverWait appiumWait;
    public static final long WAIT = 10;

    public BasePage(AndroidDriver appiumDriver) {
            this.appiumDriver = appiumDriver;
            this.appiumWait = new WebDriverWait(appiumDriver, 10);
        }

        public MobileElement findElement(By by) {                            // elementi bulmak amaçlı kullandım.
            appiumWait.until(ExpectedConditions.presenceOfElementLocated(by));
            return appiumDriver.findElement(by);
        }

        public void click(By by) {                                          // tıklama işlemi için yazdım.
            findElement(by).click();
        }

        public List<MobileElement> findElements(By by) {
            appiumWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            return appiumDriver.findElements(by);
        }

        public void sendKeys(By by, String text) {
            //wait.until(ExpectedConditions.visibilityOfElementLocated(by))
        click(by);
            findElement(by).sendKeys(text);
        }
    public void waitElement(By locator) {
        appiumWait = new WebDriverWait(appiumDriver,10);
        appiumWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void clickElement(By by) {
        appiumWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        appiumWait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

}




