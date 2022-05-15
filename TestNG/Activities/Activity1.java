package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium");
    }
    @Test
    public void otherStuff(){
        System.out.println("Title of the page "+ driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Training Support - Selenium");
        //Find the clickable link on the page and click it
        driver.findElement(By.id("about-link")).click();

        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
