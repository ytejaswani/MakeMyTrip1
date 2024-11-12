package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidaysHomePage {
	WebDriver driver;
	@FindBy(xpath="//span[@class='close closeIcon']")
	private WebElement assistPopUp;

	@FindBy(xpath = "//span[text()='Holiday Packages' and @class='headerIconTextAlignment chNavText darkGreyText']")
	private WebElement holidaysPackageLink;
	
	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement homePopUp;
	
	@FindBy(xpath="//input[@class='citypicker_input']")
	private WebElement fromTextField;
	
	@FindBy(xpath="//ul[@data-testid=\"recent_search_list\"]//li")
	private WebElement clickFromTextField;
	
	@FindBy(xpath="//div[@class='dest-city-container']//div[@class='dest-city-name']")
	private WebElement clickToTextField;
	
	@FindBy(xpath="//span[text()='Book @1']")
    private WebElement bookExplorerLink;
	
	@FindBy(xpath="//a[text()='North East']")
	private WebElement northEastLink;
	
	@FindBy(xpath="//ul[@class='hdlRegion__citylist']//a[text()='Kashmir']")
	private WebElement kashmirLink;
	
	@FindBy(xpath="//ul[@class='hdlRegion__citylist']//a[text()='Goa']")
	private WebElement goaLink;
	
	@FindBy(xpath="//ul[@class='hdlRegion__citylist']//a[text()='Kerala']")
	private WebElement Kerala;
	
	@FindBy(xpath="//input[@class='dest-search-input removeBoxShadow']")
	private WebElement toTextField;
	
	@FindBy(xpath="//p[text()='Explore the Charms of the Sikkim in India']")
	 private WebElement northPageText;
	
	@FindBy(xpath="//h1[text()='Kerala Packages']")
	 private WebElement keralaPageText;
	
	 @FindBy(xpath="//h1[text()='Goa Packages']")
	 private WebElement goaPageText;
	 
	 @FindBy(xpath="//h1[text()='Kashmir Packages']")
	 private WebElement kashmirPageText;
	 
	 @FindBy(xpath="//button[@id='search_button']")
		private WebElement searchButton;
	
	public WebElement getAssistPopUp() {
		return assistPopUp;
	}
	public WebElement getNorthEastLink() {
		return northEastLink;
	}

    public WebElement getKashmirLink() {
		return kashmirLink;
	}

    public WebElement getGoaLink() {
		return goaLink;
	}

    public WebElement getKerala() {
		return Kerala;
	}

	
	public WebElement getBookExplorerLink() {
		return bookExplorerLink;
	}



	public WebElement getFromTextField() {
		return fromTextField;
	}



	public WebElement getClickToTextField() {
		return clickToTextField;
	}



	public WebElement getToTextField() {
		return toTextField;
	}

	
	 
	 public WebElement getNorthPageText() {
		return northPageText;
	}



	public WebElement getKeralaPageText() {
		return keralaPageText;
	}



	public WebElement getGoaPageText() {
		return goaPageText;
	}



	public WebElement getKashmirPageText() {
		return kashmirPageText;
	}

	
	
    public WebDriver getDriver() {
		return driver;
	}



	public WebElement getClickFromTextField() {
		return clickFromTextField;
	}



	public WebElement getfromTextField() {
		return fromTextField;
	}

	

	public WebElement getSearchButton() {
		return searchButton;
	}

	

	public WebElement getHomePopUp() {
		return homePopUp;
	}

	public HolidaysHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getHolidaysPackageLink() {
		return holidaysPackageLink;
	}
	public WebElement getDate(WebDriver driver,String month,int date) {
		return driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]/../..//p[text()='"+date+"']"));
	}

}
