package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){ // Scenario prints out the name of scenario from feature
        System.out.println("Scenario name: " + scenario.getName());
        System.out.println("Empty hook before");
    }

    @Before("@Scenario_1")
    public void SpecialSetUp(){
        System.out.println("Special hook before\n");
    }

    @After("Scenario_1")
    public void SpecialTearDown(){
        System.out.println("Special Empty hook after\n");
    }

    @After
    public void tearDown(){

        System.out.println("Empty hook after\n");
    }
}
