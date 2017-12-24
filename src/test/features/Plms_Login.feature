Feature:  PLMS - Login Features

  Scenario Outline: Verify PLMS Login is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    When I enter Username as "<username>" and Password as "<password>"
    And I Click On Login Button
    Then I see UserName on HomePage
    Examples:
      | username  | password  |
      | JkCement | admin    |









