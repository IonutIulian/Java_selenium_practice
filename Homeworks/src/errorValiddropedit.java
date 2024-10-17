import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class errorValiddropedit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='form-group'][1]/input")).sendKeys("Mike");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mike@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("mikepass");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown = driver.findElement
				(By.cssSelector("#exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		driver.findElement(By.xpath("//div[@class='form-group'][6]/input")).sendKeys("14.03.1999");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
	}

}
