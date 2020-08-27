package com.lamtech.luma.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class LoginPagePO {

    //Element Locator
    @FindBy (id = "email")
    private static WebElement EmailField;

    @FindBy (id = "pass")
    private static WebElement PasswordField;

    @FindBy (css = "#send2 > span")
    private static WebElement SignInButton;

    private WebDriverWait wait;

    //Initialize Elements using Selenium Webdriver
    public LoginPagePO(WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    } //constructor

    //Page Specific Method
    public void enterEmail(String Email) {
        wait.until(ExpectedConditions.visibilityOf(EmailField));
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(SignInButton));
        SignInButton.click();
    }

}


