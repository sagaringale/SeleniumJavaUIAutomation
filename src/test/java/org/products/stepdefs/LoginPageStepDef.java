package org.products.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.products.pages.LoginPage;
import org.testng.Assert;

public class LoginPageStepDef{

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }


    @Given("I am on the nopcommerce login page")
    public void i_am_on_the_nopcommerce_login_page() {
        driver.get("https://demo.nopcommerce.com/");
        loginPage = new LoginPage(driver);


    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        loginPage.loginpage();
        loginPage.enterEmail("sss@gmail.com");
        loginPage.enterPassword("Sagar@demo");
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.checkLogoutLink(), true);
    }



    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String errorMessage) {
        Assert.assertEquals( driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).isDisplayed(), true);

    }

    @When("I click on the \"Forgotten Password\" link")
    public void i_click_on_the_forgotten_password() {
        loginPage.clickForgottenPasswordLink();
    }

    @Then("I should be redirected to the password reset page")
    public void i_should_be_redirected_to_the_password_reset_page() {
        WebElement passrecovery = driver.findElement(By.xpath("//h1[contains(text(),'Password recovery')]"));
        String ExpectedText = "Password recovery";
        Assert.assertEquals(ExpectedText, passrecovery.getText());
    }


}