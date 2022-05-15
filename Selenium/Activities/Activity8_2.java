package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        ///Dynamic Table (Sortable table)
        //Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("no of rows "+rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td"));
        System.out.println("No of cols " +cols.size());
        //Find and print the cell value at the second row and second column.
        WebElement secondrow = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("secondrow and second column value "+secondrow.getText());
        //Click the header of the first column to sort by name.
        WebElement header= driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]"));
        header.click();
        //Find and print the cell value at the second row and second column again.
        WebElement secondrowagain = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("secondrow and second column value again "+secondrowagain.getText());
        //Print the cell values of the table footer.
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println(" footer text "+footer.getText());
    }
}
