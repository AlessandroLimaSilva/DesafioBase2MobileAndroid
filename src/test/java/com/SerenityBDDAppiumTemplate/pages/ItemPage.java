package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ItemPage extends PageBase {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Add To Cart button']")
    protected WebElement adicionarItemAoCarrinhoButton;

    protected String classificarItemList = "(//android.view.ViewGroup[@content-desc='review star #'])[1]//android.widget.TextView";

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Close Modal button']")
    protected WebElement closeModalButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Thank you for submitting your review!')]")
    protected WebElement thankYouForSubmittingYourReviewLabel;


    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public void clicarAdicionarItemAoCarrinhoButton(){
        waitForElement(adicionarItemAoCarrinhoButton);
        adicionarItemAoCarrinhoButton.click();
    }

    public void clicarClassificacaoItemList(String nota){
        WebElement notaProduto = driver.findElement(By.xpath(classificarItemList.replace("#",nota)));
        notaProduto.click();
    }

    public void clicarCloseModalButton(){
        waitForElement(closeModalButton);
        closeModalButton.click();
    }

    public String retornarTextoThankYouForSubmittingYourReviewLabel(){
        return thankYouForSubmittingYourReviewLabel.getText();
    }
}
