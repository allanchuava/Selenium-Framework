package gov.aries.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://66.0.1.77:8080/aries/#/security/dashboard")
public class DashboardPage extends PageObject {

	
	
	private String env = System.getProperty("environment");

	public DashboardPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
	
	
	// ********************************************************************************

	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/div/nav/ul/li[2]/a")
	public WebElementFacade reportSidebar;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/div/nav/ul/li[3]/a")
	public WebElementFacade identitySidebar;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/div/nav/ul/li[4]/a")
	public WebElementFacade eftSidebar;

	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/div/nav/ul/li[5]/a")
	public WebElementFacade encountersSidebar;

	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/div/nav/ul/li[6]/a")
	public WebElementFacade administratorSidebar;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/header/ul[2]/li[2]/a/div")
	public WebElementFacade profileName;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/header/ul[2]/li[2]/a")
	public WebElementFacade profileButton;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[1]/div/div/mat-card[1]/mat-card-header/div/mat-card-title")
	public WebElementFacade requestFromSummary;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[1]/div/div/mat-card[2]/mat-card-header/div/mat-card-title")
	public WebElementFacade requestToSummary;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[2]/div/div/mat-card[1]/mat-card-header/div/mat-card-title")
	public WebElementFacade ousInfo;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[2]/div/div/mat-card[2]/mat-card-header/div/mat-card-title")
	public WebElementFacade biometric;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[3]/div/div/mat-card/mat-card-header/div/mat-card-title")
	public WebElementFacade derogInfo;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[4]/div/div/mat-card/mat-card-header/div/mat-card-title")
	public WebElementFacade activityInfo;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/div/main/"
			+ "div/app-dashboard/div[5]/div/div/mat-card/mat-card-header/div/mat-card-title")
	public WebElementFacade dailyTrans;
	
	@FindBy(xpath = "/html/body/app-body/div/app-dashboard/header/ul[2]/li[2]/div/a[3]")
	public WebElementFacade logoutButton;
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
