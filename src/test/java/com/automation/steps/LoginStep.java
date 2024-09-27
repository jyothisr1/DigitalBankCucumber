package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage=new LoginPage();

    @Given("user open the website")
    public void user_open_the_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {

    }

    @When("user click on signup link")
    public void user_click_on_signup_link() {

    }



    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }

    @When("user click on login button")
    public void user_click_on_login_button() {

    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {

    }
}
