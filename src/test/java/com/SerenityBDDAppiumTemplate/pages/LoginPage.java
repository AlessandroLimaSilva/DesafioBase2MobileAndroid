package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Username input field']")
    protected WebElement usernameInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Password input field']")
    protected WebElement passwordInputField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Login button']")
    protected WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Provided credentials do not match any user in this service.')]")
    protected WebElement providedCredentialsDoNotMatchAnyUserInThisServiceLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Username is required')]")
    protected WebElement usernameIsRequiredLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Password is required')]")
    protected WebElement passwordIsRequiredLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sorry, this user has been locked out.')]")
    protected WebElement sorryThisUserHasBeenLockedOutLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='alice@example.com (locked out)-autofill']/android.widget.TextView")
    protected WebElement preencherUsuarioBloqueadoAutomaticamenteButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='bob@example.com-autofill']/android.widget.TextView")
    protected WebElement preencherUsuarioCadastradoAutomaticamenteButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void preencherUsernameInputField(String nome){
        usernameInputField.sendKeys(nome);
    }

    public void preencherPasswordInputField(String password){
        passwordInputField.sendKeys(password);
    }

    public void clicarLoginButton(){
        loginButton.click();
    }

    public String retornaTextoProvidedCredentialsDoNotMatchAnyUserInThisServiceLabel(){
        return providedCredentialsDoNotMatchAnyUserInThisServiceLabel.getText();
    }

    public String retornaTextoUsernameIsRequiredLabel(){
        return usernameIsRequiredLabel.getText();
    }

    public String retornaTextoPasswordIsRequiredLabel(){
        return passwordIsRequiredLabel.getText();
    }

    public String retornaTextoSorryThisUserHasBeenLockedOutLabel(){
        return sorryThisUserHasBeenLockedOutLabel.getText();
    }

    public void clicarPreencherUsuarioBloqueadoAutomaticamenteButton(){
        preencherUsuarioBloqueadoAutomaticamenteButton.click();
    }

    public void clicarPreencherUsuarioCadastradoAutomaticamenteButton(){
        preencherUsuarioCadastradoAutomaticamenteButton.click();
    }
}
