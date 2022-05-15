package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement multilistdropdown = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sc = new Select(multilistdropdown);

        //Check if the HTML element is a multi-list. Proceed with other actions if it is.
        if(sc.isMultiple()) {
            //Select the 'JavaScript' option by visible text.
            sc.selectByVisibleText("JavaScript");
            //Select the 'NodeJS' option by value.
            sc.selectByValue("node");

            //Select the 4th, 5th, and the 6th options by index.
            //Deselect the 'NodeJS' option by value attribute.
            //Deselect the 7th option by index.
            //Print the first selected option.
            //Print all selected options one by one and deselect all options.
        }
    }
}
