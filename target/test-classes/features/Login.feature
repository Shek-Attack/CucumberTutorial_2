#Login
  Feature: Login
    Agile story: As a user, I should be able to login with username and password

    Background: go to login page
      Given user is on the login page
      Then user should be able to see Dashboad page title

    @Scenario_1
 Scenario: Login as a store manager
   When user logs in as store mamanger

      @Scenaio_2
 Scenario: Login as a sales manager
  When user logs in as sales mamanger

    @Scenario_3
   Scenario: Login as a driver
     When user logs in as driver

      @Scenario_outline
      Scenario Outline: Login under different credentials as <username>
        When user enters "<username>" and "<password>"
        Then user should be able to see Dashboad page title

        Examples:
        | username| password |
        |user10          | UserUser123        |
        | user15         | UserUser123          |
        |   user22       |  UserUser123         |
        |   user110       |  UserUser123         |
        |    storemanager85      |  UserUser123         |
        |   storemanager120       |  UserUser123         |
        |  storemanager110-        | UserUser123          |

