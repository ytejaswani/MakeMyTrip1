package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackageDetails {
	
	@FindBy(xpath = "//h2[text()='International Destinations!']")
	private WebElement moveToPackage;
	
	@FindBy(xpath = "//p[text()='Bali']")
	private WebElement clickedOnPackage;
	
	@FindBy(xpath = "//p[text()='Discover temples and beaches']")
	private WebElement baliPage;
	
	@FindBy(xpath = "//p[contains(text(),'Delightful Singapore & Malaysia Holiday ')]")
	private WebElement clickOnPackageFromAllPack;
	
	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;
	
	@FindBy(xpath = "//li[text()='Flights']")
	private WebElement transferLink;
	
	@FindBy(xpath = "//span[text()='Remove'][1]")
	private WebElement removeLink;
	
	@FindBy(xpath = "//button[text()='YES, REMOVE']")
	private WebElement updatePackage;
	
	@FindBy(xpath = "//p[@id='Flight_changeLog']")
	private WebElement flightRemoved;
	
	@FindBy(xpath = "//ul[@class='initerary-nav  ']//li[3]")
	private WebElement clickOnHotels;
	
	@FindBy(xpath="//span[text()='Change']")
	private WebElement changeRoom;
	
	@FindBy(xpath="//p[text()='Hotel Regent Laguna']")
	private WebElement hotelDetailsPage;
	
	@FindBy(xpath="(//div[@id='chooseAndAddBtn'])[1]")
	private WebElement activityLink;
	
	@FindBy(xpath="//span[text()='Add Activity']")
     private WebElement activitiesDetails;
	
	@FindBy(xpath = "//p[text()='Malaysia']")
	private WebElement packageLink;

	public WebElement getBaliPage() {
		return baliPage;
	}

	
	public WebElement getActivitiesDetails() {
		return activitiesDetails;
	}

	public WebElement getActivityLink() {
		return activityLink;
	}

	public WebElement getHotelDetailsPage() {
		return hotelDetailsPage;
	}

	public WebElement getChangeRoom() {
		return changeRoom;
	}

	public WebElement getClickOnHotels() {
		return clickOnHotels;
	}

	public WebElement getFlightRemoved() {
		return flightRemoved;
	}

	public WebElement getUpdatePackage() {
		return updatePackage;
	}

	public WebElement getRemoveLink() {
		return removeLink;
	}

	public WebElement getTransferLink() {
		return transferLink;
	}

	public WebElement getAssistancePopUp() {
		return assistancePopUp;
	}

	public WebElement getClickOnPackageFromAllPack() {
		return clickOnPackageFromAllPack;
	}

	public WebElement getClickedOnPackage() {
		return clickedOnPackage;
	}

	public WebElement getMoveToPackage() {
		return moveToPackage;
	}

	

	public PackageDetails(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getPackageLink() {
		return packageLink;
	}
}
