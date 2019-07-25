package Webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginUsingAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		
		Actions act = new Actions(driver);
		act.sendKeys(login, (Keys.ENTER)).build().perform();
		
		//Alternate way is to give all actions in one syntax
		//act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		
		/*for(int i=1; i<=3;i++)
		{
			act.sendKeys(Keys.TAB).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();*/
		
		//mouse over menu (PIM) --> click on submenu item (Employee List) and then scroll down
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		act.moveToElement(PIM).build().perform();
		WebElement subMenu = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		act.sendKeys(subMenu, Keys.ENTER).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
