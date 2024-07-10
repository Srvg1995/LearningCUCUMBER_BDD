Feature: Search


@Regression @Search
Scenario Outline: Validate when user enters text in search text field then the search result must be displayed

Given Welcome page is displayed
When  user enters "<Search text>" in serach text field
Then Search results must be displayed

Examples:
         | Search text |
         | Computer    |
         | Books       |
         | Electronics |
         | 10          |


