package gov.rispd.test;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DailyRegression {

	@Steps
	User user;

	@Given("the user is on the home page")
	public void given_the_user_is_on_homepage() {
		user.onHomePage();
	}

	@When("the user enters <searchInput> in the search box")
	public void when_the_user_enters_searchInput_in_the_search_box(@Named("searchInput") String searchInput) {
		user.clickSearch(searchInput);
	}

	@Then("the <searchInput> page should open correctly")
	public void then_the_searchInput_page_should_open_correctly(@Named("searchInput") String searchInput) {
		user.shouldSeePage(searchInput);
	}

}
