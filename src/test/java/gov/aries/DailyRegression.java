package gov.aries;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DailyRegression {

	@Steps
	User user;

	
	
	// **************************************************************
	// 						Login and Dashboard
	
	@Given("the user is on the login page")
	public void given_the_user_is_on_the_login_page() {
		user.onLoginPage();
	}

	@When("the user enters credentials")
	public void the_user_enters_credentials() {
		user.login();
	}
	
	@Then("the user should see the disclaimer page")
	public void the_user_should_see_the_disclaimer_page() {
		user.shouldSeeDisclaimerPage();
	}
	
	@When("the user clicks the accept button")
	public void the_user_clicks_the_accept_button() {
		user.clickAccept();
	}
	
	@When("the user clicks the decline button")
	public void the_user_clicks_the_decline_button() {
		user.clickDecline();
	}
	
	@Then("the user should see the dashboard page")
	public void the_user_should_see_the_dashboard_page() {
		user.shouldSeeDashboardPage();
	}
	
	@When("the user logs out")
	public void the_user_logs_out() {
		user.logout();
	}
	

	@Then("the user should see the login page")
	public void the_user_should_see_the_login_page() {
		user.shouldSeeLoginPage();
	}
	
	@Then("the user should see their name in the top right corner")
	public void the_user_should_see_their_name_in_the_top_right_corner() {
		user.shouldSeeName();
	}
	
	@Then("the user should see the request from summary")
	public void the_user_should_see_the_request_from_summary() {
		user.shouldSeeRequestFrom();
	}
	
	@Then("the user should see the request to summary")
	public void the_user_should_see_the_request_to_summary() {
		user.shouldSeeRequestTo();
	}
	
	@Then("the user should see the ous info summary")
	public void the_user_should_see_the_ous_info_summary() {
		user.shouldSeeOusInfo();
	}
	
	@Then("the user should see the biometric matches summary")
	public void the_user_should_see_the_biometric_matches_summary() {
		user.shouldSeeBiometric();
	}
	
	@Then("the user should see the derogatory info breakdown summary")
	public void the_user_should_see_the_derogatory_info_breakdown_summary() {
		user.shouldSeeDerog();
	}
	
	@Then("the user should see the activity info breakdown summary")
	public void the_user_should_see_the_activity_info_breakdown_summary() {
		user.shouldSeeActivity();
	}
	
	@Then("the user should see the daily transaction trend")
	public void the_user_should_see_the_daily_transaction_trend() {
		user.shouldSeeDailyTransaction();
	}
	
	
	// End of Login and Dashboard Functions
	// **************************************************************
	
	
	
	
	
	
	
	// **************************************************************
		// 						Retrieve Identity
			
	
	@When("the user clicks the retrieve identity button")
	public void the_user_clicks_the_retrieve_identity_button() {
		user.clickIdentityButton();	
	}

	@Then("the user should see the retrieve identity page")
	public void the_user_should_see_the_retrieve_identity_page() {
		user.shouldSeeIdentityPage();
	}
	
	
	@When("the user fills an option for ous and siteId")
	public void the_user_fills_an_option_for_ous_and_siteId() {
		user.fillOusAndSite();
	}
	
	@When("the user searches by eid identity page")
	public void the_user_searches_by_eid_identity_page() {
		user.searchByEIDIdentity();
	}
	
	@When("the user clicks search identity page")
	public void the_user_clicks_search_identity_page() {
		user.clickSearch();
	}
	
	@Then("the user should see the alert and unique id")
	public void the_user_should_see_the_alert_and_unique_id() {
		user.shouldSeeAlertIdentityPage();
	}
	
	@Then("the user should not be able to click submit")
	public void the_user_should_not_be_able_to_click_submit() {
		user.shouldNotBeAbleToClickSubmit();
	}
	
	@When("the user clicks the reset")
	public void the_user_clicks_the_reset() {
		user.clickIdentityResetButton();
	}
	
	@Then("the fields should be empty, identity page")
	public void the_fields_should_be_empty_identity_page() {
		user.shouldSeeNoFields();
	}
	
	@When("the user clicks on a pending status")
	public void the_user_clicks_on_a_pending_status() {
		user.clickOnPending();
	}
	
	
	@Then("the user should see the error still processing alert")
	public void the_user_should_see_the_error_still_processing_alert() {
		user.shouldSeeError();
	}
	
	// End of Retrieve Identity
	// **************************************************************
	

	
	
	
	
	
	// **************************************************************
	// 						EFT Upload
	
	@When("the user clicks the eft Upload button")
	public void the_user_clicks_the_eft_Upload_button() {
		user.clickEFTButon();
	}
	
	
	@Then("the user should see the eft Upload page")
	public void the_user_should_see_the_eft_Upload_page() {
		user.shouldSeeEFTPage();
	}

	
	@When("the user uploads an eft file")
	public void the_user_uploads_an_eft_file() {
		user.uploadEFTFile();
	}
	
	@When("the user selects an ous")
	public void the_user_selects_an_ous() {
		user.selectOus();
	}
	
	@When("the user selects an activity category")
	public void the_user_selects_an_activity_category() {
		user.selectCategory();
	}
	
	@When("the user selects an activity reason")
	public void the_user_selects_an_activity_reason() {
		user.selectReason();
	}
	
	@When("the user selects a site ID")
	public void the_user_selects_a_siteID() {
		user.selectSiteID();
	}
	
	@When("the user selects a criteria")
	public void the_user_selects_a_criteria() {
		user.selectCriteria();
	}
	
	@Then("the user should not be able to click submit upload page")
	public void the_user_should_not_be_able_to_click_submitUploadPage() {
		user.shouldNotBeAbleToClickSubmitUploadPage();
	}
	
	@When("the user clicks the upload page submit button") 
	public void the_user_clicks_the_upload_page_submit_button() {
		user.clickEFTSubmit();
	}
	
	@Then("the user should see a request sent alert")
	public void the_user_should_see_a_request_sent_alert() {
		user.shouldSeeEFTAlert();
	}
	
	@When("the user clicks reset")
	public void the_user_clicks_reset() {
		user.clickEFTReset();
	}
	
	@Then("the user should see all fields with no selection")
	public void the_user_should_see_all_fields_with_no_selection() {
		user.shouldSeeNoSelections();
	}
	

	
	// End of EFT Upload
	// **************************************************************
	
	
	
	
	// **************************************************************
	// 						Encounters
		
	@When("the user clicks the encounters button")
	public void the_user_clicks_the_encounters_button() {
		user.clickEncountersButton();
	}
	
	@Then("the user should see the encounters page")
	public void the_user_should_see_the_encounters_page() {
		user.shouldSeeEncountersPage();
	}
	
	@When("the user searches by EID")
	public void the_user_searches_by_EID() {
		user.searchByEID();
	}
	
	@Then("the user should be able to search") 
	public void the_user_should_be_able_to_search() {
		user.shouldBeAbleToSearch();
	}
	
	@Then("an alert should appear")
	public void an_alert_should_appear() {
		user.shouldSeeAlert();
	}
	
	@When("the user changes item per page to 25")
	public void the_user_changes_item_per_page_to_25() {
		user.changeItemPerPage();
	}
	
	@Then("25 items should be listed")
	public void twentyfive_items_should_be_listed() {
		user.shouldSeeItemsListed();
	}
	
	@When("the user clicks derog status twice")
	public void the_user_clicks_derog_status_twice() {
		user.clickDerogStatusTwice();
	}
	
	@Then("the first row should be watchlist and red")
	public void the_first_row_should_be_watchlist_and_red() {
		user.shoudSeeRedRow();
	}
	
	@Then("the rows should correspond to their colors")
	public void the_rows_should_correspond_to_their_colors() {
		user.shouldSeeCorrectRowColors();
	}
	
	@When("the user enters a nationality")
	public void enterNationality() {
		user.enterNationality();
	}
	@Then("the user should be be prompted to enter a start and end date")
	public void shouldEnterDate() {
		user.shouldSeePrompt();
	}
	
	// End of Encounters
	// **************************************************************
	
	
	
	@When("the user clicks the report button")
	public void the_user_clicks_the_report_button() {
		user.clickReportButton();
	}
	
	@Then("the user should see the report page")
	public void the_user_should_see_the_report_page() {
		user.shouldSeeReportPage();
	}
	

	/*
	@Then("the <searchInput> page should open correctly")
	public void then_the_searchInput_page_should_open_correctly(@Named("searchInput") String searchInput) {
		user.shouldSeePage(searchInput);
	}
	*/
}
