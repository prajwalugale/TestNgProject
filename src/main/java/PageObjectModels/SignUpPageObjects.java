package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;

	By firstname = By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");
	By email = By.xpath("//input[@name='UserEmail']");
	By companyname = By.xpath("//input[@name='CompanyName']");
	By phone = By.xpath("//input[@name='UserPhone']");
	By jobtitle = By.xpath("//select[@name='UserTitle']");
	By employee = By.xpath("//select[@name='CompanyEmployees']");
	By country = By.xpath("//select[@name='CompanyCountry']");
	By checbox = By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div//div[@class='checkbox-ui']");

	public SignUpPageObjects(WebDriver driver3) {
		// TODO Auto-generated constructor stub
		driver = driver3;

	}

	public WebElement enterFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement enterLastname() {
		return driver.findElement(lastname);
	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}

	public WebElement enterCompanyname() {
		return driver.findElement(companyname);
	}

	public WebElement enterPhone() {
		return driver.findElement(phone);
	}

	public WebElement selectJobTitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement enterEmployee() {
		return driver.findElement(employee);
	}

	public WebElement selectCountry() {
		return driver.findElement(country);
	}

	public WebElement clickChecbox() {
		return driver.findElement(checbox);
	}

}
