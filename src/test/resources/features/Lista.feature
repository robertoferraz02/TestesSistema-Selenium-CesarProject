@Lista
Feature: Wishlist


  @Cria_Lista
  Scenario: user creates wishlist

    Given user searches for any item
    Then select desired item on the search list
    And add the item on the wishlist
    And login on the website
    Then validates if login was successful

  @Valida_Lista
  Scenario: user validate wishlist

    Given user clicks on whishlist
    Then makes login
    And validates if the item appears on the wishlist

  @Remove_Lista
  Scenario: User removes itens for the wishlist

    Given user clicks on wishlist button in the menu
    Then login on website
    And click on remove item in the wishlist
    Then validates if the action was well succeed