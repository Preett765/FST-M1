package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("title of a page "+ driver.getTitle());

        //Find the third header on the page.
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header text is: " + thirdHeader);
        //Find the fifth header on the page and get it's 'colour' CSS Property.
        String fifthheadercolor= driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("color of fifth heading "+fifthheadercolor);

        //Find the violet button on the page and print all the class attribute values.
        String allattribut=driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("All attributes for violet color "+allattribut);

        //Find the grey button on the page with Absolute XPath.
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
    }
}
