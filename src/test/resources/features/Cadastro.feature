@Registration
Feature: Registration on the saraiva.com website

  @StepOneRegistration
  Scenario: User tries to register on website and doesn't check captcha

    Given user access website
    Then  clicks on register button
    Then clck on register in the second page
    And inform data
    And check option to not receive newsletter
    But do not click on capctha validation
    And ends registration process
    Then validates the registration wasn't well succeeded