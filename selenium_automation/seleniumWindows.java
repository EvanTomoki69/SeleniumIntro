public class seleniumWindows {
    public static void main(String[] args) {
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
