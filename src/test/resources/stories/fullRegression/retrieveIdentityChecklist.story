Narrative:
In order to assert that the basic functionality of retrieve identity page is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify the user cannot submit a retrieve identity request with only 2 fields filled out
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the retrieve identity button
Then the user should see the retrieve identity page
When the user fills an option for ous and siteId
Then the user should not be able to click submit
When the user logs out 
Then the user should see the login page

Scenario: Verify the reset button clears all fields filled out
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the retrieve identity button
Then the user should see the retrieve identity page
When the user fills an option for ous and siteId
When the user clicks the reset
Then the fields should be empty, identity page
When the user logs out 
Then the user should see the login page

Scenario: Verify that filling out all fields and searching gives success alert and unique id
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the retrieve identity button
Then the user should see the retrieve identity page
When the user fills an option for ous and siteId
When the user searches by eid identity page
When the user clicks search identity page
Then the user should see the alert and unique id
When the user logs out 
Then the user should see the login page

Scenario: Verify that clicking on pending status' should give us the error alert
Meta:
Given the user is on the login page
When the user enters credentials
Then the user should see the disclaimer page
When the user clicks the accept button
Then the user should see the dashboard page
When the user clicks the retrieve identity button
Then the user should see the retrieve identity page
When the user fills an option for ous and siteId
When the user searches by eid identity page
When the user clicks search identity page
Then the user should see the alert and unique id
When the user clicks on a pending status
Then the user should see the error still processing alert
When the user logs out 
Then the user should see the login page