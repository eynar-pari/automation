Feature: Delete Project with DELETE request

  @Regression @Acceptance @test
  Scenario: As client, I can send a DELTE request to create a project.

    Given I have a connection with Todo.Ly
    When I send a DELETE request to projects/3620431
    Then the response code should be 200


