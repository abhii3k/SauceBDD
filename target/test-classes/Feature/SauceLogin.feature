Feature: Valiadte SauceDemo website

Background: initial step
Given user is on login page

Scenario Outline: check login with valid credentials
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
And close browser

Examples: 
|username|password|
|standard_user|secret_sauce|


Scenario Outline: check login with invalid credentials
When user enter  "<user>" and "<pass>" 
Then click on login 
And Not Landed to home page
And close browser

Examples: 
|user|pass|
|Wronguser|Wrongpass|


Scenario Outline: Add two product
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
Then Add two product to cart 
And verify the product by checking remove button
And close browser

Examples: 
|username|password|
|standard_user|secret_sauce|


Scenario Outline: check cart and checkout
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
Then Add two product to cart 
And verify the product by checking remove button
Then click on cart button will redirect to cart page
And Remove second product
Then click on Checkout button
And close browser

Examples: 
|username|password|
|standard_user|secret_sauce|

Scenario Outline: check checkout form and checkout complete
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
Then Add two product to cart 
And verify the product by checking remove button
Then click on cart button will redirect to cart page
And Remove second product
Then click on Checkout button
And Enter details of form and click continue
Then Verify details and click on finish
And close browser

Examples: 
|username|password|
|standard_user|secret_sauce|

Scenario Outline: check Thank you msg and Back Home
When user enter  "<username>" and "<password>" 
Then click on login 
And Landed to home page
Then Add two product to cart 
And verify the product by checking remove button
Then click on cart button will redirect to cart page
And Remove second product
Then click on Checkout button
And Enter details of form and click continue
Then Verify details and click on finish
And Verify text and button
And close browser

Examples: 
|username|password|
|standard_user|secret_sauce|
