package com.SerenityBDDAppiumTemplate.pages;

import com.SerenityBDDAppiumTemplate.bases.PageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Full Name* input field' and @text='Rebecca Winter']")
    protected WebElement fullNameInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Address Line 1* input field']")
    protected WebElement addressLineOneInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Address Line 2 input field']")
    protected WebElement addressLineTwoInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='City* input field']")
    protected WebElement cityInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='State/Region input field']")
    protected WebElement stateRegionInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Zip Code* input field']")
    protected WebElement zipCodeInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Country* input field']")
    protected WebElement countryInputField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='To Payment button']/android.widget.TextView")
    protected WebElement toPaymentButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Full Name* input field' and @text='Rebecca Winter']")
    protected WebElement cardFullNameInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Card Number* input field']")
    protected WebElement cardNumberInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Expiration Date* input field']")
    protected WebElement expirationDateInputField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Security Code* input field']")
    protected WebElement securityCodeInputField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='checkbox for My billing address is the same as my shipping address.']//android.view.ViewGroup//android.widget.ImageView")
    protected WebElement myBillingAddressIsTheSameAsMyShippingAddressCheck;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Review Order button']/android.widget.TextView")
    protected WebElement reviewOrderButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Place Order button']")
    protected WebElement placeOrderButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Checkout Complete')]")
    protected WebElement checkoutCompleteLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Full Name*-error-message']//android.widget.TextView")
    protected WebElement pleaseProvideYourFullnameLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Address Line 1*-error-message']//android.widget.TextView")
    protected WebElement pleaseProvideYourAddressLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='City*-error-message']//android.widget.TextView")
    protected WebElement pleaseProvideYourCityLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Zip Code*-error-message']//android.widget.TextView")
    protected WebElement pleaseProvideYourZipCodeLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Country*-error-message']//android.widget.TextView")
    protected WebElement pleaseProvideYourCountryLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Full Name*-error-message']//android.widget.TextView")
    protected WebElement fullNameInvalidLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Card Number*-error-message']//android.widget.TextView")
    protected WebElement cardNumberInvalidLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Expiration Date*-error-message']//android.widget.TextView")
    protected WebElement expirationDateInvalidLabel;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Security Code*-error-message']/android.widget.TextView")
    protected WebElement securityCodeInputInvalidLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Security Code*')]")
    protected WebElement cardLabelWorkAround;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='Full Name* input field' and @text='Rebecca Winter']")
    protected WebElement fullNameReviewOrder;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void preencherFullNameInputField(String nome){
        waitFor(fullNameInputField);
        fullNameInputField.sendKeys(nome);
        closeKeyBoardAndroid();
    }

    public void preencherAddressLineOneInputField(String endereco){
        waitFor(addressLineOneInputField);
        addressLineOneInputField.sendKeys(endereco);
        closeKeyBoardAndroid();
    }

    public void preencherAddressLineTwoInputField(String endereco){
        waitFor(addressLineTwoInputField);
        addressLineTwoInputField.sendKeys(endereco);
        closeKeyBoardAndroid();
    }

    public void preencherCityInputField(String cidade){
        waitFor(cityInputField);
        cityInputField.sendKeys(cidade);
        closeKeyBoardAndroid();
    }

    public void preencherStateRegionInputField(String estado){
        waitFor(stateRegionInputField);
        stateRegionInputField.sendKeys(estado);
        closeKeyBoardAndroid();
    }

    public void preencherZipCodeInputField(String cep){
        waitFor(zipCodeInputField);
        zipCodeInputField.sendKeys(cep);
        closeKeyBoardAndroid();
    }

    public void preencherCountryInputField(String pais){
        waitFor(countryInputField);
        countryInputField.sendKeys(pais);
        closeKeyBoardAndroid();
    }

    public void clicarToPaymentButton(){
        waitFor(toPaymentButton);
        toPaymentButton.click();
    }

    public void preencherCardFullNameInputField(String nome){
        waitFor(cardFullNameInputField);
        cardFullNameInputField.sendKeys(nome);
        closeKeyBoardAndroid();
    }

    public void preencherCardNumberInputField(String numeroCartao){
        cardNumberInputField.sendKeys(numeroCartao);
        closeKeyBoardAndroid();
    }

    public void preencherExpirationDateInputField(String dataVencimentoCartao){
        expirationDateInputField.sendKeys(dataVencimentoCartao);
        closeKeyBoardAndroid();
    }

    public void preencherSecurityCodeInputField(String securityCode){
        securityCodeInputField.sendKeys(securityCode);
        closeKeyBoardAndroid();
    }

    public void clicarMyBillingAddressIsTheSameAsMyShippingAddressCheck(){
        myBillingAddressIsTheSameAsMyShippingAddressCheck.click();
        scrollSwipeToEnd();
    }

    public void clicarReviewOrderButton(){
        waitFor(reviewOrderButton);
        reviewOrderButton.click();
    }

    public void clicarPlaceOrderButton(){
        waitFor(placeOrderButton);
        placeOrderButton.click();
    }

    public String retornaTextoCheckoutCompleteLabel(){
        return checkoutCompleteLabel.getText();
    }

    public String retornaTextoPleaseProvideYourFullnameLabel(){
        return pleaseProvideYourFullnameLabel.getText();
    }

    public String retornaTextoPleaseProvideYourAddressLabel(){
        return pleaseProvideYourAddressLabel.getText();
    }

    public String retornaTextoPleaseProvideYourCityLabel(){
        return pleaseProvideYourCityLabel.getText();
    }

    public String retornaTextoPleaseProvideYourZipCodeLabel(){
        return pleaseProvideYourZipCodeLabel.getText();
    }

    public String retornaTextoPleaseProvideYourCountryLabel(){
        return pleaseProvideYourCountryLabel.getText();
    }

    public String retornaTextoFullNameInvalidLabel(){
        return fullNameInvalidLabel.getText();
    }

    public String retornaTextoCardNumberInvalidLabel(){
        return cardNumberInvalidLabel.getText();
    }

    public String retornaTextoExpirationDateInvalidLabel(){
        return expirationDateInvalidLabel.getText();
    }

    public String retornaTextoSecurityCodeInputInvalidLabel(){
        return securityCodeInputInvalidLabel.getText();
    }

    public void clicarCardLabelWorkAround(){
        cardLabelWorkAround.click();
    }

    public void preencherFullNameReviewOrder(String fullName){
        fullNameReviewOrder.sendKeys(fullName);
    }

}
