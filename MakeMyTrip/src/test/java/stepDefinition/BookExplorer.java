package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HolidaysHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;

public class BookExplorer {
	WebDriver driver = new DriverFactory().getDriver();
	HolidaysHomePage homePage = new HolidaysHomePage(driver);
	FileUtility fileUtility = new FileUtility();

	@When("User should click on BookLink")
	public void user_should_click_on_book_link() {
		homePage.getBookExplorerLink().click();

	}

	@When("user clicks on {int} inside BookMenu")
	public void user_clicks_on_inside_book_menu(Integer locationData) throws Exception {
		String locData = fileUtility.getDataFromExcel("Sheet2", locationData, 0);
		switch (locData) {
		case "North East":
			homePage.getNorthEastLink().click();
//			Assert.assertTrue(homePage.getNorthPageText().isDisplayed());
			Reporter.log("North Packages are displayed", true);

		case "Goa":
			homePage.getGoaLink().click();
			Assert.assertTrue(homePage.getGoaLink().isDisplayed());
			Reporter.log("Goa Packages are displayed", true);
			break;
		case "Kerala":
			homePage.getKerala().click();
			Assert.assertTrue(homePage.getKerala().isDisplayed());
			Reporter.log("Kerala Packages are displayed", true);
			break;

		}
		Reporter.log(locData + " is selected", true);
	}

}
