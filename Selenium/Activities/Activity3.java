package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of webpage " +driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Atharv");
        driver.findElement(By.id("lastName")).sendKeys("tiwari");
        driver.findElement(By.id("email")).sendKeys("abc@bv.com");
        driver.findElement(By.id("number")).sendKeys("1234569870");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.close();
    }
}
