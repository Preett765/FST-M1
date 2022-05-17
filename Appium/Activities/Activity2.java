package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps= new DesiredCapabilities();
        caps.setCapability("DeviceId","XSXSINFAWCAM597P");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        //below help us to open an application where to start
        caps.setCapability("appPackage","com.android.chrome");
        caps.setCapability("appActivity","com.google.android.apps.chrome.Main");
        caps.setCapability("noReset",true);

        //Appium Server URL
        URL serverURL= new URL("http://localhost:4723/wd/hub");

        //Driver Imitialization
        driver=new AndroidDriver<MobileElement>(serverURL,caps);
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void activity2(){
    driver.get("https://www.training-support.net/");
    //wait for a page to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));

        String pageTitle = driver.findElementByXPath("//android.widget.TextView[@text='Training Support']").getText();
        System.out.println("title of the home page "+pageTitle);
        MobileElement about = driver.findElementByAccessibilityId("About Us");
        about.click();

        //wait for new page to load

        //wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About Us'")));
        //get heading of about us
        String newPagetitle= driver.findElementByXPath("//android.widget.TextView[@text='About Us").getText();
        //driver.findElement(MobileBy.xpath()
        System.out.println("title of new page : "+newPagetitle);

        Assert.assertEquals(pageTitle,"Training Support");
        Assert.assertEquals(newPagetitle,"About Us");

    }
    @Test
    public void takeScreenshot() throws IOException {
        //take Screenshot
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //this specifies the location the screenshot will be saved
        File destFile = new File("src/test/resources/screenshot1.jpg");
        //this will copy the screenshot to the file created
        FileUtils.copyFile(srcFile,destFile);
        //set file path for image
        String filePath = "../" +destFile;
        //set image html in the report
        String path = "<img src='"+filePath+"'/>";
        //Show image in report
        Reporter.log(path);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
