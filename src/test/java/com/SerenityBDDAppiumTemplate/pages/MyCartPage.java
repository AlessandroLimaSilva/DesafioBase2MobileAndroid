package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;

public class MyCartPage extends PageBase {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='remove item']/android.widget.TextView")
    protected List<WebElement> excluirItensButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'No Items')]")
    protected WebElement carrinhoVazioLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Proceed To Checkout button']/android.widget.TextView")
    protected WebElement proceedToCheckoutButton;

    public MyCartPage(WebDriver driver) {
        super(driver);
    }

    public void excluirItemButton(){
        for(WebElement element: excluirItensButton){
            element.click();
            break;
        }
    }

    public String retornaTextoSeCarrinhoVazioLabel(){
        waitFor(carrinhoVazioLabel);
        return carrinhoVazioLabel.getText();
    }

    public void excluirTodosOsItensDoCarrinho(){
        if(!excluirItensButton.isEmpty()){
            try {
                while(!excluirItensButton.isEmpty()){
                    excluirItensButton.get(0).click();
                }
            }catch (Exception e){

            }
        }
    }

    public void clicarProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}
