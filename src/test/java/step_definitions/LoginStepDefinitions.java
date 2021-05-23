package step_definitions;

import io.cucumber.java.en.*;


public class LoginStepDefinitions {
// store manager
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the Login page");

    }

    @When("user logs in as store mamanger")
    public void user_logs_in_as_store_mamanger() {
        System.out.println("Trying to login as store manager");

    }

    @Then("user should be able to see Dashboad page title")
    public void user_should_be_able_to_see_dashboad_page_title() {
        System.out.println("I see that page title is a Dashboard");

    }

// sales manager

    @When("user logs in as sales mamanger")
    public void user_logs_in_as_sales_mamanger() {
        System.out.println("User logs in as a sales manager");
    }

// driver

    @When("user logs in as driver")
    public void user_logs_in_as_driver() {
        System.out.println("User/driver logs in");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) { // userName and PassWord
        System.out.printf("Enter username %s, and password %s to login\n", username, password);

    }

}