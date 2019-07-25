package Webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
				
		System.out.println("Number of links = " + links.size());
		
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		/*String link = driver.findElement(By.xpath("//a")).getAttribute("href");
		System.out.println(link);*/
		
		//driver.findElement(By.linkText("Maintenance")).click();
		
		//Thread.sleep(3000);
		
		driver.close();

	}

}
