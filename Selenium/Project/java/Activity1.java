
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");

    }
    @Test
    public void test1(){
        String title= driver.getTitle();
        System.out.println("title "+title);
        Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
    }
    @Test
    public  void test2(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement e1= driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
        String heading=e1.getText();
        System.out.println("heading " + heading);
        Assert.assertEquals(heading,"Learn from Industry Experts");
    }
    @Test
    public void test3(){
        WebElement e2= driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));
        String heading2= e2.getText();
        System.out.println("heading2 " +heading2);
        Assert.assertEquals(heading2,"Actionable Training");
    }
    @Test
    public void test4(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement e3= driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
        String popularcourse = e3.getText();
        System.out.println("popularcouse :"+popularcourse);
        Assert.assertEquals(popularcourse,"Email Marketing Strategies");
    }

    @Test
    public void test7(){
        System.out.println("moved to ttest7");
       // driver.get("https://alchemy.hguy.co/lms");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
        String onCoursesPage = driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).getText();
        Assert.assertEquals(onCoursesPage,"All Courses");
        List<WebElement> ls = driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
        int no_of_elements = ls.size();
        System.out.println("no of elements "+no_of_elements);
        for (WebElement cellvalue: ls) {
            System.out.println("value of each " +cellvalue.getText());
        }
    }
    @Test
    public void test8(){
        //click contact page
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("testname");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@bv.com");
        driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("testtt");
        driver.findElement(By.id("wpforms-submit-8")).click();
        String message = driver.findElement(By.xpath("//div[ @id='wpforms-confirmation-8']")).getText();
        System.out.println("message after submitting the contact details : "+message);
    }
    @Test
    public void Test9(){

        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/']")).click();

    }
    /*@AfterMethod
    public void teardown(){
        driver.close();
    }*/
}
