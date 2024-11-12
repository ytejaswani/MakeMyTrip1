package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import elementRepository.PackageDetails;
import elementRepository.PackageMenu;
import elementRepository.SampleRep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class Filters {
	WebDriver driver = new DriverFactory().getDriver();
	PackageMenu packageMenu = new PackageMenu(driver);
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	Actions act = new Actions(driver);
	SampleRep sample = new SampleRep(driver);

	@When("Select the package for the trip")
	public void select_the_package_for_the_trip() throws InterruptedException {
		Thread.sleep(4000);
        //handling the popups
		packageMenu.getAssistancePopUp().click();
		act.scrollByAmount(0, 300).perform();
	}

	@When("now add filters of price duration of stay")
	public void now_add_filters_of_price_duration_of_stay() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='With Flight']")).click();
		Reporter.log("with flight filter is applied",true);
		WebElement element = driver.findElement(By.xpath("//span[@class='categoryRating  ']/span[text()='4']"));
		act.moveToElement(element).click().perform();
		sample.getDropdown().click();
		sample.getPriceSelection().click();
		Reporter.log("price range is selected from the package");
		Assert.assertTrue(sample.getFilterChecking().isDisplayed());
		Reporter.log("filters are applied");
	}

}
