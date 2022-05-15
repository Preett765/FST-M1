package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void test1(){
    String title = driver.getTitle();
        Assert.assertEquals(title,"Target Practice");
    }
    @Test
    public void test2(){
        WebElement black= driver.findElement(By.xpath("//button[contains(text(),'Black')]"));
        Assert.assertTrue(black.isDisplayed());
        Assert.assertEquals(black.getText(),"black");

    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("this is for skipinga testcase using enabled attribute");
    }
    @Test
    public void test4() throws SkipException {
        System.out.println("this is also for skippimg but using skip exception");
        throw new SkipException("Skipping this testcase");
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
