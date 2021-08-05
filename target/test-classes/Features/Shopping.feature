Feature: This feature is to purchase dress from a shopping website

Background: 
Given I have opened the browser

Scenario: Buy 2 dresses and pay for it

Given Launch the test application
And Navigate to the "DRESSES" menu
Then select "Summer dresses" dress
When customer adds 2 dress to the cart
And customer sign in with email and password to the website
Then click on Proceed to checkout button
Then Complete the terms and conditions on Shipping page
Then Select "PAY BY BANK WIRE" for payment 
Then Complete the purchase order
Then Verify the order confirmation
Then Close the browser
