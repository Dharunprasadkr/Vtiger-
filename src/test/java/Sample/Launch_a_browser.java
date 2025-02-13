package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_a_browser {

	@Test
	public void m1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
