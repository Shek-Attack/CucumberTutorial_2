@vehicle
  Feature: Create vehicle
    Agile story: as a user, I want to be able to create vehicle

    Scenario: create vehicle
      Given users is on the landing page
      When user logs in with "storemanager85" and "UserUser123" credentials
      Then user navigates to "Fleet" and "Vehicles"
      And user clicks on create car button
      Then user enters vehicle information:

        | License Plate | Driver | Location   | Model Year | Color |
        | Shek123       | SDET   | Toronot    | 2020       | Black |
        | Java_is_  fun | User   | Mclean, VA | 2019       | Red   |



