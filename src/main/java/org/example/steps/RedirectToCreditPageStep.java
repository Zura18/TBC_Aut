package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.TbcBankLoansPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class RedirectToCreditPageStep {
    TbcBankLoansPage loansPage;

    public RedirectToCreditPageStep(Page page) {
        this.loansPage = new TbcBankLoansPage(page);
    }

    public RedirectToCreditPageStep loansPageContentVisibility() {
        assertThat(loansPage.productsGroup).isVisible();
        return this;
    }

    public RedirectToCreditPageStep requestLoan(){
        loansPage.requestLoan.nth(0).click();
        return this;
    }



}