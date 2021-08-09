package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTest {

    @Test
    public void SomaDeValores() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("deviceName", "4200b20600593579");
        desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("7");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Mais");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("9");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult");
        System.out.println(el6.getText());
        Assert.assertEquals("16", el6.getText());
        driver.quit();
    }
}


