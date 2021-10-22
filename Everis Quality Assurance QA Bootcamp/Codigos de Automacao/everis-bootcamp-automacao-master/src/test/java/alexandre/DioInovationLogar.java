package alexandre;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DioInovationLogar {

	private ChromeDriver driver;

	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void logar() {
		
		WebDriverWait wait = new
		WebDriverWait(driver, 10);

		driver.get("https://digitalinnovation.one/sign-in");

		driver.findElement(By.cssSelector("label[for='email']")).click();
		driver.findElement(By.id("email")).sendKeys("xandinhowpaulo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("PJ525wk#");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    driver.findElement(By.xpath(null))
 

	}

	@After
	public void afterCenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

}