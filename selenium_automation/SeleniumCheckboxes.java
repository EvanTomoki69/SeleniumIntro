import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCheckboxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		//added thread sleep to wait for webpage load
		Thread.sleep(1500);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//exercises for Rahul Shetty 1st test
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		//my GOD, do I did the test so well(?
		WebElement nameField = driver.findElement(By.name("name"));
		nameField.clear();
		nameField.sendKeys("Evan Tomoki");
		
		WebElement mailField = driver.findElement(By.name("email"));
		mailField.clear();
		mailField.sendKeys("evan@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("exampleInputPassword1"));
		passwordField.clear();
		passwordField.sendKeys("evan69");
		
		WebElement checkBox = driver.findElement(By.id("exampleCheck1"));
		checkBox.click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		
		WebElement checkCircle = driver.findElement(By.id("inlineRadio2"));
		checkCircle.click();
		
		WebElement bdayField = driver.findElement(By.name("bday"));
		bdayField.clear();
		bdayField.sendKeys("04/04/1999");
		
		WebElement submit = driver.findElement(By.className("btn-success"));
		submit.click();
	}

}
