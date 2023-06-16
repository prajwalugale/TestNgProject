package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModels.LoginPageObjects;
import PageObjectModels.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class VerifySignUp extends BaseClass {

	@Test
	public void signUp() throws IOException, InterruptedException {

		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.clickOnTryForFree().click();

		SignUpPageObjects spo = new SignUpPageObjects(driver);
		// This is not working
		// CommonUtilities.handleExplicitWait(2, spo.enterFirstname());
		Thread.sleep(2000);
		spo.enterFirstname().sendKeys(Constant.firstName);
		spo.enterLastname().sendKeys(Constant.lastName);
		spo.enterPhone().sendKeys(Constant.phone);
		spo.enterEmail().sendKeys(Constant.email);
		spo.enterCompanyname().sendKeys(Constant.companyName);

		CommonUtilities.webelement(spo.enterEmployee(), 2);
		CommonUtilities.webelement(spo.selectJobTitle(), 3);
		CommonUtilities.webelement(spo.selectCountry(), 7);

		spo.clickChecbox().click();
	}
}
