package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {

    //Element Locator
    @FindBy(css = "body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a")
    private static WebElement CartButton;

    @FindBy(css = "#top-cart-btn-checkout")
    private static WebElement ProceedToCheckoutButton;

    @FindBy(css = "#mini-cart > li > div > div > div.product.actions > div.secondary > a")
    private static WebElement DeleteButton;

    @FindBy(xpath = "/html/body/div[4]/aside[2]/div[2]/footer/button[2]/span")
    private static WebElement ModalPopupOk;

    private WebDriverWait wait;

    //Initialize Elements using Webdriver
    public BasePO(WebDriver driver){
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    //Page Specific Method
    public void clickCart(){
        //wait.until(ExpectedConditions.elementToBeClickable(CartButton));
        CartButton.click();
    }

    public void clickProceedToCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton));
        ProceedToCheckoutButton.click();
    }

    public void clickDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(DeleteButton));
        DeleteButton.click();
    }

    public void clickOK(){
        wait.until(ExpectedConditions.elementToBeClickable(ModalPopupOk));
        ModalPopupOk.click();
    }

}
