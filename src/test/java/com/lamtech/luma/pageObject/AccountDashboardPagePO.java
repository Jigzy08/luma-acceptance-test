package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountDashboardPagePO {
    //Element Locator
    @FindBy(css = "#maincontent > div.columns > div.column.main > div.block.block-dashboard-addresses > div.block-title > a > span")
    private static WebElement ManageAddressesLink;

    @FindBy(css = "#maincontent > div.columns > div.column.main > div.block.block-dashboard-info > div.block-content > div.box.box-information > div.box-actions > a.action.edit > span")
    private static WebElement EditAccountLink;

    @FindBy(linkText = "Change Password")
    private static WebElement ChangePasswordLink;

    @FindBy(linkText = "My Orders")
    private static WebElement MyOrdersLink;

    private WebDriverWait wait;

    //Initialize Element using Webdriver
    public AccountDashboardPagePO(WebDriver driver){
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    //Page Specific Method
    public void clickManageAddresses(){
        wait.until(ExpectedConditions.elementToBeClickable(ManageAddressesLink));
        ManageAddressesLink.click();
    }

    public void clickEditAccount(){
        EditAccountLink.click();
    }

    public void clickChangePassword(){
        ChangePasswordLink.click();
    }

    public void clickMyOrders(){
        wait.until(ExpectedConditions.elementToBeClickable(MyOrdersLink));
        MyOrdersLink.click();
    }



}
