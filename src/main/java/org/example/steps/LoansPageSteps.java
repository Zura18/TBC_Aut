package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.TbcBankLoansPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class LoansPageSteps {
    TbcBankLoansPage loansPage;

    public LoansPageSteps(Page page) {
        this.loansPage = new TbcBankLoansPage(page);
    }

    public LoansPageSteps loansPageContentVisibility() {
        assertThat(loansPage.productsGroup).isVisible();
        return this;
    }

    public LoansPageSteps requestLoan(){
        loansPage.requestLoan.nth(0).click();
        return this;
    }



}