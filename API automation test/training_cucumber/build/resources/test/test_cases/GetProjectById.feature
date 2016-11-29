Feature: Get Project with GET request

  @Regression @Acceptance @test1
  Scenario: As client, I can send a GET request to see the project properties.

    Given I have a connection with Todo.Ly
    When I send a GET request to projects/3620461
    Then the response code should be 200
    And the response json should be
    """
    {
    "Id": 3620461,
    "Content": "String",
    "ItemsCount": 0,
    "Icon": 4,
    "ItemType": 2,
    "ParentId": null,
    "Collapsed": false,
    "ItemOrder": 68,
    "Children": [0],
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


