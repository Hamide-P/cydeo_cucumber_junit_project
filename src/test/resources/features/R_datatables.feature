@vytrackdatatable

Feature: Examples for DataTable


  Scenario: Menu Options for driver
    Given user is on the login page
    When user enters the "driver" information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options for salesmanager
    Given user is on the login page
    When user enters the "sales manager" information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: Menu Options for storemanager
    Given user is on the login page
    When user enters the "store manager" information
    Then user should be able to see following modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

@wip

  Scenario: Login with given information
    Given user is on the login page
    When user enters below credentials
      | username | user10      |
      | password | UserUser123 |
    Then user should be able to see following information
      | firstname | John |
      | lastname  | Doe  |