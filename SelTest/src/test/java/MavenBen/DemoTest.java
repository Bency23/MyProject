package MavenBen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DemoTest {

@Test	
public  void initialize()
{
	
	System.setProperty("webdriver.chrome.driver","C://Selenium jars//Chrome Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("www.google.com");
	System.out.println("Exceution is success");
	
	
}
	
		
}
