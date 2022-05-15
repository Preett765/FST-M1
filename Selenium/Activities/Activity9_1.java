package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select sc = new Select(dropdown);
        //  Select the second option using selectByVisibleText()
        sc.selectByVisibleText("Option 2");
        //Select the third option using selectByIndex()
        sc.selectByIndex(2);
        //Select the fourth option using selectByValue()

        //Finally, get all the options in the dropdown and print them one by one.
        List<WebElement> allSelected = sc.getOptions();
        for (WebElement e1: allSelected) {
            System.out.println(e1.getText());
        }
    }


}
