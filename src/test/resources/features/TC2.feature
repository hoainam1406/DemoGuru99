Feature: Payment
  I want to pay for product


    @TC2
    Scenario Outline: The user can buy product
    Given Open home page
    When The user choose quantity product and click By Now
    When The user fill information of credit card except Card Number field
    Then The message "<message>" is shown
    Examples:
    | message |
    | Check card number is 16 digits! |