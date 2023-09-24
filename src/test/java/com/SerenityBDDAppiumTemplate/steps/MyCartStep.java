package com.SerenityBDDAppiumTemplate.steps;

import com.SerenityBDDAppiumTemplate.pages.MyCartPage;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyCartStep extends ScenarioSteps {

    MyCartPage myCartPage;

    @Step("clicar excluir item")
    public void clicarExcluirItem(){
        myCartPage.excluirItemButton();
    }

    @Step("retorna se carrinho vazio e visivel")
    public String retornaTextoSeCarrinhoVazioLabel(){
        return myCartPage.retornaTextoSeCarrinhoVazioLabel();
    }

    @Step("excluir todos os itens do carrinho")
    public void excluirTodosOsItensDoCarrinho(){
        myCartPage.excluirTodosOsItensDoCarrinho();
    }

    @Step("clicar proceed to checkout button")
    public void clicarProceedToCheckoutButton(){
        myCartPage.clicarProceedToCheckoutButton();
    }
}
