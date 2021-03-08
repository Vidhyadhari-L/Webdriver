package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class XapthFacebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        //login details
//        WebElement user_name= driver.findElement(By.xpath("//input[@name='email']"));
//        user_name.sendKeys("abc@gmail.com");
//        WebElement user_pwd= driver.findElement(By.xpath("//input[@name='pass']"));
//        user_pwd.sendKeys("123");
//        WebElement login_click= driver.findElement(By.cssSelector("button[name=login]"));
//        login_click.click();

        //create account details
        WebElement create_click=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
        create_click.click();
//        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
//        firstname.sendKeys("ABC");
//        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
//        lastname.sendKeys("XYZ");
//        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//       email.sendKeys("ADC@gmail.com");
//        WebElement email_confirmation=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
//        email_confirmation.sendKeys("ADC@gmail.com");
//        WebElement new_password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//        new_password.sendKeys("ADC@gmail.com");

        WebElement create_acc= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        create_acc.click();
        WebElement select_birth_date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select date=new Select(select_birth_date);
        date.selectByIndex(6);

        WebElement select_birth_month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select month=new Select(select_birth_month);
        month.selectByVisibleText("Feb");


        WebElement select_birth_year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select year=new Select(select_birth_year);
        year.selectByValue("2017");

        WebElement select_gender=driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
        select_gender.click();






    }
}
