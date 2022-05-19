Feature: Search functionality

  @sanity @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    And I navigate to new and used car search page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make          | model             | location            | price    |
      | Land Rover    | Range Rover Sport | QLD - Brisbane      | $100,000 |
      | Kia           | Picanto           | NSW - Sydney        | $90,000  |
      | Mercedes-Benz | A-Class           | NSW - All           | $150,000 |
      | Ford          | Focus             | NSW - New England   | $70,000  |
      | Hyundai       | Elantra           | NT - North          | $80,000  |
      | Honda         | City              | NSW - Central Coast | $90,000  |


  @smoke @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    And I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make          | model     | location          | price    |
      | Jeep          | Compass   | NSW - New England | $80,000  |
      | BMW           | Any Model | NSW - All         | $100,000 |
      | Volkswagen    | Tiguan    | ACT - All         | $50,000  |
      | Mercedes-Benz | A-Class   | NSW - All         | $100,000 |
      | Toyota        | 4runner   | QLD - All         | $70,000  |
      | Kia           | Any Model | ACT - All         | $100,000 |