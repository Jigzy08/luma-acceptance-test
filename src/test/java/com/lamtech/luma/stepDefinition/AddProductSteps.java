package com.lamtech.luma.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductSteps {
    WebDriver driver;

    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();

        //Define WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Launch Luma e-commerce website
        driver.get("http://demo-magento2.vuestorefront.io/");

        //Maximize browser window
        driver.manage().window().maximize();




    }

    @And("^user move mouse over Women$")
    public void userMoveMouseOverWomen() {

        Actions actions = new Actions(driver);

        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));

        actions.moveToElement(menuOption).perform();

    }

    @And("^user moves mouse over Tops$")
    public void userMovesMouseOverTops() {
        Actions actions = new Actions(driver);

        WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));

        actions.moveToElement(subMenuOption).perform();

        //WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));

        //actions.moveToElement(menuOption).perform();


    }

    @And("^user click Jackets$")
    public void userClickJackets() {
    }

    @And("^user clicks Juno Jacket$")
    public void userClicksJunoJacket() {
    }

    @And("^user also click Small$")
    public void userAlsoClickSmall() {
    }

    @And("^user then click Purple$")
    public void userThenClickPurple() {
    }

    @Then("^user clicks Add to Cart$")
    public void userClicksAddToCart() {
    }
}
