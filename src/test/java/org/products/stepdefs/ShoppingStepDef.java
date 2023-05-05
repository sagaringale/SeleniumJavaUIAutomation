package org.products.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.products.pages.ShoppingPage;
import org.testng.Assert;


public class ShoppingStepDef {

    private WebDriver driver;
    private ShoppingPage shoppingpage;

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
    @Given("I am click on computer tab")
    public void iAmClickOnComputerTab() {

        shoppingpage.ComputerTab();

    }

    @When("I am click on Desktop")
    public void iAmClickOnDesktop() {
        shoppingpage.DesktopTab();
    }

    @And("I am select {string}")
    public void iAmSelect(String productselect) {
        shoppingpage.SelectProduct(productselect);
    }

    @Then("I can see the product is selected")
    public void iCanSeeTheProductIsSelected() {
        shoppingpage.ProductIsSelected();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButtion() {
        shoppingpage.AddToCartButtion();

    }

    @And("I click on Shopping cart")
    public void iClickOnShoppingCart() {
        shoppingpage.ShoppingCart();
    }

    @Then("I can see the product added to the shopping cart")
    public void iCanSeeTheProductAddedToTheShoppingCart() {
        shoppingpage.AddedToTheShoppingCart();
    }

    @And("I click on i agree with the terms check box")
    public void iClickOnIAgreeWithTheTermsCheckBox() {
        shoppingpage.IAgreeWithTheTermsCheckBox();
    }

    @And("I click on CheckOut button")
    public void iClickOnCheckOutButtion() {

        shoppingpage.ClickOnCheckOutButtion();
    }

    @Then("I click on Checkout as Guest button")
    public void iClickOnCheckoutAsGuestButton() {

        shoppingpage.ClickOnCheckoutAsGuestButton();
    }

    @Then("I Can See Checkout as Guest")
    public void iCanSeeCheckoutAsGuest() {

        shoppingpage.CanSeeCheckoutAsGuest();
    }


    @And("I can see Billing Address")
    public void iCanSeeBillingAddress() {
        shoppingpage.CanSeeBillingAddress();
    }

    @And("I enter the first name and last name")
    public void iEnterTheFirstNameAndLastName() {
        shoppingpage.EnterTheFirstNameAndLastName();
    }

    @And("I enter the email add")
    public void iEnterTheEmailAdd() {
        shoppingpage.EnterTheEmailAdd();
    }

    @And("I enter the company name")
    public void iEnterTheCompanyName() {
        shoppingpage.EnterTheCompanyName();
    }
}
