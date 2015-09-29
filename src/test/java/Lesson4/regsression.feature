Feature: Working with posts page
  Scenario: Create simple post
    Given opening new post page
    When specifying post title
    And specifying post body
    And clicking publish button
    Then Post should be created