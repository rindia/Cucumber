Feature: PLMS - Plant Master Features

  Scenario: Verify Plant Master is working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Plant Master Link
    Then I Click On Add Plant Button
    And I Enter PlantName
      | PlantName     |
      | helloPlant |
    And I Enter Plant Code
      | PlantCode |
      | 0007      |
    And I Select Unit Type
      | UnitType |
      | MT       |
    And  I Select Active
      | ActiveOption |
      | plActive     |
    Then I click Submit Button
    Then I See Data in Html Table
      | validationData|
      |helloPlant|


  Scenario: Verify Update Plant Master is working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Plant Master Link
    Then I click on This Edit Button
      | Plantname |
      | helloPlant   |
    Then I Enter New Plant code
      | PlantCode |
      | 12345     |
    And  I click on Submit Button

  Scenario: Verify Delete Plant Master is working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Plant Master Link
    Then  I Click This Delete Button
      | Plantname |
      | helloPlant|
    And I Click On Yes Button

