package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity6_1 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver,30);
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("title of the page " +driver.getTitle());
        WebElement chkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));

        WebElement removechkbox= driver.findElement(By.xpath("//button[contains(text(),'Remove checkbox')]"));
        removechkbox.click();
        wait.until(ExpectedConditions.invisibilityOf(chkbox));

        removechkbox.click();
        wait.until(ExpectedConditions.visibilityOf(chkbox));
        chkbox.click();

        driver.close();
    }
}
