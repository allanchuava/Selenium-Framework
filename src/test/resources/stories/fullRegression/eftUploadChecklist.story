Narrative:
In order to assert that the basic functionality of eft Upload is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify the user cannot upload just by filling out two fields
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the eft Upload button
Then the user should see the eft Upload page
When the user uploads an eft file
When the user selects an ous
Then the user should not be able to click submit upload page
When the user logs out 
Then the user should see the login page

Scenario: Verify the user cannot upload just by filling out three fields
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the eft Upload button
Then the user should see the eft Upload page
When the user uploads an eft file
When the user selects an ous
When the user selects an activity category
When the user selects a site ID
Then the user should not be able to click submit upload page
When the user logs out 
Then the user should see the login page

Scenario: Verify the user cannot upload just by filling out all fields except for eft file
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the eft Upload button
Then the user should see the eft Upload page
When the user selects an ous
When the user selects an activity category
When the user selects a site ID
When the user selects a criteria
Then the user should not be able to click submit upload page
When the user logs out 
Then the user should see the login page

Scenario: Verify the user can search and a success alert pops up
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the eft Upload button
Then the user should see the eft Upload page
When the user selects an ous
When the user selects an activity category
When the user selects an activity reason
When the user selects a site ID
When the user selects a criteria
When the user uploads an eft file
When the user clicks the upload page submit button
Then the user should see a request sent alert
When the user logs out 
Then the user should see the login page

Scenario: Verify the user reset button works
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the eft Upload button
Then the user should see the eft Upload page
When the user selects an ous
When the user selects an activity category
When the user selects an activity reason
When the user selects a site ID
When the user selects a criteria
When the user uploads an eft file
When the user clicks reset
Then the user should see all fields with no selection
When the user logs out 
Then the user should see the login page