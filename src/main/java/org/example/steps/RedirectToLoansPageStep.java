package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.HomePage;

public class RedirectToLoansPageStep {
    HomePage homePage;

    public RedirectToLoansPageStep(Page page) {
        this.homePage = new HomePage(page);
    }

    public RedirectToLoansPageStep openLoansPage(){
        homePage.toLoans.click();
        return this;
    }

}