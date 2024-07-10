Feature: Register

@Smoke @Regression
Scenario: User should be able to register using valid credentials

Given Open the Browser  
And url is navigated to register page

When user enters valid credentials
#Below 2 rows data is only applicable to this particular step(When),not for the entire scenario(ie,not like 'Examples').
| M  | Test | manualtest    |qs_manualtest@gmail.com  | Password@123|
| M  | Test | manualtest12  |qs_manualtest12@gmail.com| Password@123|

And clicks on register button
Then a new account should be created
And browser must be  closed


