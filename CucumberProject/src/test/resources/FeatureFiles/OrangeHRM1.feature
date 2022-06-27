@OrangeHRM1
Feature: OrangeHRM Login Check


Scenario Outline:
: Login to the OrangeHRM


Given I launch the browser & url "chrome" "https://opensource-demo.orangehrmlive.com/"
When I enter the username "<username>" and Password "<password>"
And I click the Login button
Then I verify the Title of home page "OrangeHRM"

Examples:
|username|password|
|Admin|admin123|
|Joseph|admin456|
|Sandra|admin123|
|Danish|admin789|