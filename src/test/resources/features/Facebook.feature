@all
Feature: Facebook Page Testing

  Background:
    Given open Facebook webpage

  Scenario: Open Facebook page, login with credentials and post a status message
    When page is loaded - check navigation menu
    And Login - default user logs in
    And click on status field and enter "Hello World"
