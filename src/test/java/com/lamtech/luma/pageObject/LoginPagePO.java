package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class LoginPagePO {

    //Element Locator
    @FindBy (id = "email")
    public static WebElement EmailField;

    @FindBy (id = "pass")
    public static WebElement PasswordField;

    @FindBy (css = "#send2 > span")
    public static WebElement SignInButton;

    //Initialize Elements using Selenium Webdriver
    public LoginPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Page Specific Method
    public void enterEmail(String Email) {
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignIn(){
        SignInButton.click();
    }

}


