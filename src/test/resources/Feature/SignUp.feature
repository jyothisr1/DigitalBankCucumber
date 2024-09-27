Feature:Validate the signup page
  Scenario:verify user can signup and login
    Given user open the website
    Then verify user is on login page
    When user click on signup link
    Then verify user is on signup page
    When user enters all the required details
    And user click on signup button
    Then verify user is on login page
    When user enters username "username.name1" and password "password.password2"
    And user click on login button
    Then verify user is on home page