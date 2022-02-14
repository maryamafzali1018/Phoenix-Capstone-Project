@retailPage @endtoend
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on "Register for an Affiliate Account" link
    And User fill affiliate form with below information
      | company | website        | taxID | paymentMethod | ChequePayeeName |
      | amazon  | www.amazon.com | 12345 | Cheque        | Ahmad           |
    And User check on About us check box
    And User click On the Continue  button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click On "Edit your affiliate information" link1
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber     | swiftCode | accountName | accountNumber  |
      | APR      | 1222334455676 |      1234 | AhmadKhan   | 28737345489535 |
    And User Click on Continue button1
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on "Edit your account information" link2
    And User modify below information
      | firstName | lastName | email                  | telephone |
      | majsrtvcd    | manasrvcd  | majilatcdlstnvre03@gmail.com | 9043569163 |
    And User Click on Continue button2
    Then User should see a success message
