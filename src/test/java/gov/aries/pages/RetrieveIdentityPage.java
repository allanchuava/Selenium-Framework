package gov.aries.pages;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://66.0.1.77:8080/aries/#/security/identity")
public class RetrieveIdentityPage extends PageObject {

	private String env = System.getProperty("environment");

	public RetrieveIdentityPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}

	// ********************************************************************************
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/"
	 + "div[1]/mat-card/mat-card-content/form/div/div[1]/mat-form-field[1]/div/div[1]/div/mat-select")
	public WebElementFacade ous;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/mat-option[1]")
	public WebElementFacade option1;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/mat-option[1]")
	public WebElementFacade sOption1;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/mat-option[1]")
	public WebElementFacade option2;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/"
			 + "div[1]/mat-card/mat-card-content/form/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select")
	public WebElementFacade siteId;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/"
			 + "div[1]/mat-card/mat-card-content/form/div/div[2]/mat-form-field[1]/div/div[1]/div/mat-select")
	public WebElementFacade criteria;
	
	@FindBy(id = "identificationID")
	public WebElementFacade number;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/"
			+ "div/main/div/app-retrieve_identity/div[1]/mat-card/mat-card-content/form/div/div[3]/div/button")
	public WebElementFacade searchBtn;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/"
			+ "div/main/div/app-retrieve_identity/div[1]/mat-card/mat-card-content/form/div/div[3]/div/input")
	public WebElementFacade resetBtn;
	
	@FindBy(id = "identificationID")
	public WebElementFacade search_eid;
				 
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/alert")
	public WebElementFacade alert;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/div[2]"
			+ "/div/mat-table/mat-row[1]/mat-cell[1]")
	public WebElementFacade pendingStatus;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-retrieve_identity/alert/div")
	public WebElementFacade errorAlert;

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

