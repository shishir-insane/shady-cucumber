Feature: Check on application health status
	The `/api/health` end point returns a status message to indicate that the application is running successfully.
	Scenario: Application health end-point
    Given the application is running
    When I check the application status
    Then the API should return "Serenity REST Starter project up and running"