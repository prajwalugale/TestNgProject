package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class VerifyLogin extends BaseClass {
	@Test
	public void login() throws IOException {
		/*
		 * intializeDriver();
		 * driver.get("https://login.perf1h.pc-rnd.salesforce.com/?locale=in"); launch
		 * url from base class
		 */
		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.enterUsername().sendKeys(Constant.username);
		obj.enterPassword().sendKeys(Constant.password);
		obj.clickOnLogin().click();

		CommonUtilities.handleAssertions(obj.loginassert().getText(), Constant.expectedstring);

	}
}
