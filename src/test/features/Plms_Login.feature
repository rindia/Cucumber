Feature:  PLMS - Login Features

  Scenario: Verify PLMS Login is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
    |UserName|Password|
    |jkCement        |  admin      |
    And I Click On Login Button
    Then I see UserName on HomePage








