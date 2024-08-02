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



#AFTER RUN THIS FEATURE FILE AS CUCUMBER FEATURE,THEN WE WILL GET 'GLUE CODE' THAT NEEDS TO BE COPY&PASTE INSIDE FEATURE FILE
