$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Shopping.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is to purchase dress from a shopping website",
  "description": "",
  "id": "this-feature-is-to-purchase-dress-from-a-shopping-website",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FeatureDefinition_Background.i_have_opened_the_browser()"
});
formatter.result({
  "duration": 4835067300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Buy 2 dresses and pay for it",
  "description": "",
  "id": "this-feature-is-to-purchase-dress-from-a-shopping-website;buy-2-dresses-and-pay-for-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Launch the test application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Navigate to the \"DRESSES\" menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select \"Summer dresses\" dress",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "customer adds 2 dress to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "customer sign in with email and password to the website",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on Proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Complete the terms and conditions on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select \"PAY BY BANK WIRE\" for payment",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Complete the purchase order",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify the order confirmation",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FeatureDefinition_BrowsingPage.launch_the_test_application()"
});
formatter.result({
  "duration": 13838990900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DRESSES",
      "offset": 17
    }
  ],
  "location": "FeatureDefinition_BrowsingPage.navigate_to_the_menu(String)"
});
formatter.result({
  "duration": 6214130200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Summer dresses",
      "offset": 8
    }
  ],
  "location": "FeatureDefinition_BrowsingPage.select_dress(String)"
});
formatter.result({
  "duration": 9741331200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "FeatureDefinition_BrowsingPage.customer_adds_dress_to_the_cart(int)"
});
formatter.result({
  "duration": 41757543600,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_SignInToCheckoutPage.customer_sign_in_with_email_and_password_to_the_website()"
});
formatter.result({
  "duration": 8336575500,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_SignInToCheckoutPage.click_on_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 6819439000,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_SignInToCheckoutPage.complete_the_terms_and_conditions_on_Shipping_page()"
});
formatter.result({
  "duration": 12355514100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PAY BY BANK WIRE",
      "offset": 8
    }
  ],
  "location": "FeatureDefinition_SignInToCheckoutPage.select_for_payment(String)"
});
formatter.result({
  "duration": 6648589200,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_SignInToCheckoutPage.complete_the_purchase_order()"
});
formatter.result({
  "duration": 8974524800,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_SignInToCheckoutPage.verify_the_order_confirmation()"
});
formatter.result({
  "duration": 5360101800,
  "status": "passed"
});
formatter.match({
  "location": "FeatureDefinition_Background.close_the_browser()"
});
formatter.result({
  "duration": 184539400,
  "status": "passed"
});
});