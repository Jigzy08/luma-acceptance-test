package com.lamtech.luma.stepDefinition;

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

public class AccountLoginRegisteredCustomerSteps {
    WebDriver driver;
    @Given("^user is on the sign in page$")
    public void userIsOnTheSignInPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();

        //WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Launch Luma website
        driver.get("http://demo-acm-2.bird.eu/");

        //maximize browser window
        driver.manage().window().maximize();

        //Click Sign in link
        //driver.findElement(By.linkText("Sign In")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignIn();


    }

    @When("^user enter \"([^\"]*)\"$")
    public void userEnter(String Email) throws Throwable {
        //driver.findElement(By.id("email")).sendKeys(Email);
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(Email);

    }

    @And("^user also enter \"([^\"]*)\"$")
    public void userAlsoEnter(String Password) throws Throwable {
        //driver.findElement(By.id("pass")).sendKeys(Password);
        LoginPagePO loginPagePO = new LoginPagePO(driver);
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
