Feature: Manejo de elementos Web

  Scenario: interact with a textbox element
    Given Open the URL "https://demoqa.com/"
    And Select the "Elements" section in the Website
    And Verify the "Text Box" element is present
    When Enter the text "Full Name"
    Then Check the text is visible



