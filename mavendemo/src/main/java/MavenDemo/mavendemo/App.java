package MavenDemo.mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void test() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	//System.setProperty(
    	         // FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,
    	        //  "true");
    	
    	//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
    	//WebDriver driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.flipkart.com/");
    	WebElement e = driver.findElement(By.xpath("//span[.='Electronics']"));
    	
    	Actions action=new Actions(driver);
    	action.moveToElement(e).build().perform();
    	WebElement laptop = driver.findElement(By.xpath("//span[.='Laptops']"));
    	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(laptop));
    	laptop.click();
    	 WebElement pricemin = driver.findElement(By.xpath("//div[@class='_1QaKk1']/select[@class='a_eCSK']"));
    	 Select select=new Select(pricemin);
    	 select.selectByValue("25000");
    	 Thread.sleep(8000);
    	 WebElement pricemax = driver.findElement(By.xpath("//div[@class='_3nSxeA']/select[@class='a_eCSK']"));
    	 Select select1=new Select(pricemax);
    	 select1.selectByValue("50000");
    	System.out.println("done");
//    	driver.quit();
    	
    	
    	
    }
    }
