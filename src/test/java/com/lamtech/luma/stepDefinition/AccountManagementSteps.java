package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.pageObject.CreateAccountPagePO;
import com.lamtech.luma.pageObject.HomePagePO;
import com.lamtech.luma.pageObject.LoginPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountManagementSteps {
    WebDriver driver;

    @Given("^Luma application is displayed successfully$")
    public void lumaApplicationIsDisplayedSuccessfully() {

        //Define Browser
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        //Define WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Define WebDriver to use FireFox brower
        //driver = new FirefoxDriver();

        //Launch Luma e-commerce website
        driver.get("http://demo-magento2.vuestorefront.io/");

        //Maximize browser window
        driver.manage().window().maximize();


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
    }

    @When("^user is on the sign in page$")
    public void userIsOnTheSignInPage() {

        //Click Sign in link
        //driver.findElement(By.linkText("Sign In")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignIn();

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
    }



}
