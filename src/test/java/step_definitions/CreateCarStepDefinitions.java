package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    @Given("users is on the landing page")
    public void users_is_on_the_landing_page() {
        System.out.println("User is on landing page\n");


    }
    @When("user logs in with {string} and {string} credentials")
    public void user_logs_in_with_and_credentials(String string, String string2) {
        System.out.printf("User logs in as " + "storemanager85, " +"and with password " + " UserUser123\n" );

    }
    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.printf("user navitages to %s model and %s tab\n", string, string2);
    }

    @Then("user clicks on create car button")
    public void user_clicks_on_create_car_button() {
        System.out.println("User click on create car button");

    }
    @Then("user enters vehicle information:")
    public void user_enters_vehicle_information(List<Map<String,String>> dataTable) {

      //  dataTable.forEach(p->System.out.println(p));  // lambda expression
        System.out.println("License Plate: " + dataTable.get(0).get("License Plate"));
        System.out.println("Driver: " + dataTable.get(0).get("Driver"));
        System.out.println("Location: " + dataTable.get(0).get("Location"));
        System.out.println("Model Year: " + dataTable.get(0).get("Model Year"));

      //  dataTable.forEach(p->System.out.println(p));

    }
}
