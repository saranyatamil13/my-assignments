package chrome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.name("firstname")).sendKeys("saranya");
        driver.findElement(By.name("lastname")).sendKeys("kumarasamy");
        driver.findElement(By.name("reg_email__")).sendKeys("ksaranya.93@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("saran");
        driver.findElement(By.id("day")).sendKeys("22");
        driver.findElement(By.id("month")).sendKeys("09");
        driver.findElement(By.id("year")).sendKeys("2013");
        driver.findElement(By.xpath("//label clasas=_58mt 'female']")).click();
        
        
		
	}

}
