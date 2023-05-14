package org.products.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeaturedProductPage {
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
    private By maintitleClick = By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]");




    // Constructor
    public FeaturedProductPage(WebDriver driver) {
        this.driver = driver;
    }


    public void sectionDetails() throws InterruptedException {
        WebElement mainTitle = driver.findElement(maintitleClick);
        mainTitle.click();
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,450)");
        WebElement SectionItem = driver.findElement(sectioniteam);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SectionItem);
        Thread.sleep(500);
       // WebElement SectionItem = driver.findElement(sectioniteam);
        SectionItem.getText();
    }

    public void firstProductItem(String productone){

        WebElement firstProduct = driver.findElement(productfirst);
        //firstProduct.isDisplayed();
        Assert.assertEquals(productone, firstProduct.getText());
    }

    public void twoProductItem(String producttwo){

        WebElement secondProduct = driver.findElement(productsecond);
        Assert.assertEquals(producttwo, secondProduct.getText());

    }
    public void thirdProductItem(String productthird){

        WebElement threeProduct = driver.findElement(producthree);
        Assert.assertEquals(productthird, threeProduct.getText());

    }

}