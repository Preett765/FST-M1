package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps= new DesiredCapabilities();
        caps.setCapability("DeviceId","XSXSINFAWCAM597P");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        //below help us to open an application where to start
        caps.setCapability("appPackage","com.coloros.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("noReset",true);

        //Appium Server URL
        URL serverURL= new URL("http://localhost:4723/wd/hub");

        //Driver Imitialization
        driver=new AndroidDriver<MobileElement>(serverURL,caps);
    }
    @Test
    public void multiplicationtest(){
        //find 3 and click it
        driver.findElementById("digit_3").click();
        //click *
        driver.findElementByAccessibilityId("Multiply").click();
        //find 5 and click it
        driver.findElementById("digit_5").click();
        //click =
        driver.findElementByAccessibilityId("Equals").click();
        //result
        String result= driver.findElementById("result").getText();
        System.out.println( "result : "+result );
        //assertion
        Assert.assertEquals(result,"15");
    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }
}
