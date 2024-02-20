Feature: Use Shopping Cart

  Scenario: Buy product at SwagLabs
    Given that user signed-in demo app
    When he buys the product "Sauce Labs Backpack"
    Then He should see the message "Checkout Complete"