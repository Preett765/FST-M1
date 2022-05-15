package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver. getTitle();
        System.out.println("title of page " +title);
        WebElement id= driver.findElement(By.id("about-link"));
        System.out.println("text of about link using id1: " + id.getText());
        WebElement className= driver.findElement(By.className("green"));
        System.out.println("id2 "+className.getText());
        WebElement linktext= driver.findElement(By.linkText("About Us"));
        System.out.println("id3 "+linktext.getText());
        WebElement css= driver.findElement(By.cssSelector("#about-link"));
        System.out.println("id4 "+css.getText());
        driver.close();
    }
}
