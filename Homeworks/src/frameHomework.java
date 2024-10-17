import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHomework {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame((driver.findElement(By.cssSelector("frame[xpath='1']"))));
		//driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
		System.out.println(driver.switchTo().frame(driver.findElement
				(By.xpath("//frame[@name='frame-middle']"))).getTitle());

	}

}
