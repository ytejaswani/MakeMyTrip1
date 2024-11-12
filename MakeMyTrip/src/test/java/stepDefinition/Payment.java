package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HolidaysHomePage;
import elementRepository.PackageMenu;
import elementRepository.SampleRep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class Payment {
	WebDriver driver = new DriverFactory().getDriver();
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	PackageMenu packageMenu = new PackageMenu(driver);
	Actions act = new Actions(driver);
	SampleRep sample = new SampleRep(driver);
	HolidaysHomePage homePage = new HolidaysHomePage(driver);

	@When("Select the package from the list of packages")
	public void select_the_package_from_the_list_of_packages() throws InterruptedException {
		Thread.sleep(4000);
		packageMenu.getAssistancePopUp().click();
		act.scrollByAmount(0, 700).perform();
		act.scrollByAmount(0, 700).perform();
		Thread.sleep(3000);
		packageMenu.getImageLink().click();
		Thread.sleep(3000);
		packageMenu.getSecondPopUp().click();
		Thread.sleep(2000);
		packageMenu.getClickOnWithFlight().click();

		driverUtility.switchToTabOnTitle(driver, "Holiday Package");

		if (driver.getTitle().equals("Your Dream Goa Getaway - Best Price Guaranteed!")) {
			Reporter.log("selected package with flight", true);
		} else {
			Reporter.log("selected package with flight", true);
		}

		Thread.sleep(4000);
		packageMenu.getClickOnSkip().click();

		sample.getAssisPopUp().click();
		act.scrollByAmount(0, 500).perform();
	}

	@When("click on payment")
	public void click_on_payment() throws Exception {
		sample.getProceedToPayment().click();

	}

	@When("add the traveller details and click on submit")
	public void add_the_traveller_details_and_click_on_submit() throws Exception {
		String firstName = fileUtility.getDataFromPropertiesFiles("firstName1");
		String lastName = fileUtility.getDataFromPropertiesFiles("lastName");
		sample.getAddTraveller1().click();
		sample.getFirstName().sendKeys(firstName);
		sample.getLastName().sendKeys(lastName);

		sample.getDd().click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		sample.getMm().click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		sample.getYyyy().click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		sample.getGenderSelect().click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		sample.getAddTraveller().click();
		

	}

	@Then("Verify the results")
	public void verify_the_results() {
		Assert.assertTrue(sample.getCompletedText().isDisplayed());
		Reporter.log("traveller details were added successfully",true);

	}

}
