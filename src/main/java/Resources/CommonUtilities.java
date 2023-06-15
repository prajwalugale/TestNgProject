package Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

	public static WebDriver driver;

	// This method is for handling static drop down
	public static void webelement(WebElement element, int index) {
		WebElement webelement = element;
		Select employee = new Select(webelement);
		employee.selectByIndex(index);

	}

	// This method is for handle the assertions
	public static void handleAssertions(String actual, String expected) {
		String actualstring = actual;
		String expectedstring = expected;
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualstring, expectedstring);
		s.assertAll();
	}

	// This method is for handle the explicit wait
	public static void handleExplicitWait(int duration, WebElement element) {
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wd.until(ExpectedConditions.visibilityOf(element));

	}
}
