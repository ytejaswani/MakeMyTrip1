package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.HolidaysHomePage;
import elementRepository.PackageDetails;
import elementRepository.PackageMenu;
import elementRepository.SampleRep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class AddingActivitiesToPackage {
	WebDriver driver = new DriverFactory().getDriver();
	PackageDetails packDetails = new PackageDetails(driver);
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	PackageMenu packageMenu = new PackageMenu(driver);
	Actions act = new Actions(driver);
	SampleRep sample = new SampleRep(driver);

	@When("Now select package from package by clicking  flights and check with title")
	public void now_select_package_from_package_by_clicking_flights_and_check_with_title() throws InterruptedException {
		Thread.sleep(4000);
        //closing the getAssistance popup
		packageMenu.getAssistancePopUp().click();
		Reporter.log("Assistance popup is closed",true);
		act.scrollByAmount(0, 700).perform();
		act.scrollByAmount(0, 700).perform();
		Thread.sleep(3000);
        //clicking on the image
		packageMenu.getImageLink().click();
		Reporter.log("clicked on the image of package",true);
		Thread.sleep(3000);
        //Sale popup is closed
		packageMenu.getSecondPopUp().click();
		Reporter.log("Sale popup is closed");
		Thread.sleep(2000);
        //select the package with flight
		packageMenu.getClickOnWithFlight().click();

		driverUtility.switchToTabOnTitle(driver, "Holiday Package");
        //two different packages are present to get both the titles
		if (driver.getTitle().equals("Your Dream Goa Getaway - Best Price Guaranteed!")) {
			Reporter.log("selected package with flight", true);
		} else {
			Reporter.log("selected package with flight", true);
	    }

		Thread.sleep(4000);
		packageMenu.getClickOnSkip().click();

		driver.findElement(By.xpath("//span[@class='close closeIcon']")).click();
		act.scrollByAmount(0, 500).perform();
	}

	@When("user is able to select or remove the flights and update package")
	public void user_is_able_to_select_or_remove_the_flights_and_update_package() {
		
		packDetails.getTransferLink().click();
		Reporter.log("clicking on the flights and transfer link",true);
		packDetails.getRemoveLink().click();
		Reporter.log("removing the flight",true);
		packDetails.getUpdatePackage().click();
		Reporter.log("updating the package",true);
		packDetails.getFlightRemoved().click();
	}

	@When("User is able to see the details of the Hotel rooms")
	public void user_is_able_to_see_the_details_of_the_hotel_rooms() throws InterruptedException {
		
		packDetails.getClickOnHotels().click();
		Reporter.log("clicking on the hotels");
		WebElement changeRoom = packDetails.getChangeRoom();
		act.moveToElement(changeRoom).click();
		Assert.assertTrue(packDetails.getChangeRoom().isDisplayed());
		Reporter.log("Details of the room were displayed",true);

	}

}
