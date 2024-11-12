package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackageMenu {
	@FindBy(xpath="//span[text()='To City/Country/Category']")
	private WebElement toTextFieldData;
	public WebElement gettoTextFieldData() {
		return toTextFieldData;
	}

	@FindBy(xpath="//input[@class='citypicker_input']")
	private WebElement fromTextFieldData;
	public WebElement getFromTextFieldData() {
		return fromTextFieldData;
	}

	@FindBy(xpath="//button[text()='Add']")
	private WebElement addAdult;
	
	public WebElement getAddAdult() {
		return addAdult;
	}

	@FindBy(xpath="//button[@id='search_button']")
	private WebElement searchButton;
	
    @FindBy(xpath="//span[@class='close closeIcon']")
	private WebElement assistancePopUp;
    
    @FindBy(xpath="//p[text()='Kerala ']")
    private WebElement keralaPackageLink;
    
    @FindBy(xpath="//div[@data-testid='variant-option']//div[text()='With Flight']")
	private WebElement withFlightLink;
    
    @FindBy(xpath="//p[text()='Most Wanted Thailand Package']")
	private WebElement clickOnPackage;
    
	@FindBy(xpath="//p[text()='Experience beaches and sunset']")
	private WebElement searchPageopened;
	
	@FindBy(xpath="//span[@class='close closeIcon']")
	private WebElement assistPopUp;
	
	@FindBy(xpath="//div[@class='holidayBody']")
	private WebElement imageLink;
	
	@FindBy(xpath="//div[@class='intervention-close']")
	private WebElement secondPopUp;
	
	@FindBy(xpath="//div[text()='With Flight']")
	private WebElement clickOnWithFlight;
	
	@FindBy(xpath="//button[text()='SKIP']")
	private WebElement clickOnSkip;
	
	@FindBy(xpath="//div[@class='field-label down-arrow ']")
	private WebElement roomDropDown;
	
	@FindBy(xpath="//div[@data-testid=\"adult-increment-counter\"]")
	private WebElement adultPlusSign;
	
	@FindBy(xpath="//button[@class='applyBtn applyBtn-enabled']")
	private WebElement applyButton;
	
	@FindBy(xpath="//label[@class='lbl_input makeFlex column latoBold']")
	private WebElement fromTextFieldClick;
	
	@FindBy(xpath="//div[@data-testid='citypicker_list']")
	private List<WebElement> cityList;
	
	@FindBy(xpath="//span[@class='appendBottom5 field-label down-arrow ']")
	private WebElement departureDropDown;
	
	@FindBy(xpath="//input[@class='dest-search-input removeBoxShadow']")
	private WebElement toTextFieldclick;

	public WebElement getKeralaPackageLink() {
	return keralaPackageLink;
}

	public WebElement getAssistancePopUp() {
	return assistancePopUp;
}


	public WebElement getWithFlightLink() {
		return withFlightLink;
	}

	public WebElement getClickOnPackage() {
		return clickOnPackage;
	}

    public WebElement getClickOnSkip() {
		return clickOnSkip;
	}

	public WebElement getClickOnWithFlight() {
		return clickOnWithFlight;
	}

	public WebElement getSecondPopUp() {
		return secondPopUp;
	}

	public WebElement getImageLink() {
		return imageLink;
	}

	public WebElement getAssistPopUp() {
		return assistPopUp;
	}

	public WebElement getSearchPageopened() {
		return searchPageopened;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

    public WebElement getDepartureDropDown() {
		return departureDropDown;
	}

	public List<WebElement> getCityList() {
		return cityList;
	}
	 
	public WebElement getToTextFieldclick() {
		return toTextFieldclick;
	}

	public WebElement getFromTextFieldClick() {
		return fromTextFieldClick;
	}

	public WebElement getApplyButton() {
		return applyButton;
	}

	public WebElement getAdultPlusSign() {
		return adultPlusSign;
	}

	public PackageMenu(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getRoomDropDown() {
		return roomDropDown;
	}

	

}
