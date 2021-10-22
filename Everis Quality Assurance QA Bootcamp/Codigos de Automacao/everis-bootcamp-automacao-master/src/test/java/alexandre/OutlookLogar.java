package alexandre;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutlookLogar {

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

		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1634838362&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3de1bd2e59-566d-d1c3-db8a-c1286d45c88d&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&pcexp=false&cobrandid=90015");
        
		driver.findElement(By.xpath("//input[@id='i0116']")).click();
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("alexandre.paulo.silva@hotmail.com");
		


		
		driver.findElement(By.cssSelector("label[for='email']")).click();
		driver.findElement(By.id("email")).sendKeys("xandinhowpaulo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("PJ525wk#");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
 

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