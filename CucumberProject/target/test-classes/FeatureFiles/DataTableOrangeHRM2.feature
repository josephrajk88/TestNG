@DataTableOrangeHRM2
Feature: OrangeHRM Login Check


Scenario: Login to the OrangeHRM


Given I launch the browser & url "chrome" "https://opensource-demo.orangehrmlive.com/"
When I enter the username and Password
|Admin|admin123|
And I click the Login button
Then I verify the Title of home page "OrangeHRM"
And I should verify the sections
|Assign Leave|
|Leave List|
|Timesheets|
|Apply Leave|
|My Leave|
|My Timesheet|
