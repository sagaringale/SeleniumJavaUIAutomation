package org.products.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By emailInputLocator = By.name("Email");
    private By passwordInputLocator = By.name("Password");
    private By loginButtonLocator = By.xpath("//div/button[@type='submit']");
    private By forgottenPasswordLinkLocator = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By logoutLinkLocator = By.xpath("//a[contains(text(),'Log out')]");
    private By loginclick = By.xpath("//a[contains(text(),'Log in')]");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods

//    public void loginpage(){
//        WebElement loginpage = driver.findElement(loginclick);
//        loginpage.click();
//
//    }
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

    public void clickForgottenPasswordLink() {
        WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
        forgottenPasswordLink.click();
    }

    public boolean checkForgotPwdLink(){
        return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
    }

    public boolean checkLogoutLink(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }


}