package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JacketPagePO {

    //Element Locator
    @FindBy(linkText = "Juno Jacket")
    public static WebElement JunoJacketLink;

    //Initialize Elements using Selenium Webdriver
    public JacketPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    public void clickJunoJacket (){
        JunoJacketLink.click();
    }


}
