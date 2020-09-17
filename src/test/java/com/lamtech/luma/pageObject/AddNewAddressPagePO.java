package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewAddressPagePO {

    //Element Locator
    @FindBy(id = "street_1")
    private static WebElement StreetAddressField1;

    @FindBy(id = "street_2")
    private static WebElement StreetAddressField2;

    @FindBy(id = "city")
    private static WebElement CityField;

    @FindBy(id = "region")
    private static WebElement StateField;

    @FindBy(id = "zip")
    private static WebElement PostcodeField;

    @FindBy(id = "country")
    private static WebElement CountryDropDownField;

    @FindBy(id = "telephone")
    private static WebElement TelephoneField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    private static WebElement SaveAddressButton;

    private WebDriverWait wait;

    //Initialize Elements using Selenium Webdriver
    public AddNewAddressPagePO(WebDriver driver){
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    //Page Specific Method

    public void enterStreetAddress(String StreetAddress){
        StreetAddressField1.sendKeys(StreetAddress);
    }

    public void enterCity(String City){
        CityField.sendKeys(City);
    }

    public void enterState(String State){
        StateField.sendKeys(State);
    }

    public void enterPostCode(String PostCode){
        PostcodeField.sendKeys(PostCode);
    }

    public void enterTelephone(String Telephone){
        TelephoneField.sendKeys(Telephone);
    }

    public void clickSaveAddress(){
        SaveAddressButton.click();
    }

}
