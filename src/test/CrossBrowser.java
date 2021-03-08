package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver chromeDriver;
	WebDriver firefoxDriver;
	@Test
	public void LaunchChrome() {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		chromeDriver=new ChromeDriver();
		chromeDriver.get("https://www.simplilearn.com/");
		
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	     
	}
	
	@Test(dependsOnMethods="LaunchChrome")
	public void testCase() {
		
		WebElement lnkLogin=chromeDriver.findElement(By.linkText("Log in"));
		lnkLogin.click();
		
	}

}
