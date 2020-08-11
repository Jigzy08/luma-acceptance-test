package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.pageObject.CreateAccountPagePO;
import com.lamtech.luma.pageObject.HomePagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountSteps {
    WebDriver driver;
    @Given("^user is on create account page$")
    public void userIsOnCreateAccountPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();

        //Define WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Launch Luma e-commerce website
        driver.get("http://demo-acm-2.bird.eu/");

        //Maximize browser window
        driver.manage().window().maximize();

        //Click Create An Account link
        //driver.findElement(By.linkText("Create an Account")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccount();

    }

    @When("^user enters \"([^\"]*)\"$")
    public void userEnters(String FirstName) throws Throwable {
        //driver.findElement(By.id("firstname")).sendKeys(FirstName);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);

    }

    @And("^user enters the \"([^\"]*)\"$")
    public void userEntersThe(String LastName) throws Throwable {
        //driver.findElement(By.id("lastname")).sendKeys(LastName);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterLastName(LastName);

    }

    @And("^user enters an \"([^\"]*)\"$")
    public void userEntersAn(String Email) throws Throwable {
        //driver.findElement(By.id("email_address")).sendKeys(Email);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterEmail(Email);

    }

    @And("^user will enter \"([^\"]*)\"$")
    public void userWillEnter(String Password) throws Throwable {
        //driver.findElement(By.id("password")).sendKeys(Password);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterPassword(Password);

    }

    @And("^users also enter \"([^\"]*)\"$")
    public void usersAlsoEnter(String ConfirmPassword) throws Throwable {
        //driver.findElement(By.id("password-confirmation")).sendKeys(ConfirmPassword);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
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
}
