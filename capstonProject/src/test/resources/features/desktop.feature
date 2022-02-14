@desktops @endtoend
Feature: Desktops

  Scenario: User verify all items are present in Desktops tab
    Given User is on Retail website
    When User click on Desktops tab
    And User click on show all desktops
    Then User should see all items are present in Desktop page

  Scenario: User add HP LP 3065  from Desktops tab to the cart
    Given User is on Retail website
    When User click on Desktops tab
    And User click on show all desktops
    And User click  ADD TO CART option on "HP LP3065" item
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message for HP "Success: you have added HP LP 3065 to your Shopping cart!"

  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    Given User is on Retail website
    When User click on Desktops tab
    And User click on show all desktops
    And User click On ADD TO CART option on "Canon EOS 5D" item
    And User select color from dropdown "Red"
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message for Canon "Success: You have added Canon EOS 5D to your shopping cart!"

  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    Given User is on Retail website
    When User click on Desktops tab
    And User click on show all desktops
    And User click on "Canon EOS 5D" item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | review                                                       | rating      |
      | Maryam   | The quality of the camera is excellent and also the picture. | Bad or good |
    And User click on Continue button
    Then User should see a success message for filling out review "Thank you for your review."
