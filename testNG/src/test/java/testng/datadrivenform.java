package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class datadrivenform {
	WebDriver driver;
	@Test(dataProvider="details")
	public void form(String fname,String lname,String email,String userurl,String password,String repassword,String text,String number,String input) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys(fname);
		driver.findElement(By.id("last_name")).sendKeys(lname);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_url")).sendKeys(userurl);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(repassword);
		driver.findElement(By.id("check_box_1530100860_Choice1")).click();
        driver.findElement(By.id("check_box_1530100860_Choice2")).click();
        driver.findElement(By.id("check_box_1530100860_Choice3")).click();
        WebElement radioButton1 = driver.findElement(By.id("radio_1530100861_Male"));
        WebElement radioButton2 = driver.findElement(By.id("radio_1530100861_Femalie"));

       
        if (!radioButton1.isSelected()) {
            radioButton1.click();
        }
        Assert.assertTrue(radioButton1.isSelected(), "Radio Button 1 should be selected");

        
        Assert.assertFalse(radioButton2.isSelected(), "Radio Button 2 should not be selected");

        
        if (!radioButton2.isSelected()) {
            radioButton2.click();
        }
        Assert.assertTrue(radioButton2.isSelected(), "Radio Button 2 should be selected");
        Assert.assertFalse(radioButton1.isSelected(), "Radio Button 1 should not be selected");
        
       WebElement countryDropdown = driver.findElement(By.id("country_1507714747"));
        
        
        Select select = new Select(countryDropdown);
        
        select.selectByVisibleText("Canada");
        
        
        WebElement selectedOption = select.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "Canada", "Selected country should be Canada");
        
        driver.findElement(By.id("textarea_1507714757")).sendKeys(text);
        driver.findElement(By.id("number_box_1507716030")).sendKeys(number);
        WebElement optionDropdown = driver.findElement(By.id("select_1507714760"));
        
        
         select = new Select(optionDropdown);
        
        select.selectByVisibleText("Option 2");
        
        
        WebElement selectedOptn = select.getFirstSelectedOption();
        Assert.assertEquals(selectedOptn.getText(), "Option 2", "Selected option is Option 2");
        
        driver.findElement(By.id("input_box_1507714764")).sendKeys(input);
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-20\"]/form/div[6]/button")).click();
       }
	@AfterClass
	public void form1() {
		driver.close();
		
	}
	@DataProvider(name="details")
	public Object[][] form2(){
		return new Object[][] {
			{"dsa","rewq","fdsa","xcvbn.cvb","cvb12","fghj123","qwertyuzxcvbn","789456123","asdfghzxc"},
			{"dsaaaaa","rewq","faqirajabin7594@gmail.com","https://git-scm.com/download/win","growty@654","growty@654","asdfghj","1234567891","asdfghjklzxcvbnm"}
		};
	}	
	}

