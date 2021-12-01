package Demo_Framework;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frstDemo {
	
	WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archa\\SELENIUM\\chromedriver_win32\\chromedriver.exe\\");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		System.out.println("title of the page is: "+title);
		
	}
	
	
}
