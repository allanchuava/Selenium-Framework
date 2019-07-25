Narrative:
In order to assert that the basic functionality of encounters page is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify that the search by EID works
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the encounters button
Then the user should see the encounters page
When the user searches by EID
Then the user should be able to search
Then an alert should appear
When the user logs out 
Then the user should see the login page

Scenario: Verify that the derog status' correspond to their correct colors
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the encounters button
Then the user should see the encounters page
When the user changes item per page to 25
Then 25 items should be listed
When the user clicks derog status twice
Then the rows should correspond to their colors
When the user logs out 
Then the user should see the login page

Scenario: Verify that the advanced search works by nationality
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the encounters button
Then the user should see the encounters page
When the user enters a nationality
Then the user should be be prompted to enter a start and end date
When the user logs out 
Then the user should see the login page

Scenario: Verify that the advanced search works by first name
Meta:


Scenario: Verify that the advanced search does not work if incorrect values not provided
Meta:
