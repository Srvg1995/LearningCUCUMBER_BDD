Feature: Login

@Smoke @Regression
Scenario:
Validate user is able to login using valid credentials


Given browser is open and URL is navigated
And Login page is displayed
When user enters valid username and password
And user clicks on login button
Then User should be successfully logged in
And browser should close

