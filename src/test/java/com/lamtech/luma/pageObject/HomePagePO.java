package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    //Element Locator
    @FindBy(linkText = "Create an Account")
    //Declare WebElement Create Account
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public  static WebElement SignInLink;

    @FindBy(linkText = "minicart_content")
    private static WebElement MiniCartButton;

    //Initialize Elements using Selenium Webdriver
    public HomePagePO(WebDriver driver) {
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    //Page Specific Method
    public void clickCreateAccount(){
        CreateAccountLink.click();
    }

    public void clickSignIn(){
        SignInLink.click();
    }

    public void clickMiniCart(){
        MiniCartButton.click();
    }









}
