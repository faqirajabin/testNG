package testng;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class web {
	@Test
	public void site1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("APjFqb"));
		element.sendKeys("dog");
		element.sendKeys(Keys.ENTER);
	}
	@Test
	public void site2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testmatick.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"post-23638\"]/div/div/div/div[14]/div[2]/div/div/div/div[2]/a")).click();
		WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
//		WebElement firstdropdownOption = driver.findElement(By.xpath(""));
//	    firstdropdownOption.click();
	    WebElement seconddropdownmenu =driver.findElement(By.xpath("//*[@id=\"menu-item-26483\"]/a"));
	    actions.moveToElement(seconddropdownmenu).perform();
	    WebElement secondDropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26663\"]/a"));
        secondDropdownOption.click();
	    driver.get("https://testmatick.com/");
	    driver.findElement(By.xpath("//*[@id=\"rev_slider_3_1\"]/div[4]")).click();	  
	    driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[3]/ul/li[1]/a")).click();
	    driver.get("https://testmatick.com/");
	    WebElement secelementToHover = driver.findElement(By.xpath("//*[@id=\"menu-item-26337\"]/a"));
		actions = new Actions(driver);
		actions.moveToElement(secelementToHover).perform();
	    WebElement secdropdownmenu =driver.findElement(By.xpath("//*[@id=\"menu-item-26483\"]/a"));
	    actions.moveToElement(secdropdownmenu).perform();
	    WebElement secDropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26680\"]/a/span"));
        secDropdownOption.click();
	    driver.get("https://testmatick.com/"); 
	    WebElement dropdownmenu =driver.findElement(By.xpath("//*[@id=\"menu-item-26346\"]/a"));
	    actions.moveToElement(dropdownmenu).perform();
	    WebElement DropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26359\"]/a/span"));
        DropdownOption.click();
        driver.get("https://testmatick.com/");
        WebElement thirddropdownmenu =driver.findElement(By.xpath("//*[@id=\"menu-item-26347\"]/a"));
	    actions.moveToElement(thirddropdownmenu).perform();
	    WebElement thirdDropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26349\"]/a"));
        thirdDropdownOption.click();
        driver.get("https://testmatick.com/");
        driver.findElement(By.linkText("CASE STUDIES")).click();
        driver.get("https://testmatick.com/");
        WebElement fourthdropdownmenu =driver.findElement(By.linkText("KNOWLEDGE CENTER"));
	    actions.moveToElement(fourthdropdownmenu).perform();
	    WebElement fourthDropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26358\"]/a/span"));
        fourthDropdownOption.click();
        driver.get("https://testmatick.com/");
        WebElement fifthdropdownmenu =driver.findElement(By.linkText("CONTACT US"));
	    actions.moveToElement(fifthdropdownmenu).perform();
	    WebElement fifthDropdownOption = driver.findElement(By.xpath("//*[@id=\"menu-item-26630\"]/a"));
        fifthDropdownOption.click();
        driver.findElement(By.id("nf-field-287")).sendKeys("faqira");
        driver.findElement(By.id("nf-field-292")).sendKeys("abcd");
        driver.findElement(By.id("nf-field-288")).sendKeys("123@gmail.com");
        WebElement countryDropdown = driver.findElement(By.id("nf-field-293"));
        Select select = new Select(countryDropdown);
        select.selectByVisibleText("India");
        driver.findElement(By.id("nf-field-289")).sendKeys("asdfghjklqwertyuiozxcvbnm");
        driver.findElement(By.id("nf-field-290")).click();
      
        
        
//        driver.findElement(By.id(""))
   	    
//	    driver.close();	
	}

}
