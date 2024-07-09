Feature: Register

Scenario: User should be able to register using valid credentials

Given Browser is open
And url is navigated to register page
When user enters valid credentials
And clicks on register button
Then a new account should be created
And browser must be  closed


