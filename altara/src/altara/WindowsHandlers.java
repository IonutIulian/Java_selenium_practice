package altara;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")
		[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
