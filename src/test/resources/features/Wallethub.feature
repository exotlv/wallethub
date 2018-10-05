@all
Feature: Wallethub Review test

  Background:
    Given open WalletHub webpage

    Scenario: WalletHub login with user and Review Test insurance company
      Then Wallet Login - is displayed
      And Login - wallet user logs in
      Then open WalletHub insurance webpage
      And check rating hover on page for number 5
      And choose Health from Policy dropdown
      Then add random text with min 200 characters
      And then open Reviews page in profile and check entered text
