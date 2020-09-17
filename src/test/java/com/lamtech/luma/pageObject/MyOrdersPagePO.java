package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyOrdersPagePO {

    //Element Locator
    @FindBy(css = "#my-orders-table > tbody > tr > td.col.actions > a.action.view > span")
    private static WebElement ViewOrderLink;

    @FindBy(css = "#my-orders-table > tbody > tr > td.col.actions > a.action.order > span")
    private static WebElement ReorderLink;

    private WebDriverWait wait;

    //Initialize elements using Selenium Webdriver
    public MyOrdersPagePO(WebDriver driver){
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    //Page specific Method
    public void clickViewOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(ViewOrderLink));
        ViewOrderLink.click();
    }

    public void clickReorder(){
        ReorderLink.click();
    }


}
