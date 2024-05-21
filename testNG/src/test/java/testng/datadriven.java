package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@Test(dataProvider="login data")
	public void swglabs(String username , String password) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	}
	@AfterClass
	public void dtadriven2() {
		driver.close();
	}
	@DataProvider(name="login data")
	public Object[][] datadriven3() {
		return new Object[][] {
			{"faqira","zxcvbncvb"},
			{"fdsaFDS","HGFDSAW"},
			{"654321gfd","6qwert"},
			{"asdf656","j765rfhg"},
			{"standard_user","secret_sauce"}
		};	
	}

}
