package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginalnicialPage extends PageBase {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='open menu']//android.widget.ImageView")
    protected WebElement menuButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='menu item catalog']")
    protected WebElement catalogButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='cart badge']//android.widget.ImageView")
    protected WebElement cartButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sauce Labs Backpack')]")
    protected WebElement sauceLabsBackPackCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sauce Labs Bike Light')]")
    protected WebElement sauceLabsBikeLightCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sauce Labs Bolt T-Shirt')]")
    protected WebElement sauceLabsBoltTShirtCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sauce Labs Fleece Jacket')]")
    protected WebElement sauceLabsFleeceJacketCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sauce Labs Onesie')]")
    protected WebElement sauceLabsOnesieCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Test.allTheThings() T-Shirt')]")
    protected WebElement testAllTheThingsTShirtCard;


    public PaginalnicialPage(WebDriver driver) {
        super(driver);
    }

    public void clicarMenuButton(){
        waitFor(menuButton);
        menuButton.click();
    }

    public void clicarCatalogButton(){
        waitFor(catalogButton);
        catalogButton.click();
    }

    public void clicarCartButton(){
        waitFor(cartButton);
        cartButton.click();
    }

    public void clicarSauceLabsBackPackCard(){
        waitFor(sauceLabsBackPackCard);
        sauceLabsBackPackCard.click();
    }

    public void clicarSauceLabsBikeLightCard(){
        waitFor(sauceLabsBikeLightCard);
        sauceLabsBikeLightCard.click();
    }

    public void clicarSauceLabsBoltTShirtCard(){
        waitFor(sauceLabsBoltTShirtCard);
        sauceLabsBoltTShirtCard.click();
    }

    public void clicarSauceLabsFleeceJacketCard(){
        waitFor(sauceLabsFleeceJacketCard);
        sauceLabsFleeceJacketCard.click();
    }

    public void clicarSauceLabsOnesieCard(){
        scrollSwipeToEnd();
        waitFor(sauceLabsOnesieCard);
        sauceLabsOnesieCard.click();
    }

    public void clicarTestAllTheThingsTShirtCard(){
        scrollSwipeToEnd();
        waitFor(testAllTheThingsTShirtCard);
        testAllTheThingsTShirtCard.click();
    }
}
