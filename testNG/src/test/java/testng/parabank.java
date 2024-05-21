package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parabank {
	WebDriver driver;
	@Test(dataProvider="register data")
	public void parabank1(String firstname,String lastname, String address,String city,String state,String zipcode,String phoneno,String ssn,String username,String password, String repassword) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
		driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
		driver.findElement(By.id("customer.address.street")).sendKeys(address);
		driver.findElement(By.id("customer.address.city")).sendKeys(city);
		driver.findElement(By.id("customer.address.state")).sendKeys(state);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipcode);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneno);
		driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
		driver.findElement(By.id("customer.username")).sendKeys(username);
		driver.findElement(By.id("customer.password")).sendKeys(password);
		driver.findElement(By.id("repeatedPassword")).sendKeys(repassword);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();	
	}
	@AfterClass
	public void parabank2() {
		driver.close();
		
	}
	@DataProvider(name="register data")
	public Object[][] parabank3(){
		return new Object[][] {
			{"bvccb","hgfd","hgfds","jhgfds","gfdsgvf","jhgfds","hgfds","hbgvfcd","tfrde","ytgrfed","ytgrfde"},
			{"grfdss","gfdsaaaa","tgfds","hrtgfeds","tfdsaaaa","8765","hgfd65","iuytres76","rfewq543","yhgtfds","56788888"},
			{"dftgh","dfssssss","gfdsa","gfdssss","fdsafsd","trgefdsa","tgfdsa","tgrfdsa","098765432","uytrds","98765rd"},
			{"faqira","jabin","abc","vbn","india","123","3216549875","123456789","abc@123","bnm@123","bnm@123"}
		};
		
	}

}
