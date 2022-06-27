@Flipkart
Feature:Flipkart Functionality Check

Scenario:  Login into Flipkart

Given the user launch the browser & enter the url "chrome" "https://www.flipkart.com/"
When the user click login button
And the user enter the email or mobile number "9843080258"
And the user enter the password  "Josephraj.k1"
Then the user verifies the title in the home page "Flipkart"

Scenario:  Add product in cart

Given the user launch the browser & enter the url "chrome" "https://www.flipkart.com/"
When the user enter the product as "mobiles" and click enter
And the user select any one mobile from the listed products  "POCO C31"
And the user enter the pincode 600048 and clicks verify button 
Then the user verifies the product added into the crd or not