package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        //static table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("no. of rows " +rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr/td"));
        System.out.println("no. of cols " +cols.size());
        //Find and print the all the cell values of the third row of the table.
        List<WebElement> third_row = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
        for(WebElement cellvalue : third_row) {
            System.out.println("cellvalue " + cellvalue.getText());
        }
        //Find and print the cell value at the second row and second column.
        WebElement cellvalue= driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("cell value of 2nd row and 2nd col " +cellvalue.getText());

        driver.close();
    }
}
