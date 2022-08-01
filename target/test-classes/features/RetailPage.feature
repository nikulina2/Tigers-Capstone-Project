@completeTest
@testAllRetail
Feature: Retail Page

 # done
Background:  
    Given User is on Retail website
    When User click on MyAccount
    And User click on Login
    And User enter username 'johnjohnson1@gmail.com' and password 'Password1'
    And User click on Login button
    Then User should be logged into MyAccount dashboard
 
 # 1 done

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on 'Register for an Affiliate Account' link1 
And User fill affiliate form with below information
|company    |website    |taxID    |paymentMethod|
|New Company|newWebSite |E12459856|Cheque       |
And User check on About us check box 
And User click on Continue button 
Then User should see a success message1 'Success: Your account has been successfully updated.' 

 # 2 done
@testRetail
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on 'Edit your affiliate information' link2
And User click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|new bank|n132433  |  b235442|new account|d1234        |
And User click on Continue button 
Then User should see this message3 'Success: Your account has been successfully updated.'

# 3

Scenario: Edit your account Information 
When User click on 'Edit your account information' link3 
And User modify below information 
|firstname|lastName|email|telephone|
|Johnson|John|johnjohnson2@gmail.com|Password2|
And User click on Continue button 
Then User should see this message3 'Success: Your account has been successfully updated.'


