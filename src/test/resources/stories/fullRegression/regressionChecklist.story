Narrative:
In order to assert that the basic functionality of wikipedia is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: Verify the search box to assert that the pages open correctly
Meta:
Given the user is on the home page
When the user enters <searchInput> in the search box
Then the <searchInput> page should open correctly

Examples:
|searchInput|
|Apple|
|Dog|
|Cat|
