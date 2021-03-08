package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import java.util.concurrent.TimeUnit;

public class Tables_basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        List col=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
        System.out.println("Total no of Col="+ col.size());

        List rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        System.out.println("Total no of Col="+ rows.size());

        WebElement cell_text= driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[3]/td[3]"));
        System.out.println("Value="+cell_text.getText());

        //scroll webpage to view the table excatly
        WebElement element = driver.findElement(By.xpath("//*[@id='main']/h2[1]"));
        JavascriptExecutor var1 = (JavascriptExecutor) driver;
        var1.executeScript("arguments[0].scrollIntoView();",element);




    }
}
