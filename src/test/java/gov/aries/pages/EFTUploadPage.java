package gov.aries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://66.0.1.77:8080/aries/#/security/upload")
public class EFTUploadPage extends PageObject {

	private String env = System.getProperty("environment");

	public EFTUploadPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}

	// ********************************************************************************

	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/"
			+ "div/mat-card/mat-card-content/form/div/div[4]/button")
	public WebElementFacade submitBtn; 
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/"
			+ "div/mat-card/mat-card-content/form/div/div[4]/a")
	public WebElementFacade resetBtn;
	
	@FindBy(id = "selectedFile")
	public WebElementFacade chooseFile;
	
	public String eftFile = "C:\\Users\\Emmanuel.Benyam\\Documents\\MEXICO\\prac.eft";
	
	@FindBy(xpath="/html/body/app-body/div/app-dashboard/div/main/div/app-upload/div/mat-card/mat-card-content/form/div/div[1]/mat-form-field[1]/div/div[1]/div/mat-select")
	public WebElementFacade ous;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/div/mat-card/mat-card-content/form/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select")
	public WebElementFacade category; 
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/"
			+ "div/mat-card/mat-card-content/form/div/div[1]/mat-form-field[3]/div/div[1]/div/mat-select")
	public WebElementFacade reason;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/"
			+ "div/mat-card/mat-card-content/form/div/div[1]/mat-form-field[4]/div/div[1]/div/mat-select")
	public WebElementFacade siteID;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/div/app-upload/"
			+ "div/mat-card/mat-card-content/form/div/div[1]/mat-form-field[5]/div/div[1]/div/mat-select")
	public WebElementFacade criteria;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div/mat-option[1]")
	public WebElementFacade option;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/app-loader/div")
	public WebElementFacade alert;
	
	
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
