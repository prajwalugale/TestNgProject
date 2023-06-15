package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	public void intializeDriver() throws IOException {
		// To read the data
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		// access the data.properties file-
		prop = new Properties();
		// loading the readed file
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\Users\\ugale\\Desktop\\CromeDrive\\chromedriver_win32\\chromedriver.exe"
			 * ); WebDriverManager we used
			 */
			// WebDriverManager.chromedriver().browserVersion("79.0.9").setup();To run with specific version
			WebDriverManager.chromedriver().setup(); // To run with latest browser
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// fire fox code

		} else if (browserName.equalsIgnoreCase("edge")) {

			// edge code

		} else {

			System.out.println("please enter proper browser value");

		}

	}

	@BeforeMethod
	public void launchUrl() throws IOException {
		intializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
	}
}
