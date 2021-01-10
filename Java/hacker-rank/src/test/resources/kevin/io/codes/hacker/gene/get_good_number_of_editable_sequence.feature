Feature: Gene Modification

  To be able to get the number of character to change to have a steady gene

  Rule: Should be able to determine the right number of character to change to get the steady gene
    Scenario: When we get a specific Bear gene
      Given The doctor receive a bear "ACTGAAAG" gene
      When  performs an ajustement to fix it to steady
      Then  get the minimal sub-string to change is 2

    Scenario: When we get a specific Steady gene
      Given The doctor receive a bear "ACTGCTAG" gene
      When  performs an ajustement to fix it to steady
      Then  get 0 as the minimal sub-substring to change