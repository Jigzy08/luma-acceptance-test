package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.cucumber.Hooks;
import com.lamtech.luma.pageObject.HomePagePO;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    WebDriver driver  = Hooks.driver;
    @When("^user is on the sign in page$")
    public void userIsOnTheSignInPage() {

        //Click Sign in link
        //driver.findElement(By.linkText("Sign In")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignIn();

    }

}
