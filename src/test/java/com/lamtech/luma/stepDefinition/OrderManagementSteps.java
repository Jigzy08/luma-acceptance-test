package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.cucumber.Hooks;
import com.lamtech.luma.pageObject.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrderManagementSteps {
    WebDriver driver = Hooks.driver;
    JacketPagePO jacketPagePO = new JacketPagePO(driver);
    JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
    ShippingAddressPO shippingAddressPO = new ShippingAddressPO(driver);
    MyOrdersPagePO myOrdersPagePO = new MyOrdersPagePO(driver);
    AccountDashboardPagePO accountDashboardPagePO = new AccountDashboardPagePO(driver);
    BasePO basePO = new BasePO(driver);



    @When("^user moves mouse over Women and Tops and clicks Jackets$")
    public void userMovesMouseOverWomenAndTopsAndClicksJackets() throws InterruptedException {

        //Add Wait
        Thread.sleep(3000);

        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Women' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
        //Mouse hover menuOption 'Women'
        actions.moveToElement(menuOption).perform();

        //Add Wait
        Thread.sleep(5000);

        //Retrieve WebElement 'Tops' to perform mouse hover
        WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));
        //Mouse hover menuOption 'Tops'
        actions.moveToElement(subMenuOption).perform();

        //Add Wait
        Thread.sleep(7000);

        //Select 'Jackets' from sub menu which has got displayed on mouse hover of 'Tops'
        WebElement selectMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]/span"));
        selectMenuOption.click();

    }

    @And("^user clicks Juno Jacket$")
    public void userClicksJunoJacket() {
        //JacketPagePO jacketPagePO = new JacketPagePO(driver);
        jacketPagePO.clickJunoJacket();

    }

    @And("^user also click Small and click Purple$")
    public void userAlsoClickSmallAndClickPurple() {
        //JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.clickSmall();
        junoJacketPagePO.clickPurple();
    }

    @And("^user will also enter \"([^\"]*)\"$")
    public void userWillAlsoEnter(String Qty) throws Throwable {
        //JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.enterQty(Qty);

    }

    @And("^user clicks Add to Cart$")
    public void userClicksAddToCart() {
        //JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.clickAddToCart();

    }

    @Then("^item is added to basket$")
    public void itemIsAddedToBasket() {
    }


    @And("^user delete the item$")
    public void userDeleteTheItem() throws InterruptedException {
        //Add Wait
        Thread.sleep(1000);

        //driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")).click();

        //driver.findElement(By.cssSelector("#mini-cart > li > div > div > div.product.actions > div.secondary > a")).click();

        //Add Wait
        //Thread.sleep(5000);

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]/span")).click();
        //driver.findElement(By.cssSelector("#minicart-content-wrapper > div.block-content > div:nth-child(7) > div > a > span")).click();
        //Thread.sleep(1000);

        //driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.item-actions > td > div > a.action.action-delete")).click();

        //ShoppingCartPagePO shoppingCartPagePO = new ShoppingCartPagePO(driver);
        //shoppingCartPagePO.clickRemoveItem();

        basePO.clickCart();
        basePO.clickDelete();
        basePO.clickOK();

    }

    @Then("^item should be removed from cart$")
    public void itemShouldBeRemovedFromCart() {
    }

    @And("^user click Cart and click proceed to checkout$")
    public void userClickCartAndClickProceedToCheckout() throws InterruptedException {

        //Add Wait
        //Thread.sleep(1000);

        //driver.findElement(By.cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")).click();

        //driver.findElement(By.cssSelector("#top-cart-btn-checkout")).click();

        basePO.clickCart();
        basePO.clickProceedToCheckout();


    }

    @And("^user then enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userThenEntersAndAnd(String Email, String FirstName, String LastName) throws Throwable {

        //ShippingAddressPO shippingAddressPO = new ShippingAddressPO(driver);
        shippingAddressPO.enterEmail(Email);
        shippingAddressPO.enterFirstName(FirstName);
        shippingAddressPO.enterLastName(LastName);


    }

    @And("^user also enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userAlsoEnterAndAndAnd(String StreetAddress, String City, String State, String PostalCode) throws Throwable {

        //ShippingAddressPO shippingAddressPO = new ShippingAddressPO(driver);
        shippingAddressPO.enterStreetAddress(StreetAddress);
        shippingAddressPO.enterCity(City);
        shippingAddressPO.enterState(State);
        shippingAddressPO.enterPostalCode(PostalCode);

    }

    @And("^user selects \"([^\"]*)\" from dropdown$")
    public void userSelectsFromDropdown(String Country) throws Throwable {
        Select drpCountry = new Select(driver.findElement(By.name("country_id")));
        drpCountry.selectByVisibleText("Poland");

    }

    @And("^user selects shipping option$")
    public void userSelectsShippingOption() throws InterruptedException {
        //Add Wait
        Thread.sleep(1000);
        //List RadioButton = driver.findElements(By.className("payment[method]"));

        //WebElement radio3 = driver.findElement(By.cssSelector("#checkout-shipping-method-load > table > tbody > tr:nth-child(3) > td:nth-child(1) > input"));
       //radio3.click();

        //ShippingAddressPO shippingAddressPO = new ShippingAddressPO(driver);
        shippingAddressPO.selectFreeShipping();


    }

    @And("^user click Next$")
    public void userClickNext() {
        //ShippingAddressPO shippingAddressPO = new ShippingAddressPO(driver);
        shippingAddressPO.clickNext();
    }

    @And("^user select payment method and click place order$")
    public void userSelectPaymentMethodAndClickPlaceOrder() throws InterruptedException {
        //Add Wait
        Thread.sleep(5000);


        List RadioButton = driver.findElements(By.name("payment[method]"));

        WebElement cashOnDelivery = driver.findElement(By.cssSelector("#cashondelivery"));
        cashOnDelivery.click();


        driver.findElement(By.cssSelector("#checkout-payment-method-load > div > div > div.payment-method._active > div.payment-method-content > div.actions-toolbar > div > button > span")).click();

    }

    @Then("^Order is placed$")
    public void orderIsPlaced() {
    }

    @And("^user click My orders$")
    public void userClickMyOrders() {
        accountDashboardPagePO.clickMyOrders();
    }

    @And("^user click View Orders$")
    public void userClickViewOrders() {
        myOrdersPagePO.clickViewOrder();
    }

    @Then("^orders are displayed$")
    public void ordersAreDisplayed() {
    }
}
