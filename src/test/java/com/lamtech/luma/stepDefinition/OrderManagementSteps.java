package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.pageObject.HomePagePO;
import com.lamtech.luma.pageObject.JacketPagePO;
import com.lamtech.luma.pageObject.JunoJacketPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OrderManagementSteps {
    WebDriver driver;

    @Given("^user has launched Luma application successfully$")
    public void userHasLaunchedLumaApplicationSuccessfully() {

        //Define Browser
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();

        //Define WebDriver to use chrome browser
        driver = new ChromeDriver();

        //Define WebDriver to use FireFox browser
        //driver = new FirefoxDriver();

        //Launch Luma e-commerce website
        driver.get("http://demo-magento2.vuestorefront.io/");

        //Maximize browser window
        driver.manage().window().maximize();


    }

    @When("^user moves mouse over Women and Tops and clicks Jackets$")
    public void userMovesMouseOverWomenAndTopsAndClicksJackets() throws InterruptedException {

        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Women' to perform mouse hover
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(menuOption).perform();

        //Add Wait
        Thread.sleep(1000);

        //Retrieve WebElement 'Tops' to perform mouse hover
        WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]/span[2]"));
        //Mouse hover menuOption 'Music'
        actions.moveToElement(subMenuOption).perform();

        //Add Wait
        Thread.sleep(1000);

        //Select 'Jackets' from sub menu which has got displayed on mouse hover of 'Tops'
        WebElement selectMenuOption = driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]/span"));
        selectMenuOption.click();

    }

    @And("^user clicks Juno Jacket$")
    public void userClicksJunoJacket() {
        JacketPagePO jacketPagePO = new JacketPagePO(driver);
        jacketPagePO.clickJunoJacket();

    }

    @And("^user also click Small and click Purple$")
    public void userAlsoClickSmallAndClickPurple() {
        JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.clickSmall();
        junoJacketPagePO.clickPurple();
    }

    @And("^user will also enter \"([^\"]*)\"$")
    public void userWillAlsoEnter(String Qty) throws Throwable {
        JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.enterQty(Qty);

    }

    @And("^user clicks Add to Cart$")
    public void userClicksAddToCart() {
        JunoJacketPagePO junoJacketPagePO = new JunoJacketPagePO(driver);
        junoJacketPagePO.clickAddToCart();

    }

    @Then("^item is added to basket$")
    public void itemIsAddedToBasket() {
    }


}
