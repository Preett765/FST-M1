import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity5_6 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");

    }
    @Test
    public void test5(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement myacc = driver.findElement(By.linkText("My Account"));
        myacc.click();
        String anotherpage = driver.getTitle();
        System.out.println("title of the another page " +anotherpage);
        Assert.assertEquals(anotherpage,"My Account – Alchemy LMS");
    }
    @Test(dependsOnMethods = "test5")
    public void test6(){
        driver.findElement(By.xpath("//a[@href='#login']")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        WebElement loginpage_element = driver.findElement(By.xpath("//li/a[@href='https://alchemy.hguy.co/lms/wp-admin/profile.php'][1]"));
        String login_text = loginpage_element.getText();
        System.out.println("logintext "+login_text);
        Assert.assertEquals(login_text,"Howdy, root");
    }
}
