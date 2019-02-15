@Purchase
Feature: Buying Process

  @Add_To_Cart
  Scenario: User adds item to cart

    Given user searches for an item on the search bar
    Then select the desired item
    Then inform zip code to calc freight tax
    And click on buy to add product to the cart
    Then validate if item was added to the cart

  @Remove_From_Cart
  Scenario: User removes from the cart

    Given user added an item to the cart
    And removes one item from it
    Then validates the removal

  @Checkout
  Scenario: User makes checkout process

    When user has added an item into cart
    Then click on continue button
    Given login is made
    Then chooses to pick product on the store
    And choose state
    And choose selected store
    Then proceed process clicking to continue
    Then inform checkout data
    But chooses to not save data for the next purchase
    And clicks to close order
    Then validates if the order was not completed
