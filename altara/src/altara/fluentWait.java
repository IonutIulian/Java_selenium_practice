package altara;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		String messa ;
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1")).click();
		driver.findElement(By.tagName("button")).click();
		
		
		
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement flu = fluentwait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.id("finish")).isDisplayed()) {
					return driver.findElement(By.id("finish"));
					
				}
				else 
					return null;
				
			}
		});
		System.out.println(driver.findElement(By.id("finish")).isDisplayed());
		
		System.out.println(driver.findElement(By.id("finish")).getText());
		
//		String message ;
//		driver.get("https://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Dynamic Loading")).click();
//		driver.findElement(By.partialLinkText("Example 1")).click();
//		driver.findElement(By.tagName("button")).click();
		
		
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		//message = driver.findElement(By.id("finish")).getText();
		
		//System.out.println(message);
		driver.close();
	}

}
