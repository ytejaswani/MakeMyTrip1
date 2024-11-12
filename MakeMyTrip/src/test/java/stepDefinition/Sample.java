package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import elementRepository.PackageMenu;
import elementRepository.SampleRep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.WebDriverUtility;

public class Sample {
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	PackageMenu packageMenu=new PackageMenu(driver);
	Actions act;
	SampleRep sample=new SampleRep(driver);
	
@When("user should move to the end of the package page to select")
public void user_should_move_to_the_end_of_the_package_page_to_select() throws InterruptedException {
	Thread.sleep(3000);
	act=new Actions(driver);
	act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 500).perform();
   sample.getClickonDubaiPackage().click();
   Reporter.log("reached the Dubai package",true);
}

@When("scroll down untill user is reached to the details of all packages")
public void scroll_down_untill_user_is_reached_to_the_details_of_all_packages() throws InterruptedException {
	act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	   act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	   act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	   Reporter.log("details of all the packages are displayed",true);
}


}
