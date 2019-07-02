package gov.aries.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.wikipedia.org")
public class Homepage extends PageObject {

	private String env = System.getProperty("environment");

	public Homepage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize();
	}

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}

	// ********************************************************************************

	@FindBy(xpath = "//*[@id='searchInput']")
	public WebElementFacade homepageSearchBoxTextbox;

	@FindBy(xpath = "//*[@id='search-form']/fieldset/button/i")
	public WebElementFacade searchButton;

	// ***********************************************************************************
	// Functions

	public String pullPageTitle() {

		System.out.println("Waiting for page title to load");
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='firstHeading']")));

		String windowUrl = getDriver().getCurrentUrl();
		System.out.println("current window url is: " + windowUrl);

		WebElement pageTitle = getDriver().findElement(By.xpath("//*[@id='firstHeading']"));
		return pageTitle.getText();
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
