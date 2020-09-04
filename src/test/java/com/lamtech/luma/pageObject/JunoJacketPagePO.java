package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JunoJacketPagePO {

    //Element Locator
    @FindBy(id = "option-label-size-142-item-167")
    private static WebElement SizeXSLabel;

    @FindBy(id = "option-label-size-142-item-168")
    private static WebElement SizeSmallLabel;

    @FindBy(id = "option-label-size-142-item-169")
    private static WebElement SizeMediumLabel;

    @FindBy(id = "option-label-size-142-item-170")
    private static WebElement SizeLargeLabel;

    @FindBy(id = "option-label-size-142-item-171")
    private static WebElement SizeXLLabel;

    @FindBy(id = "option-label-color-93-item-53")
    private static WebElement ColorGreenLabel;

    @FindBy(id = "option-label-color-93-item-57")
    private static WebElement ColorPurpleLabel;

    @FindBy(id = "option-label-color-93-item-50")
    private static WebElement ColorBlueLabel;

    @FindBy(id = "qty")
    private static WebElement QtyField;

    @FindBy(css = "#product-addtocart-button > span")
    private static WebElement AddToCartButton;

    private WebDriverWait wait;

    //Initialize Elements using Selenium Webdriver
    public JunoJacketPagePO(WebDriver driver) {
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    public void clickSmall() {
        wait.until(ExpectedConditions.visibilityOf(SizeSmallLabel));
        SizeSmallLabel.click();
    }

    public void clickPurple(){
        ColorPurpleLabel.click();
    }


    public void enterQty(String Qty){
        QtyField.clear();
        QtyField.sendKeys(Qty);
    }

    public void clickAddToCart(){
        AddToCartButton.click();
    }




}
