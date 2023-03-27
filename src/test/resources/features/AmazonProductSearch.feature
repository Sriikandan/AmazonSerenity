# Created by rsrii at 24/03/2023
Feature: Amazon Product Search
  As a user , I would like to search the product in Amazon
  And Filter it on the search with available criteria
  And list it by price low to high

  Rule:
  1. Products are sorted by price
  2. Only Filtered products are listed

  Scenario: Verify Amazon product search with Filter for Sony
    Given I open the Amazon to buy a product
    And I enter the product to be searched as "Sony TV"
    And I click on the search
    And I apply search filter by "Brand" with criteria as "Sony"
    And I apply search filter by "Resolution" with criteria as "4K"
    And I apply search filter by "Model Year" with criteria as "2022"
    And I will apply sort by "Price: Low to High"

    Scenario: Verify Amazon product search with Filter for Samsung
      Given I open the Amazon to buy a product
      And I enter the product to be searched as "Samsung TV"
      And I click on the search
      And I apply search filter by "Brand" with criteria as "Samsung"
      And I apply search filter by "Resolution" with criteria as "4K"
      And I apply search filter by "Model Year" with criteria as "2022"
      And I will apply sort by "Price: Low to High"


    Scenario: Verify Amazon product search with Filter for iPhone
      Given I open the Amazon to buy a product
      And I enter the product to be searched as "Phone"
      And I click on the search
      And I apply search filter by "Brand" with criteria as "Apple"
      And I apply search filter by "Screen Size" with criteria as "5.5 in & above"
      And I apply search filter by "Model Year" with criteria as "2022"
      And I will apply sort by "Price: Low to High"
