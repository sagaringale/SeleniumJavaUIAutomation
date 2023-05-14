package org.products.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ShoppingPage {

    private WebDriver driver;

    // Locators
    private By emailInputLocator = By.name("Email");
    private By passwordInputLocator = By.name("Password");
    private By loginButtonLocator = By.xpath("//div/button[@type='submit']");
    private By forgottenPasswordLinkLocator = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By logoutLinkLocator = By.xpath("//a[contains(text(),'Log out')]");

    private By sectioniteam = By.xpath("//strong[contains(text(),'Featured products')]");
    private By productfirst = By.xpath("//a[contains(text(),'Build your own computer')]");
    private By productsecond = By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    private By producthree = By.xpath("//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");

    private By compTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    private By DeskTop = By.xpath("//div/h2/a[text()=' Desktops ']");

    private By selectproduct = By.xpath("//div/h2/a[text()='Lenovo IdeaCentre 600 All-in-One PC']");
    private By SelectProduct = By.xpath("//div/h1[text()='Lenovo IdeaCentre 600 All-in-One PC']");

    private By addtocartbuttion =By.xpath("//button[@id='add-to-cart-button-3']");

    private By shoppingcart =By.xpath("//span[contains(text(),'Shopping cart')]");

    private By addshoppingcart =By.xpath("//tbody/tr/td/a[text()='Lenovo IdeaCentre 600 All-in-One PC']");

    private By agreeWithThetermsCheckBox =By.xpath("//input[@id='termsofservice']");

    private By checkOutButtion =By.xpath("//button[@id='checkout']");

    private By checkoutAsGuestButton =By.xpath("//button[contains(text(),'Checkout as Guest')]");

    private By canSeeBillingaddress =By.xpath("//h2[contains(text(),'Billing address')]");

    private By firstName =By.xpath("//input[@id='BillingNewAddress_FirstName']");

    private By lastName =By.xpath("//input[@id='BillingNewAddress_LastName']");

    private By emailAdd =By.xpath("//input[@id='BillingNewAddress_Email']");

    private By companyName =By.xpath("//input[@id='BillingNewAddress_Company']");






    // Constructor
    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ComputerTab() {
        WebElement computertab = driver.findElement(compTab);
        computertab.click();

    }

    public void DesktopTab() {
//        WebElement computertab = driver.findElement(compTab);
//        //computertab.click();
        WebElement desktoptab = driver.findElement(DeskTop);
        desktoptab.click();

//        Actions action = new Actions(driver);
//        action.moveToElement(computertab).perform();
//        Thread.sleep(2000);
//        action.click(desktoptab).perform();
    }

    public void SelectProduct(String SelectProduct){

        WebElement selectProduct = driver.findElement(selectproduct);
        Assert.assertEquals(SelectProduct, selectProduct.getText());

    }
    public void ProductIsSelected(String productselect){
        WebElement selectProduct = driver.findElement(selectproduct);
        selectProduct.click();
        WebElement productIsselected = driver.findElement(SelectProduct);
        Assert.assertEquals(productselect, productIsselected.getText());

    }

    public void AddToCartButtion(){
        WebElement selectProduct = driver.findElement(selectproduct);
        selectProduct.click();
        WebElement AddtoCartButtion = driver.findElement(addtocartbuttion);
        AddtoCartButtion.click();

    }


    public void ShoppingCart(){
        WebElement Shoppingcart = driver.findElement(shoppingcart);
        Shoppingcart.click();
    }

    public void AddedToTheShoppingCart(){
        WebElement AddShoppingcart = driver.findElement(addshoppingcart);
        String addShoppingcart = "Lenovo IdeaCentre 600 All-in-One PC";
        Assert.assertEquals(addShoppingcart, AddShoppingcart.getText());
    }

    public void IAgreeWithTheTermsCheckBox(){
        WebElement AgreeWithTheTermsCheckBox = driver.findElement(agreeWithThetermsCheckBox);
        AgreeWithTheTermsCheckBox.click();
    }

    public void ClickOnCheckOutButtion(){
        WebElement CheckOutButtion = driver.findElement(checkOutButtion);
        CheckOutButtion.click();
    }

    public void ClickOnCheckoutAsGuestButton(){
        WebElement CheckoutAsGuestButton = driver.findElement(checkoutAsGuestButton);
        CheckoutAsGuestButton.isDisplayed();
        CheckoutAsGuestButton.click();
    }

    public void CanSeeCheckoutAsGuest(){
        WebElement CheckoutAsGuestButton = driver.findElement(checkoutAsGuestButton);
        CheckoutAsGuestButton.isDisplayed();
    }

    public void CanSeeBillingAddress(){
        WebElement canSeeBillingAddress = driver.findElement(canSeeBillingaddress);
        canSeeBillingAddress.isDisplayed();
    }

    public void EnterTheFirstNameAndLastName(){
        WebElement FirstName = driver.findElement(firstName);
        FirstName.sendKeys("sagar");
        WebElement LastName = driver.findElement(lastName);
        LastName.sendKeys("ingale");

    }

    public void EnterTheEmailAdd(){
        WebElement EmailAdd = driver.findElement(emailAdd);
        EmailAdd.sendKeys("sagar@gmail.com");
    }

    public void EnterTheCompanyName(){
        WebElement CompanyName = driver.findElement(companyName);
        CompanyName.sendKeys("New");
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

}
