package gov.aries;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import gov.aries.pages.Homepage;

public class User {

	Homepage homepage;

	@Step
	public void onHomePage() {
		homepage.open();
	}

	@Step
	public void open_page(String directoryPath) {
		homepage.clearCookies();
	}

	@Step
	public void clickSearch(String searchInput) {
		homepage.homepageSearchBoxTextbox.sendKeys(searchInput);
		homepage.searchButton.click();
	}

	@Step
	public void shouldSeePage(String expectedPageName) {
		Assert.assertEquals(expectedPageName, homepage.pullPageTitle());
	}
}
