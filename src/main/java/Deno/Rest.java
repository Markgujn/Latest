package Deno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rest {
	WebDriver driver;
	@BeforeTest
	public void test() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Harish Naidu\\Downloads\\EdgeDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	public void test3() {
		driver.quit();
	}

}
