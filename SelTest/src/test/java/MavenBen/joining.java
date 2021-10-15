package MavenBen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class joining {
	
	@Test
	private void syso() {
		

		System.setProperty("webdriver.gecko.driver","C://Selenium jars//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver. get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("hello world");
		
	}

	
	private void syso1() {
		// TODO Auto-generated method stub

System.out.println("I am on 15Oct second branch");


	}
}
