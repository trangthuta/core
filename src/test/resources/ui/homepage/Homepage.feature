Feature: Test login
  Scenario: Test login succesfully
    Given  I went to C-ticket Login page
    When  I entered a valid email
    And I entered a valid password
    And I clicked login button
    Then I logined sucessfully