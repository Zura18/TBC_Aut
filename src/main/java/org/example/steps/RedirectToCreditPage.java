package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.TbcBankLoansPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class RedirectToCreditPage {
    TbcBankLoansPage loansPage;

    public RedirectToCreditPage(Page page) {

        this.loansPage = new TbcBankLoansPage(page);
    }


    public RedirectToCreditPage requestLoan(){
        TbcBankLoansPage.requestLoan.nth(0).click();
        return this;
    }



//    public LoansStep checkLoanLinkValidity(){
//    //PAge newPage = page.waitForPopip(())
//    }


}