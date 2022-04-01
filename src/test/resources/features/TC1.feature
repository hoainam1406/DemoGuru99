Feature: PaymentGetway
  I want to check price

  @TC1
  Scenario Outline: The user can buy product
    Given Open home page
    When The user choose quantity product and click By Now
    Then The payment amount "<amount>" is shown
    Examples:
    |amount|
    |$180.00|


