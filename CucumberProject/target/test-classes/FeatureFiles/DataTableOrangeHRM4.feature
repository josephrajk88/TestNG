@DataTableOrangeHRM5
Feature: OrangeHRM Login Check

Scenario: Login to the OrangeHRM


Given I launch the browser & url. "chrome" "https://opensource-demo.orangehrmlive.com/"
When I enter the username and Passwords.
|username|pwd|
|Admin|admin123|
|Admin1|admin1231|
|Admin2|admin1232|
|Admin3|admin1233|
|Admin4|admin1234|

And I click the Login button.
#Then I verify the Title of home page. "OrangeHRM"
Then I verify the Title of home page and url.
|Title|OrangeHRM|
|url|https://opensource-demo.orangehrmlive.com/index.php/dashboard|
And I should verify the sections.
|Assign Leave|
|Leave List|
|Timesheets|
|Apply Leave|
|My Leave|
|My Timesheet|
