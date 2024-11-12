package stepDefinition;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HolidaysHomePage;
import elementRepository.PackageDetails;
import elementRepository.PackageMenu;
import elementRepository.SampleRep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class HolidayPackages {
	WebDriver driver = new DriverFactory().getDriver();
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	PackageMenu packageMenu = new PackageMenu(driver);
	Actions act = new Actions(driver);
	SampleRep sample=new SampleRep(driver);
	HolidaysHomePage homePage = new HolidaysHomePage(driver);

	@Given("Browser should be Launched and url is navigated")
	public void browser_should_be_launched_and_url_is_navigated() {
		Reporter.log("Browser should be Launched and url is navigated", true);
		homePage.getHomePopUp().click();
		Reporter.log("pop is closed", true);
	}

	@When("user is able to click on Holiday Packages link")
	public void user_is_able_to_click_on_holiday_packages_link() throws InterruptedException {
		homePage.getHolidaysPackageLink().click();
		Reporter.log("user is able to click on Holiday Packages link", true);
	}

	@Then("Browser should be closed")
	public void browser_should_be_closed() {

		Reporter.log("Browser should be closed", true);
	}

	@When("navigates to holiday packages page")
	public void navigates_to_holiday_packages_page() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.makemytrip.com/holidays-india/");
		Reporter.log("holidays package is opend", true);
	}

	@When("User should be on Holiday Package page")
	public void user_should_be_on_holiday_package_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Luxe Holidays']")).isDisplayed());
		Reporter.log("User is on the Holidays package page", true);
	}

	@When("User should enter all valid credentials regarding trip")
	public void user_should_enter_all_valid_credentials_regarding_trip() throws Exception {
		//entering from source data text field
		packageMenu.getFromTextFieldClick().click();
		String sourceLocation=fileUtility.getDataFromExcel("Sheet1", 0, 0);
		packageMenu.getFromTextFieldData().clear();
		packageMenu.getFromTextFieldData().sendKeys(sourceLocation);
		Thread.sleep(3000);
		Reporter.log("User is able enter the source in from Text Field",true);
		
		//Enter the destination in the destination field
		packageMenu.gettoTextFieldData().click();
		String destinationLocation=fileUtility.getDataFromExcel("Sheet2", 0, 0);
		packageMenu.getToTextFieldclick().click();
		packageMenu.getToTextFieldclick().sendKeys(destinationLocation);
		Thread.sleep(3000);
		Reporter.log("User is able enter the destination in from Text Field",true);
		
        //Handling the calender popup
		packageMenu.getDepartureDropDown().click();
		String month = fileUtility.getDataFromExcel("Calender", 1, 0);
		String dateFromExcel = fileUtility.getDataFromExcel("Calender", 1, 1);
		int date = (int) Double.parseDouble(dateFromExcel);
		homePage.getDate(driver, month, date).click();
		Reporter.log("date is selected from the excel", true);

		// click on room menu and hanling the passengers
		
		packageMenu.getRoomDropDown().click();
//		if(packageMenu.getAddAdult().isDisplayed()) {
//			packageMenu.getAddAdult().click();
//		}
//		else {
			for (int i = 0; i < 2; i++) {
				if (i < 2) {
					packageMenu.getAdultPlusSign().click();
				}

			}
			
//		}

		packageMenu.getApplyButton().click();
		
	}

	@When("click on search buttons")
	public void click_on_search_button() {
		packageMenu.getSearchButton().click();
		Assert.assertTrue(packageMenu.getSearchPageopened().isDisplayed());
		Reporter.log("clicked on Search button successfully", true);
	}

	@When("Now select package from package by clicking with flights")
	public void now_select_package_from_package_by_clicking_with_flights() throws InterruptedException {
		Thread.sleep(4000);
		packageMenu.getAssistancePopUp().click();
		act.scrollByAmount(0, 1400).perform();
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
//		act.scrollByAmount(0, 500).perform();
	}
}
