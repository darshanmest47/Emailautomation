package stepdefs;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import configurations.Configreader;
import factory.Driverfactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Emailpage;
import pages.Outlookpage;
import pages.Passwordpage;
import pages.Signin;
import utilities.ActionsClass;

public class Emaildefs {
	
	
	Emailpage ep;
	ActionsClass acts;
	HashMap<String, String> hs;
	Properties props;
	Outlookpage hp;
	Passwordpage ps;
	Signin sp;

    WebDriverWait wt;
	
	@Before
	public void instantiate() throws IOException  {
		sp= new Signin(Driverfactory.returnDriver());
		ep = new Emailpage(Driverfactory.returnDriver());
		acts = new ActionsClass(Driverfactory.returnDriver());
		hp = new Outlookpage(Driverfactory.returnDriver());
		ps = new Passwordpage(Driverfactory.returnDriver());
		hs= new HashMap<String,String>();
		props = Configreader.readConfig();
	

		
	}
	
	
	  @Given("^User is on the outlook home page$")
	    public void user_is_on_the_outlook_home_page() throws Throwable {
		  
		  sp.clickSignin();
		  ep.enterEmail();
		  ep.buttonClick();
		  ps.enterpassword();
		  ps.clickNext();
	       
	    }

	    @Then("^User clicks on the New Message Button$")
	    public void user_clicks_on_the_new_message_button() throws Throwable {
	     hp.clickNewMessage();
	    }

	    @Then("^User must see the To button to send the message$")
	    public void user_must_see_the_to_button_to_send_the_message() throws Throwable {
	        System.out.println(hp.todISP());
	    }

	    @Then("^error message should get displayed$")
	    public void error_message_should_get_displayed() throws Throwable {
	       System.out.println(hp.errmsgdisplayed());
	    }

	    @Then("^User clicks on the send button$")
	    public void user_clicks_on_the_send_button() throws Throwable {
	       hp.clicksendButton();
	    }
	    
	    
	    //sc2
	    
	    
	    @When("^User enters the recipient in the to field$")
	    public void user_enters_the_recipient_in_the_to_field() throws Throwable {
	       hp.enterDataintoTofield();
	       hp.clickONDarshanM();
	    }

	    @When("^User clicks on send button$")
	    public void user_clicks_on_send_button() throws Throwable {
	    hp.clickSendModal();
	    }

	    @Then("^a User prompt stating missing subject should get displayed$")
	    public void a_user_prompt_stating_missing_subject_should_get_displayed() throws Throwable {
	    	System.out.println(hp.misssubDisp());
	    	
	    	Assert.assertTrue(hp.misssubDisp());
	    }

	    @Then("^Message should get sent$")
	    public void message_should_get_sent() throws Throwable {
	    	System.out.println("message sent");
	    

	       
	    }

	    @And("^When User clicks on send button without any subject$")
	    public void when_user_clicks_on_send_button_without_any_subject() throws Throwable {
	    	 hp.clicksendButton();
	    }
	    
	    
	    //sc3
	    
	    @When("^User clicks on do not send button$")
	    public void user_clicks_on_do_not_send_button() throws Throwable {
	        hp.donotsendModal();
	    }

	    @Then("^Message should not get sent$")
	    public void message_should_not_get_sent() throws Throwable {
	        Assert.assertTrue(hp.todISP());
	    }
	    
	    //sc4
	    
	    @When("^User clicks on send button to send message$")
	    public void user_clicks_on_send_button_to_send_message() throws Throwable {
	        hp.clicksendButton();
	    }

	    @When("^User enters the subject$")
	    public void user_enters_the_subject() throws Throwable {
	        hp.enterSubject();
	    }
	    
	    
	    //sc5
	    @And("^User enters the body$")
	    public void user_enters_the_body() throws Throwable {
	        hp.enterBdy();
	    }

}
