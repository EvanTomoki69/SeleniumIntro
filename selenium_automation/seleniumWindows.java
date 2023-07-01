import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class seleniumWindows {
    public static void main(String[] args) {
	System.out.println("Hello, World!");
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// This command interacts with the browser resizing the windows at their maximum value
	driver.manage().window().maximize();
	driver.get("http://google.com");
	// This command interacts navigating from the displayed webpage to another different webpage
	driver.navigate().to("https://rahulshettyacademy.com");
	// This command navigates back to previous page, and the subsequent command moves forward
	driver.navigate().back();
	driver.navigate().forward();
    }
}
