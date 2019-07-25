package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//set chrome driver property
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		//open new instance of browser - this will support all browsers
		WebDriver driver = new ChromeDriver();
		
		//this will open the browser but supports only chrome version
		//ChromeDriver driver = new ChromeDriver();
		
		
		///FIREFOX////
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\selenium\\jar\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();*/
		
		//How to open a browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		String ExpectedTitle = "OrangeHRM";
		
				
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Thread.sleep(3000);
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			driver.findElement(By.id("welcome")).click();
			//driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			System.out.println("logged out successfully");
		}
		else
		{
			System.out.println("Expected is not equal to Actual");
		}
		
		driver.close(); //close active browser
		//driver.quit(); //multiple browsers - close all open browsers
		
	//similarities - does not return types and  does not accept argumants
		System.out.println(ExpectedTitle);
		

	}

}
