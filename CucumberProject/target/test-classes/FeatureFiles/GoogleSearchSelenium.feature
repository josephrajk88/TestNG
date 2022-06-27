@GoogleSearchSelenium

Feature: Google Search Testing

Background:
Given Print the date and time
Given The user launches the url "https://www.google.com/"

@smoke
Scenario: Google Search Words Link- Selenium

When The user search the "Selenium"
And The user check the numbers of links
And The user click the last link
Then The user verifies the homepage title "Selenium with Python — Selenium Python Bindings 2 documentation"

Scenario: Google Search Words Link- Python

When The user search the "Python"
And The user check the numbers of links
And The user click the last link
Then The user verifies the homepage title "Study Resources"
#Learn Python - Free Interactive Python Tutorial"

@regression
Scenario: Google Search Words Link- Cypress

When The user search the "Cypress"
And The user check the numbers of links
And The user click the last link
Then The user verifies the homepage title "Introduction to Cypress"

#@sanity
#Scenario: Google Search Words Link- Javascript
#
#When The user search the "Javascript"
#And The user check the numbers of links
#And The user click the last link
#Then The user verifies the homepage title "Learn JavaScript | Codecademy"

