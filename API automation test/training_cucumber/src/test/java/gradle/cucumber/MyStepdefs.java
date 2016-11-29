package gradle.cucumber;

import common.Custom_assert;
import common.Custom_response;
import common.Helper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.client.RequestFactory;
import junit.framework.Assert;

import java.util.Iterator;
import java.util.Map;

import static common.My_values.JsonValues;

/**
 * Created by Eynar on 05/10/2016.
 */
public class MyStepdefs {

    private Custom_response response=new Custom_response();
    private Helper help= new Helper();
    @Given("^I have a connection with Todo.Ly$")
    public void I_have_a_connection_with_Todo_Ly() throws Throwable {

    }

    @When("^I send a (POST) request to (.*) end point with the json$")
    public void I_send_a_POST_request_to_projects_json_end_point_with_the_json(String requestType,String endPoint, String jsonBody) throws Throwable {
        response = new RequestFactory().makeRequest(requestType).send(endPoint,jsonBody);
    }

    @Then("^the response code should be (\\d+)$")
    public void the_response_code_should_be(int code) throws Throwable {
        Assert.assertEquals("###Failed  the response code is not correct",code,response.code_status);
    }

    @And("^the response json should be$")
    public void the_response_json_should_be(String responsebody) throws Throwable {
        Custom_assert.areEqual(responsebody,response.json_body);
    }

    /**
     *
     * @param methodRequest
     * @param endPoint
     * @param id
     * @throws Throwable
     */
    @When("^I send a (DELETE|GET) request to (.*)/(.*)$")
    public void I_send_a_delete_get_request_to_end_point(String methodRequest, String endPoint,String id) throws Throwable {
        endPoint=builderWithVariables(endPoint+"/"+id+".json");
        System.out.println("EndPoint: "+endPoint);
        response = new RequestFactory().makeRequest(methodRequest).send(endPoint,"");
    }

    @And("^I am using the user : (.*) and password : (.*)$")
    public void I_am_using_the_user_root_and_password_p_ssword(String user, String password ) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I get the (.*) property in (.*) variable from last json response$")
    public void I_get_the_id_property_in_id_project_variable_from_last_json_response(String jsonProperty, String keyValue) throws Throwable {

        JsonValues.put(keyValue,help.getJsonValue(help.parserJSON(response.json_body),jsonProperty));
        System.out.println("value :"+JsonValues.get(keyValue)+" on key :"+keyValue);

    }

    /**
     *
     * @param value
     * @return
     */
    private String builderWithVariables(String value)
    {
        for (String key : JsonValues.keySet())
            value=value.replace(key,JsonValues.get(key));
       return value;
    }

}
