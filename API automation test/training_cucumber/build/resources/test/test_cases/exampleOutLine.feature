Feature: Create Project with POST request

  @Regression @Acceptance
  Scenario Outline: As client, I can send a POST request to create a project.

    Given I have a connection with Todo.Ly
    When I send a POST request to projects.json end point with the json
    """
   {
          "Content": "<name>",
          "Icon": 4
   }
    """
    Then the response code should be 200
    And the response json should be
    """
    {
      "Id": IGNORE,
      "Content": "<name>",
      "ItemsCount": 0,
      "Icon": 4,
      "ItemType": 2,
      "ParentId": null,
      "Collapsed": false,
      "ItemOrder": IGNORE,
      "Children": [],
      "IsProjectShared": false,
      "ProjectShareOwnerName": null,
      "ProjectShareOwnerEmail": null,
      "IsShareApproved": false,
      "IsOwnProject": true,
      "LastSyncedDateTime": IGNORE,
      "LastUpdatedDate": IGNORE,
      "Deleted": false,
      "SyncClientCreationId": null
    }
    """
  Examples:
    |name   |
    |String |
    |123456 |
    |test123|
    |123test|
