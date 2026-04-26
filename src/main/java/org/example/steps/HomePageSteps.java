package org.example.steps;

import com.microsoft.playwright.Page;
import org.example.page.HomePage;

public class HomePageSteps {
    HomePage homePage;

    public HomePageSteps(Page page) {
        this.homePage = new HomePage(page);
    }

    public HomePageSteps openLoansPage(){
        homePage.toLoans.click();
        return this;
    }
    public HomePageSteps openBurgerMenu(){
        homePage.burgerMenu.click();
        return this;
    }
    public HomePageSteps openAddress(){
        homePage.addressButton.click();
        return this;
    }

}