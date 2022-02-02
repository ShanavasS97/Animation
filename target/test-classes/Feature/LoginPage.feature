Feature: verifying adactin details

  Scenario: verifying adactin login with valid credentials
    Given user on the adactin page
    When user should login username and password
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
      
    When user click login buuton
    Then user verify success msg
