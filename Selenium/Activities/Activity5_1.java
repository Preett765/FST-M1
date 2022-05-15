package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls");
        System.out.println("title of a page "+driver.getTitle());
        WebElement chkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        //boolean chkboxdisplay=chkbox.isDisplayed();
        System.out.println("chkbox display1 "+chkbox.isDisplayed());
        WebElement removechkbox= driver.findElement(By.xpath("//button[contains(text(),'Remove checkbox')]"));
        if(chkbox.isDisplayed()==true){
            removechkbox.click();
            System.out.println("chkbox display2 "+chkbox.isDisplayed());
        }
        else{
            System.out.println("status of chkbox "+chkbox.isDisplayed());
        }
        driver.close();
    }

}
