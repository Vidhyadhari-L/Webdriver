package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Login_page {
    public static void main(String[] args) {
        //System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.simplilearn.com");
        //click on login button
        WebElement login_click=driver.findElement(By.xpath("//a[@class='login']"));
        login_click.click();

        //enter credentials
        WebElement user_name=driver.findElement(By.xpath("//input[@name='user_login']"));
        user_name.sendKeys("abc@xyz.com");
        WebElement user_pwd= driver.findElement(By.xpath("//input[@name='user_pwd']"));
        user_pwd.sendKeys("abc123");

        //check the remember me checkbox
        WebElement check_box= driver.findElement(By.xpath("//label[@class='rememberMe']"));
        check_box.click();







    }
}
