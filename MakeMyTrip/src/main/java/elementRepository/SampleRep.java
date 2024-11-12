package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleRep {
	@FindBy(xpath="//span[@class='close closeIcon']")
	private WebElement popUp;
	public WebElement getPopUp() {
		return popUp;
	}

	@FindBy(xpath="//span[text()='COMPLETE']")
	private WebElement completedText;
	
	public WebElement getCompletedText() {
		return completedText;
	}

	@FindBy(xpath="//button[text()='Add Traveller']")
	private WebElement addTraveller;
	
	public WebElement getAddTraveller() {
		return addTraveller;
	}

	@FindBy(xpath="(//div[@class='react-select-formV2__value-container react-select-formV2__value-container--has-value css-1hwfws3'])[3]")
	private WebElement genderSelect;
	public WebElement getGenderSelect() {
		return genderSelect;
	}

	@FindBy(xpath="//div[text()='MM']")
	private WebElement mm;
	
	@FindBy(xpath="//div[text()='DD']")
	private WebElement dd;
	
	@FindBy(xpath="//div[text()='YYYY']")
	private WebElement yyyy;
	
	@FindBy(xpath="//a[text()=' Dubai Tour Packages']")
	private WebElement clickonDubaiPackage;
	
    @FindBy(xpath = "//input[@name='LAST_NAME']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='FIRST_NAME']")
	private WebElement firstName;
	
	@FindBy(xpath = "//span[text()='PROCEED TO PAYMENT']")
	private WebElement proceedToPayment;
	
	@FindBy(xpath = "(//p[text()='Add Traveller'])[1]")
	private WebElement addTraveller1;
	
	@FindBy(xpath = "//p[text()='Malaysia']")
	private WebElement malasiaLink;
	
	@FindBy(xpath = "//span[@class='icon mmt-chevron-down']")
	private WebElement dropdown;
	
	@FindBy(xpath = "//ul[@class='sortingDropdown']//li[3]")
	public WebElement priceSelection;
	
	@FindBy(xpath = "//span[@class='clearAll']")
	public WebElement filterChecking;
	
	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assisPopUp;
	
	@FindBy(xpath = "//span[text()='View All']")
	private WebElement viewAllOffers;
	
	@FindBy(xpath = "//span[text()='Flights (41)']")
	private WebElement flightsRadioButton;
	
	@FindBy(xpath = "//span[text()='Hotels (39)']")
	private WebElement hotelsradioButton;
	
	@FindBy(xpath = "//span[text()='Bus (9)']")
	private WebElement busRadioButton;
	
	public WebElement getClickonDubaiPackage() {
		return clickonDubaiPackage;
	}

	public WebElement getMm() {
		return mm;
	}

    public WebElement getDd() {
		return dd;
	}

	public WebElement getYyyy() {
		return yyyy;
	}


	public WebElement getLastName() {
		return lastName;
	}

	

	public WebElement getFirstName() {
		return firstName;
	}

	

	public WebElement getAddTraveller1() {
		return addTraveller1;
	}

	public WebElement getProceedToPayment() {
		return proceedToPayment;
	}

	

	public WebElement getFilterChecking() {
		return filterChecking;
	}

	public WebElement getPriceSelection() {
		return priceSelection;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	

	public WebElement getBusRadioButton() {
		return busRadioButton;
	}

	public WebElement getHotelsradioButton() {
		return hotelsradioButton;
	}

	public WebElement getFlightsRadioButton() {
		return flightsRadioButton;
	}

	public WebElement getViewAllOffers() {
		return viewAllOffers;
	}

	public WebElement getAssisPopUp() {
		return assisPopUp;
	}

	public SampleRep(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getMalasiaLink() {
		return malasiaLink;
	}

}
