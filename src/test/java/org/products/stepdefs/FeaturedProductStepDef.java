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
import org.products.pages.FeaturedProductPage;
import org.testng.Assert;



public class FeaturedProductStepDef {

    private WebDriver driver;
    private FeaturedProductPage featuredproductpage;

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

    @Given("I am on a Featured product section details")
    public void iAmOnAFeaturedProductSectionDetails() {
        featuredproductpage.sectionDetails();

    }

    @When("I can see the first product {string} item")
    public void iCanSeeTheFirstProductItem(String productone) {

        featuredproductpage.firstProductItem(productone);
    }

    @Then("I can see the second product {string} item")
    public void iCanSeeTheSecondProductItem(String producttwo) {
        featuredproductpage.twoProductItem(producttwo);

    }

    @And("I can see the third product {string} item")
    public void iCanSeeTheThirdProductItem(String productthird) {
        featuredproductpage.thirdProductItem(productthird);

    }


}
