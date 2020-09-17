package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingAddressPO {

    @FindBy(id = "customer-email")
    private static WebElement EmailField;

    @FindBy(name = "firstname")
    private static  WebElement FirstNameField;

    @FindBy(name = "lastname")
    private static WebElement LastNameField;

    @FindBy(name = "street[0]")
    private static WebElement StreetAddressField0;

    @FindBy (name = "street[1]")
    private static WebElement StreetAddressField1;

    @FindBy(name = "city")
    private static WebElement CityField;

    @FindBy(name = "region")
    private static WebElement StateField;

    @FindBy (name = "postcode")
    private static WebElement PostalCodeField;

    @FindBy (name = "country_id")
    private static WebElement CountryField;

    @FindBy (id = "LDRME4J")
    private static WebElement PhoneNumberField;

    @FindBy (css = "#checkout-shipping-method-load > table > tbody > tr:nth-child(3) > td:nth-child(1) > input")
    private static WebElement FreeShippingButton;

    @FindBy (css = "#shipping-method-buttons-container > div > button > span")
    private static WebElement NextButton;

    private WebDriverWait wait;

    //Initialize Elements using Selenium Webdriver
    public ShippingAddressPO(WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    //Page Specific Method

    public void enterEmail(String Email){
        wait.until(ExpectedConditions.visibilityOf(EmailField));
        EmailField.sendKeys(Email);
    }

    public void enterFirstName(String FirstName){
        wait.until(ExpectedConditions.visibilityOf(FirstNameField));
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        wait.until(ExpectedConditions.visibilityOf(LastNameField));
        LastNameField.sendKeys(LastName);
    }

    public void enterStreetAddress(String StreetAddress){
        wait.until(ExpectedConditions.visibilityOf(StreetAddressField0));
        StreetAddressField0.sendKeys(StreetAddress);
    }

    public void enterCity(String City){
        CityField.sendKeys(City);
    }

    public void enterState(String State){
        StateField.sendKeys(State);
    }

    public void enterPostalCode(String PostalCode){
        PostalCodeField.sendKeys(PostalCode);
    }

    public void selectFreeShipping(){
        FreeShippingButton.click();
    }

    public void clickNext(){
        NextButton.click();
    }




}
