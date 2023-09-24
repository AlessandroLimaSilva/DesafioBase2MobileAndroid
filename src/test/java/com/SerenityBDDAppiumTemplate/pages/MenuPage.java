package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends PageBase {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='menu item log in']")
    protected WebElement menuItemLogInButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='menu item log out']")
    protected WebElement menuItemLogOutButton;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'LOG OUT')]")
    protected WebElement logOutConfirmarButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'You are successfully logged out.')]")
    protected WebElement youAreSuccessFullyLoggedOutLabel;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void clicarMenuItemLogInButton(){
        menuItemLogInButton.click();
    }

    public void clicarMenuItemLogOutButton(){
        menuItemLogOutButton.click();
    }

    public void clicarLogOutConfirmarButton(){
        logOutConfirmarButton.click();
    }

    public String retornarTextoYouAreSuccessFullyLoggedOutLabel(){
        return youAreSuccessFullyLoggedOutLabel.getText();
    }
}
