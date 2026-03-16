package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.HomePage;
import org.example.page.TbcBankLoansPage;

public class RedirectToLoansPage {
    HomePage homePage;

    public RedirectToLoansPage(Page page) {
        this.homePage = new HomePage(page);
    }
    public RedirectToLoansPage openLoansPage(){
        HomePage.toLoans.click();
        return this;
    }

}