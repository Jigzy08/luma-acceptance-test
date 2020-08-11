package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    //Element Locator
    @FindBy(id = "firstname")
    //Declare WebElement Create Account
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public  static WebElement LastNameField;

    @FindBy(id = "email_address")
    public  static WebElement EmailField;

    @FindBy(id = "password")
    public  static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public  static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;

    //Initialize Elements using Selenium Webdriver
    public CreateAccountPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    //Page Specific Method


    public void enterFirstName(String FirstName){
        FirstNameField.sendKeys(FirstName); //parameterize method
    }

    public void enterLastName(String LastName){
        LastNameField.sendKeys(LastName);
    }

    public void enterEmail(String Email) {
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword) {
        ConfirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void clickCreateAccount(){
        CreateAccountButton.click();
    }







}
