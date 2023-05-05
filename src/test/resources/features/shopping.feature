
Feature: Shopping Products Functionality for nopcommerce E-commerce Website


  Background:
    Given I am on the nopcommerce login page
    Given I have entered a valid username and password
    When I click on the login button


    Scenario Outline: Verify the prodct select functionality
      Given I am click on computer tab
      When I am click on Desktop
      And I am select "<productselect>"
      Examples:
        | productselect                       |
        | Lenovo IdeaCentre 600 All-in-One PC |
