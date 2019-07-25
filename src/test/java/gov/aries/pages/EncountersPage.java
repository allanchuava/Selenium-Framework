package gov.aries.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://66.0.1.77:8080/aries/#/security/encounters/list")
public class EncountersPage extends PageObject {

	private String env = System.getProperty("environment");

	public EncountersPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}

	// ********************************************************************************

	@FindBy(xpath = "//*[@id=\"enctrId\"]")
	public WebElementFacade eidField;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElementFacade searchButton;
	
	@FindBy(xpath = "//input[@type='reset']")
	public WebElementFacade resetButton;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main"
			+ "/div/app-encounters/app-search/div/mat-accordion/"
			+ "mat-expansion-panel/mat-expansion-panel-header") 
	public WebElementFacade searchDropdown;
					
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/alert")
	public WebElementFacade alert;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/app-search/"
			+ "div/mat-accordion/mat-expansion-panel/div/div/form/div/div[3]/mat-slide-toggle/div/input") 
	public WebElementFacade advancedSearchBtn;
			
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/div/div/"
			+ "mat-table/mat-header-row/mat-header-cell[11]")
	public WebElementFacade derogStatus;

	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/div/div/"
			+ "mat-table/mat-row[1]/mat-cell[11]/span")
	public WebElementFacade row;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/div/div/"
			+ "mat-paginator/div/div[1]/mat-form-field/div/div[1]/div")
	public WebElementFacade itemPerPage;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/mat-option[3]")
	public WebElementFacade option3;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-encounters/div/"
			+ "div/mat-paginator/div/div[2]/div")
	public WebElementFacade currentItems;
	
	public String rowXpath1 = "/html/body/app-body/div/app-dashboard/div/main/div/"
			+ "app-encounters/div/div/mat-table/mat-row[", 
			rowXpath2 = "]/mat-cell[11]";
	
	@FindBy(id = "nationality")
	public WebElementFacade nationalityField;
	
	@FindBy(xpath = "//*[@id=\"cdk-accordion-child-0\"]/div/form/div/div[1]/div/mat-card")
	public WebElementFacade error;
	
	@FindBy(xpath = "")
	public WebElementFacade startCalendar;
	
	@FindBy(xpath = "")
	public WebElementFacade endCalendar;	
	
	// ***********************************************************************************
	// Functions

	public String pullPageTitle() {
		/*
		System.out.println("Waiting for page title to load");
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='firstHeading']")));

		String windowUrl = getDriver().getCurrentUrl();
		System.out.println("current window url is: " + windowUrl);

		WebElement pageTitle = getDriver().findElement(By.xpath("//*[@id='firstHeading']"));
		return pageTitle.getText();*/
		String windowUrl = getDriver().getCurrentUrl();
		return windowUrl;
	}

	public void clickSubNavButtons(WebElementFacade nav, WebElementFacade subNav) {
		Actions action = new Actions(getDriver());
		action.moveToElement(nav).pause(1000).moveToElement(subNav).click().build().perform();
	}

	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}

