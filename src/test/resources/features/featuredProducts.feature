
Feature: Featured Products Functionality for nopcommerce E-commerce Website


  Background:
    Given I am on the NoPommerce Page



  Scenario Outline: Verify the Featured Products section has 4 items
    Given I am on a Featured product section details
    When I can see the first product "<productone>" item
    Then I can see the second product "<producttwo>" item
    And I can see the third product "<productthird>" item


 Examples:
   | productone              | producttwo                |productthird  |
   | Build your own computer | Apple MacBook Pro 13-inch |  HTC One M8 Android L 5.0 Lollipop|