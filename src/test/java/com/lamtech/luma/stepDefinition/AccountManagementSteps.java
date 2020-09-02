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
    @Given("^user is on create account page$")
    public void userIsOnCreateAccountPage() {
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

        //Click Create An Account link
        //driver.findElement(By.linkText("Create an Account")).click();
        //Create instance of a class
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccount();

    }

    @When("^user enters \"([^\"]*)\"$")
    public void userEnters(String FirstName) throws Throwable {
        //driver.findElement(By.id("firstname")).sendKeys(FirstName);

        //Thread.sleep
        //Thread.sleep(10000);

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

    @Given("^user is on the sign in page$")
    public void userIsOnTheSignInPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();

        //WebDriverManager.firefoxdriver().setup();

        //Define WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Define WebDriver to use firefox browser
        //driver = new FirefoxDriver();

        //Launch Luma website
        driver.get("http://demo-magento2.vuestorefront.io/");

        //maximize browser window
        driver.manage().window().maximize();

        //driver.manage().deleteAllCookies();

        //Click Sign in link
        //driver.findElement(By.linkText("Sign In")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignIn();



    }

    @When("^user enter \"([^\"]*)\"$")
    public void userEnter(String Email) throws Throwable {
        //driver.findElement(By.id("email")).sendKeys(Email);

        //Thread.sleep
        //Thread.sleep(5000);

        //implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



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
