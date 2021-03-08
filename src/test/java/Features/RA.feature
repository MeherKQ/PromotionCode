Feature: To validate certain assertions

  @TC1
  Scenario: To validate that HTTP Response Code is 200 upon GET Request
    Given test RestAPIUrl
    When user calls "RestAPI" with "GET" http request
    Then API call got success with status code 200
    Then "promotionId" in response body is "Cook with Aline"
    Then "orderId" in response body is "19"
    Then "promoArea" in response body is "home:main"
    Then "showPrice" in response body is "false"
    Then "showText" in response body is "false"
