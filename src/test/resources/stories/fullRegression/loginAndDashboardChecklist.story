Narrative:
In order to assert that the basic functionality of login and dashboard is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify the login page functions correctly and user can get to the dashboard
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user logs out 
Then the user should see the login page


Scenario: Verify the login page functions correctly and if declines to warning they are taken to login page
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the decline button
Then the user should see the login page


Scenario: Verify on dashboard page that we can navigate to some sidebar modules
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the report button
Then the user should see the report page
When the user clicks the encounters button
Then the user should see the encounters page
When the user logs out 
Then the user should see the login page




Scenario: Verify on dashboard page that the name of user is in the top right corner
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page 
Then the user should see their name in the top right corner
When the user logs out 
Then the user should see the login page

Scenario: Verify on dashboard page that the summaries and trends are there
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
Then the user should see the request from summary
Then the user should see the request to summary
Then the user should see the ous info summary
Then the user should see the biometric matches summary
Then the user should see the derogatory info breakdown summary
Then the user should see the activity info breakdown summary
Then the user should see the daily transaction trend
When the user logs out 
Then the user should see the login page