package Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;



public class BaseTest {
    protected static AndroidDriver<MobileElement> appiumDriver;
    protected static WebDriverWait appiumWait;

    @BeforeClass
    public void beforeScenario() throws MalformedURLException {
        DesiredCapabilities cap;
        cap=new DesiredCapabilities();
        cap.setCapability("deviceName","Pixel 4 API 29");
        cap.setCapability("platformName","Android");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformVersion","10.0");
        cap.setCapability("appPackage","com.faladdin.app");
        cap.setCapability("appActivity","com.faladdin.app.ui.launcher.LauncherActivity");
        cap.setCapability("skipUnlock","true");
        cap.setCapability("noReset","false");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AndroidDriver(url, cap);
        appiumWait = new WebDriverWait(appiumDriver,20);
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterScenario() {
        if(appiumDriver != null)
            appiumDriver.quit();

    }
}



