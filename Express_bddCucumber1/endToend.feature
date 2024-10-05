
Feature: validate end to end scenario
  

 
  Scenario: as a user buy a shirt
    Given open browser
    
    |chrome|
    |firefox|
    |safari|
    And go to express.com
    When User Hoverover on man menu
    And Click on new arrival submenu
    And Click on any men shirt
    And User select any color and size
  |Color|Size|
  |black|s|
  |Green|m|
  |white|L|
  
   And click on add to cart
   And user can see checkout page
   Then user should see the checkout page
 