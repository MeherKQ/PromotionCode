package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



import static org.junit.Assert.*;

import java.io.IOException;

import resources.APIresources;
import resources.Utilities;
import resources.testdata;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



import static io.restassured.RestAssured.*;


public class stepDefinitions extends Utilities {


	testdata data = new testdata();	

	ResponseSpecification respspec;
	RequestSpecification res;

	Response resp;
	public class stepdefinition {

		@Given("test RestAPIUrl")
		public void test_RestAPIUrl() throws IOException{

res = given().spec(requestspecification()).body(data.RestAPI());
throw new io.cucumber.java.PendingException();

}



		@When("user calls {string} with {string} http request")
		public void user_calls_with_http_request(String resource, String method) {
			APIresources resourceapi = APIresources.valueOf(resource);
			System.out.println(resourceapi.getResource());

			respspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			if(method.equalsIgnoreCase("POST"))
				resp = res.when().post(resourceapi.getResource());
			else if(method.equalsIgnoreCase("GET"))
				resp = res.when().get(resourceapi.getResource());

		}


		@Then("API call got success with status code {int}")
		public void api_call_got_success_with_status_code(Integer int1) {
			assertEquals(resp.getStatusCode(),200);
			System.out.println(resp.getStatusCode());


		}

		@Then("{string} in response body is {string}")
		public void in_response_body_is(String keyValue, String ExpectedValue) {

			assertEquals(getJsonPath(resp, keyValue),ExpectedValue);


		}

	}
}


