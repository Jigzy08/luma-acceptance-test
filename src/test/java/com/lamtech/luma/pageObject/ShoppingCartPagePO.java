package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPagePO {

    @FindBy(css = "#shopping-cart-table > tbody > tr.item-actions > td > div > a.action.action-delete")
    private static WebElement RemoveItemButton;

    private WebDriverWait wait;

    //Initialize Elements using Selenium Webdriver
    public ShoppingCartPagePO(WebDriver driver) {
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this); //initialise all element on page to use Webdriver
    }

    //Page Specific Method
    public void clickRemoveItem(){
        wait.until(ExpectedConditions.elementToBeClickable(RemoveItemButton));
        RemoveItemButton.click();
    }

}
