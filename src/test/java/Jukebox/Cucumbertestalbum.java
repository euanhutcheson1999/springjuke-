package Jukebox;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;


 class IsItRumours{
    static String isitRumours(String expectedAnswer){
     return "rumours".equals(expectedAnswer) ?  "yes": "no";
    }

}

public class Cucumbertestalbum {

    private String expectedAnswer ;
    private String actualAnswer;

    @Given("I have selected rumours in console")
    public String i_have_selected_rumours_in_console(){
        expectedAnswer = "rumours";
        throw new io.cucumber.java.PendingException();}



    @Given("I have not selected rumours in console")
    public void i_have_not_selected_rumours_in_console(){
        expectedAnswer = "Kanye West";
        throw new io.cucumber.java.PendingException();}



    @When ("I have selected an input in the console")
    public void  i_have_selected_an_input_in_the_console(){
        actualAnswer= IsItRumours.isitRumours(expectedAnswer);
        throw new io.cucumber.java.PendingException();

    }

    @Then("Then I should be told {string}")
    public void then_i_should_be_told(String expectedAnswer){
        assertEquals(expectedAnswer, actualAnswer);
        throw new io.cucumber.java.PendingException();
    }














}
