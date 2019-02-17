@Login
Feature: Login

  @LoginWithValidData
  Scenario: User logs into website

    Given user accesses the site
    And clicks to make login
    Then inform login and password
    And click to continue
    Then validates if login was made

    @LoginWithInvalidData
    Scenario: User tries to login with invalid data

      Given user opens the site
      And click on login button
      Then inform a valid login
      But a wrong password
      Then click continue
      And validate unsuccessful login