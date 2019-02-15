@Login
Feature: Login

  @Logar
  Scenario: User logs into website

    Given user accesses the site
    And clicks to make login
    Then inform login and password
    And click to continue
    Then validates if login was made