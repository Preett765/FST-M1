package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main (String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("title of a page " +driver.getTitle());

        WebElement aboutus = driver.findElement(By.xpath("//a[@id='about-link']"));
        aboutus.click();

        System.out.println("title of a new page "+ driver.getTitle());
    }
}
