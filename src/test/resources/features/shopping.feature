
Feature: Shopping Products Functionality for nopcommerce E-commerce Website


  Background:
    Given I am on the nopcommerce login page
    Given I have entered a valid username and password
    When I click on the login button


    Scenario Outline: Verify the prodct select functionality
      Given I am click on computer tab
      When I am click on Desktop
      And I am select "<productselect>"
      Then I can see the product is selected
      Examples:
        | productselect                       |
        | Lenovo IdeaCentre 600 All-in-One PC |


    Scenario: Verify Shopping Cart
      Given I am click on computer tab
      When I am click on Desktop
      And I click on add to cart button
      And I click on Shopping cart
      Then I can see the product added to the shopping cart


      Scenario: Verify the Checkout as guest and Enter the Billing Address
        Given I am click on computer tab
        When I am click on Desktop
        And I click on add to cart button
        And I click on Shopping cart
        And I click on i agree with the terms check box
        And I click on CheckOut button
        Then I click on Checkout as Guest button
        And I can see Billing Address
        And I enter the first name and last name
        And I enter the email add
        And I enter the company name











