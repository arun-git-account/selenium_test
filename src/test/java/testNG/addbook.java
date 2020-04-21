package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	  WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		  driver = new ChromeDriver();
		  driver.get("http://18.219.229.183/:8080/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void verifyaddbook() {
	  driver.findElement(By.xpath("//a[text()='About Us']")).click();
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
	}
}
