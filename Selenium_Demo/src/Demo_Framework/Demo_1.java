package Demo_Framework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo_1 {
	
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archa\\SELENIUM\\chromedriver_win32\\chromedriver.exe\\");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Closing the popup
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		Thread.sleep(2000);
		
		//Using JavascriptExecutor to scroll down to the bottom
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		driver.findElement(By.id("btn_basic_example")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Window Popup Modal")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("  Follow On Twitter ")).click();
		
		Thread.sleep(3000);
		Set<String> windowHandles= driver.getWindowHandles();
		
		for(String handle : windowHandles) {
			driver.switchTo().window(handle);
		}
		
	}
	

	

}
