package gov.aries;

import net.thucydides.core.annotations.Step;


import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import gov.aries.pages.DashboardPage;
import gov.aries.pages.DisclaimerPage;
import gov.aries.pages.EFTUploadPage;
import gov.aries.pages.EncountersPage;
import gov.aries.pages.LoginPage;
import gov.aries.pages.ReportPage;
import gov.aries.pages.RetrieveIdentityPage;






public class User {

	LoginPage loginPage;
	DisclaimerPage disclaimerPage;
	DashboardPage dashboardPage;
	ReportPage reportPage;
	EncountersPage encountersPage;
	RetrieveIdentityPage identityPage;
	EFTUploadPage eftPage;
	
	private String username = "david", password = "devadmin";
	




	// **************************************************************
			// 						Login and Dashboard
				
	
	@Step
    public void openPage(String directoryPath) {
        loginPage.clearCookies();
        String url = loginPage.defaultUrl + directoryPath;
        loginPage.open();
    }
	
	@Step
	public void onLoginPage() {
		loginPage.open();
	}

	@Step
	public void open_page(String directoryPath) {
		loginPage.clearCookies();
	}

	@Step
	public void clickAccept() {
		disclaimerPage.acceptButton.click();
	}
	
	@Step
	public void clickDecline() {
		disclaimerPage.declineButton.click();
	}

	@Step
	public void shouldSeeDashboardPage() {
		
		loginPage.pause(2500);
		
		Assert.assertEquals(true, dashboardPage.pullPageTitle().contains("dashboard"));
		
		
		//Assert.assertEquals(expectedPageName, homepage.pullPageTitle());
	}
	
	@Step
	public void shouldSeeDisclaimerPage() {
		
		loginPage.pause(2500);
		
		Assert.assertEquals(true, disclaimerPage.pullPageTitle().contains("disclaimer"));
		
		//Assert.assertEquals(expectedPageName, homepage.pullPageTitle());
	}
	
	@Step
	public void login() {
		loginPage.usernameField.sendKeys(username);
		loginPage.passwordField.sendKeys(password);
		loginPage.searchButton.click();
	}
	
	@Step
	public void logout() {
		loginPage.pause(5000);
		dashboardPage.profileButton.click();
		dashboardPage.logoutButton.click();
	}

	@Step
	public void shouldSeeLoginPage() {
		
		loginPage.pause(2500);
		
		Assert.assertEquals(true, loginPage.pullPageTitle().contains("login"));
		
		loginPage.pause(1000);
	}

	public void clickReportButton() {
		dashboardPage.reportSidebar.click();
	}
	
	public void clickEncountersButton() {
		dashboardPage.encountersSidebar.click();
	}

	public void shouldSeeReportPage() {
		loginPage.pause(2500);
		
		Assert.assertEquals(true, reportPage.pullPageTitle().contains("report"));
		
	}
	
	public void shouldSeeEncountersPage() {
		loginPage.pause(2500);
		
		Assert.assertEquals(true, encountersPage.pullPageTitle().contains("encounters"));
		
	}

	public void clickIdentityButton() {
		dashboardPage.identitySidebar.click();	
	}

	public void shouldSeeIdentityPage() {
		loginPage.pause(2500);
		
		Assert.assertEquals(true, identityPage.pullPageTitle().contains("identity"));
	}
	
	public void shouldSeeName() {
		String profileName = dashboardPage.profileName.getText();
		assert(profileName.toUpperCase().equals(username.toUpperCase()));
	}

	public void shouldSeeRequestFrom() {
		String requestFromText = dashboardPage.requestFromSummary.getText();
		System.out.println("\n\n\n\nRequest From - Web: " + requestFromText + 
									"What should be: Response From Foreign Partner Summary\n\n\n\n");
		assert(requestFromText.equals("Request From Foreign Partner Summary"));
	}
	
	public void shouldSeeRequestTo() {
		String requestToText = dashboardPage.requestToSummary.getText();
		assert(requestToText.equals("Response to Foreign Partner Summary"));
	}

	public void shouldSeeOusInfo() {
		
		try {
			String ousText = dashboardPage.ousInfo.getText();
			assert("OUS Information Breakdown Summary".equals(ousText));
		} catch (Exception e) {
			assert(false);
		}
		
	}

	public void shouldSeeBiometric() {

		try {
			String bioText = dashboardPage.biometric.getText();
			assert("Biometric Matches with Derog Information Summary".equals(bioText));
		} catch (Exception e) {
			assert(false);
		}
		
	}

	public void shouldSeeDerog() {

		try {
			String derogText = dashboardPage.derogInfo.getText();
			assert("Derogatory Information Breakdown Summary".equals(derogText));
		} catch (Exception e) {
			assert(false);
		}
		
	}

	public void shouldSeeActivity() {

		try {
			String activityText = dashboardPage.activityInfo.getText();
			assert("Activity Information Breakdown Summary".equals(activityText));
		} catch (Exception e) {
			assert(false);
		}
		
	}

	public void shouldSeeDailyTransaction() {

		try {
			String dailyText = dashboardPage.dailyTrans.getText();
			assert("Daily Transaction Activity Trend".equals(dailyText));
		} catch (Exception e) {
			assert(false);
		}
		
	}

	
	
	
	
	//		End of Login/Dashboard
	// **************************************************************

	
	
	
	
	
	
	// **************************************************************
	// 						EFT Page
		

	public void clickEFTButon() {
		dashboardPage.eftSidebar.click();
	}

	public void shouldSeeEFTPage() {
		loginPage.pause(2500);
		
		Assert.assertEquals(true, eftPage.pullPageTitle().contains("upload"));
	}

	public void shouldNotBeAbleToClickSubmitUploadPage() {
		try {
			eftPage.submitBtn.click();
		} catch (Exception e) {
			assert(true);
			return;
		}
		assert(false);
	}

	public void uploadEFTFile() {
		eftPage.chooseFile.sendKeys(eftPage.eftFile);		 // eft
	}
	
	public void selectOus() {								// eft
		eftPage.ous.click();
		eftPage.option.click();
	}
	
	public void selectCategory() {							// eft
		eftPage.category.click();
		eftPage.option.click();
	}
	
	public void selectReason() {							// eft
		eftPage.reason.click();
		eftPage.option.click();
	}
	
	public void selectSiteID() {							// eft
		eftPage.siteID.click();
		eftPage.option.click();
	}
	
	public void selectCriteria() {							// eft
		eftPage.criteria.click();
		eftPage.option.click();		
	}
	
	public void clickEFTSubmit() {							// eft
		eftPage.submitBtn.click();
	}
	
	public void clickEFTReset() {							// eft
		eftPage.resetBtn.click();
	}
	
	public void shouldSeeEFTAlert() {						// eft
		try {
			assert(eftPage.alert != null);
			return;
		} catch (Exception e) {
			assert(false);
		}
	}
	
	public void shouldSeeNoSelections() {
	
			loginPage.pause(2000);
			if (eftPage.chooseFile.getAttribute("class").contains("untouched")) {
				assert(true);
				return;
			} else {
				assert(false);
				return;
			}
		
	}


	
	//		End of EFT
	// **************************************************************

	
	
	
	
	
	
	
	

	// **************************************************************
			// 						Encounters
		
	
	
	public void searchByEID() {
		encountersPage.searchDropdown.click();
		encountersPage.eidField.sendKeys("1234");
	}

	public void shouldBeAbleToSearch() {
		try {
			encountersPage.searchButton.click();
		} catch (Exception e) {
			assert(false);
			return;
		}
		assert(true);
	}

	public void shouldSeeAlert() {
		try {
			WebElement alertFound = encountersPage.alert;	
		} catch (Exception e) {
			assert(false);
			return;
		}
		assert(true);
	}
	
	public void clickDerogStatusTwice() {
		encountersPage.derogStatus.click();
		encountersPage.derogStatus.click();		
	}

	public void shoudSeeRedRow() {
		assert(encountersPage.row.getText().toLowerCase().equals("watchlist"));	
		assert(encountersPage.row.getCssValue("color").equals("rgba(255, 255, 255, 1)"));
	}

	public void changeItemPerPage() {
	
		/* HOW TO SCROLLL!!!!
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(2000);
		 */
		encountersPage.itemPerPage.click();
		encountersPage.option3.click();
				
	}

	public void shouldSeeItemsListed() {
		assert(encountersPage.currentItems.getText().contains("25"));
	}
	
	public void enterNationality() {
		loginPage.pause(2000);
		encountersPage.searchDropdown.click();
		loginPage.pause(2000);
		encountersPage.nationalityField.sendKeys("Mexico");
		loginPage.pause(2000);
	}
	
	public void shouldSeePrompt() {
		loginPage.pause(3000);
		boolean errorPrompt = true;
		assert(errorPrompt);
	}

	public void shouldSeeCorrectRowColors() {
		
		HashMap<String, String> derogColors = new HashMap<String, String> ();
		
		derogColors.put("Recidivist", "rgba(0, 0, 255, 1)");
		derogColors.put("WatchList", "rgba(219, 18, 11, 1)");
		derogColors.put("None", "rgba(255, 255, 255, 1)");
		derogColors.put("Alert", "rgba(255, 255, 0, 1)");
		
		int numRows = 25;
		
		System.out.println("------------------\n\n\n\n\n\n\n\nRow Colors : \n\n");
		for (int currRow = 1; currRow <= numRows; currRow++) {
			try {
			System.out.println("Row : " + currRow);
			
			String rowXpath = encountersPage.rowXpath1 + currRow + encountersPage.rowXpath2;
			WebElement rowStatus = dashboardPage.getDriver().findElement(By.xpath(rowXpath));
			
			String text = rowStatus.getText() ;
			String color = rowStatus.getCssValue("background-color");
			
			System.out.println( text + "   |   " + color);
			
			for (String clr: derogColors.keySet()) {
				if (clr.equals(text)) {
					System.out.println("color: " + color + " == " + derogColors.get(clr));
					boolean x = color.equals(derogColors.get(clr));
					System.out.println(x);
					assert(x);
					break;
				}
			}
			
			} catch (Exception e) {
				System.out.println("\nEXCPETION THROWN\n");
				assert(true);
			}
			
		}
		
	}
	
	
	
	
	//		End of Encounters
	// **************************************************************

	
	
	// **************************************************************
			// 						Retrieve Identity
			
	

	public void fillOusAndSite() {
		
		loginPage.pause(2000);
		identityPage.ous.click();
		
		try {
			identityPage.option1.click();
		} catch (Exception e) {
			identityPage.option2.click();
		}
		
		identityPage.siteId.click();
		loginPage.pause(2000);
		
		try {
			identityPage.option1.click();
		} catch (Exception e) {
			identityPage.option2.click();
		}
		
	
	}
	
	public void searchByEIDIdentity() {
		loginPage.pause(2000);
		identityPage.search_eid.sendKeys("1234");
	}
	
	public void clickSearch() {
		identityPage.searchBtn.click();
	}
	
	public void shouldSeeAlertIdentityPage() {
		try {
			WebElement alertFound = identityPage.alert;	
		} catch (Exception e) {
			assert(false);
			return;
		}
		assert(true);
	}
	
	public void clickIdentityResetButton() {
		identityPage.resetBtn.click();
	}

	public void shouldSeeNoFields() {
		loginPage.pause(2000);
		try {
			assert(!identityPage.ous.getAttribute("ng-reflect-model").equals("INTL.DHS.BDSP"));
			return;
		} catch (Exception e) {
			assert(true);
			return;
		}
	}
	

	public void shouldNotBeAbleToClickSubmit() {
		try {
			identityPage.searchBtn.click();
		} catch (Exception e) {
			assert(true);
			return;
		}
		assert(false);
	}
	
	public void clickOnPending() {
		identityPage.pendingStatus.click();

	}
	
	public void shouldSeeError() {
		WebElement alertFound = null;
		try {
			alertFound = identityPage.errorAlert;
			System.out.println("\n\n\nalertfound : -" + alertFound.getText() + " -\n\n\n");
		} catch (Exception e) {
			assert(false);
			return;
		}
		
		assert(alertFound.getText().toLowerCase().contains("processing"));
	}

	// 						End of Retrieve Identity
	// **************************************************************


}
