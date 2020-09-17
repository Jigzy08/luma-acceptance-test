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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    AccountDashboardPagePO accountDashboardPagePO = new AccountDashboardPagePO(driver);
    AddNewAddressPagePO addNewAddressPagePO = new AddNewAddressPagePO(driver);

    @Given("^Luma application is displayed successfully$")
    public void lumaApplicationIsDisplayedSuccessfully() {

        String expectedTitle = "Home Page";
        Assert.assertEquals(expectedTitle,driver.getTitle());


    }

    @When("^user is on create account page$")
    public void userIsOnCreateAccountPage() {

        //Click Create An Account link
        //driver.findElement(By.linkText("Create an Account")).click();
        //Create instance of a class

        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccount();

    }

    @And("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String FirstName, String LastName) throws Throwable {

        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);

    }

    @And("^user enters an \"([^\"]*)\"$")
    public void userEntersAn(String Email) throws Throwable {
        //driver.findElement(By.id("email_address")).sendKeys(Email);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterEmail(Email);

    }

    @And("^user will enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userWillEnterAnd(String Password, String ConfirmPassword) throws Throwable {

        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);

    }

    @And("^user click on Create Account$")
    public void userClickOnCreateAccount() {
        //driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccount();
    }

    @Then("^My Dashboard screen should be displayed$")
    public void myDashboardScreenShouldBeDisplayed() {

        String expectedTitle = "My Account";
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }



    @And("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterAnd(String Email, String Password) throws Throwable {

        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(Email);
        loginPagePO.enterPassword(Password);

    }

    @And("^user click Sign in$")
    public void userClickSignIn() {
        //driver.findElement(By.cssSelector("#send2 > span")).click();
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.clickSignIn();

    }

    @Then("^My Dashboard screen should display$")
    public void myDashboardScreenShouldDisplay() {
        String expectedTitle = "My Account";
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }


    @And("^user click Manage Addresses$")
    public void userClickManageAddresses() {
        accountDashboardPagePO.clickManageAddresses();
    }

    @And("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterAndAndAndAnd(String StreetAddress, String City, String State, String Postcode, String PhoneNumber) throws Throwable {
        addNewAddressPagePO.enterStreetAddress(StreetAddress);
        addNewAddressPagePO.enterCity(City);
        addNewAddressPagePO.enterState(State);
        addNewAddressPagePO.enterPostCode(Postcode);
        addNewAddressPagePO.enterTelephone(PhoneNumber);

    }

    @And("^user select country from dropdown$")
    public void userSelectCountryFromDropdown() {
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        drpCountry.selectByVisibleText("Poland");
    }

    @And("^user click Save Address button$")
    public void userClickSaveAddressButton() {
        addNewAddressPagePO.clickSaveAddress();
    }

    @Then("^Address should be updated$")
    public void addressShouldBeUpdated() {
    }
}
