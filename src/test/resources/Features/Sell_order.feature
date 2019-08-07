Feature: Hive sell order

  Scenario: Initiate a successful sell order
    Given user is in hive homepage
    When user initiate a Sell order
    Then Successful confirmation message should be displayed

