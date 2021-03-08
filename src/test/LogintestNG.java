package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Parameters;
public class LogintestNG {

	
	WebDriver driver;
	SoftAssert assertobj = new SoftAssert();
	ExtentReports extent;
	ExtentTest test;
@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.simplilearn.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

@Parameters({"uname","password"})
@Test
public void login(String UserName,String Password)
{
	extent = new ExtentReports ("ExtentReport.html", true);
	test=extent.startTest("Negative llogin test");
	WebElement lnkLogin=driver.findElement(By.linkText("Log in"));
	
	
    lnkLogin.click();
    //test.log(LogStatus.PASS.details);
    
    test.log(LogStatus.PASS,"clicked on lohin button");
    WebElement editUserName=driver.findElement(By.name("user_login"));
    
    editUserName.sendKeys(UserName);
    test.log(LogStatus.PASS,"user name");
    
    
    WebElement editPwd=driver.findElement(By.name("user_pwd"));
    editPwd.sendKeys(Password);
    test.log(LogStatus.PASS,"Passwoed entered");
    WebElement chkbox=driver.findElement(By.name("rememberMe"));
    WebElement btnPwd=driver.findElement(By.name("btn_login"));
    btnPwd.click();
    WebElement error = driver.findElement(By.id("msg_box"));

    String ActError = error.getText();

    String ExpError = "The email or password you have entered is invalid";

    Assert.assertEquals(ActError,ExpError);

   // assertobj.assertEquals(ActError, ExpError);
    System.out.println("After Failiure");
}

		      
@AfterMethod
public void close()
{
	   driver.quit();
	   //assertobj.assertAll();
	   extent.endTest(test);
	   extent.flush();
	   extent.close();
	  
}
}

	
		     
			     

	
	



