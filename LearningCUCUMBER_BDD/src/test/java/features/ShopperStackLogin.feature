Feature: ShopperStackLogin

@Smoke @Regression
Scenario: Validate shopper can login using valid credentials

Given Bbrowser is open and URL is navigated
And Login page will be displayed
And Shopper Login is displayed
When User enters "qa_testmerchantdell@gmail.com" and "Password@123"
And Clicks on login button
Then Shopper should be successfully logged in
And Browser must be close


@Smoke @Regression
Scenario: Validate Merchant can login using valid credentials

Given Brrowser is open and URL is navigated
And Login page will be displayed
And Merchant Login is displayed
When User enters "qa_merchantlogin@gmail.com" and "Password@123"
And Clicks on login button
Then Merchant should be successfully logged in
And Broowser must be close


@Regression
Scenario: Validate Admin can login using valid credentials

Given Browser is open and URL is navigated
And Login page will be displayed
And Admin Login is displayed
When User enters "qa_testadmindell@gmail.com" and "Password@123"
And Clicks on login button
Then Admin must be successfull logged in
And Browwser must be close

