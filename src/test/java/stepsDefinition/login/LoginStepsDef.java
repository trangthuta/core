package stepsDefinition.login;

import core.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepsDef {
    LoginPage loginPage = new LoginPage(BaseTest.getDriver()) ;
    HomePage homePage = new HomePage(BaseTest.getDriver()) ;

    @Given("I went to C-ticket Login page")
    public void iWentToCTicketLoginPage() {
        System.out.println("ABC");
        
    }

    @When("I entered a valid email")
    public void iEnteredAValidEmail() {
        loginPage.enterAValidEmail();
    }

    @And("I entered a valid password")
    public void iEnteredAValidPassword() {
        loginPage.enterAValidPassword();
    }

    @And("I clicked login button")
    public void iClickedLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("I logined sucessfully")
    public void iLoginedSucessfully() {
        homePage.verifyLoginSuccessFully();
    }
}
