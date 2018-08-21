package gov.rispd.test;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import gov.rispd.test.pages.RISPDHomepage;

public class User {

	RISPDHomepage rispdHomepage;

	@Step
	public void onHomePage() {
		rispdHomepage.open();
	}

	@Step
	public void open_page(String directoryPath) {
		rispdHomepage.clearCookies();
	}

	@Step
	public void clickSearch(String searchInput) {

		rispdHomepage.homepageSearchBoxTextbox.sendKeys(searchInput);

		rispdHomepage.searchButton.click();
	}

	@Step
	public void shouldSeePage(String expectedPageName) {

		Assert.assertEquals(expectedPageName, rispdHomepage.pullPageTitle());
	}

}
